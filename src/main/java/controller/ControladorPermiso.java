/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.PermisoDAO;
import modeloDTO.Permiso;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorPermiso extends HttpServlet {

    PermisoDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new PermisoDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorPermiso.class.getName()).log(Level.SEVERE, null, ex);;
            mensaje = "Error de conexion";
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorPermiso</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorPermiso at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String motivo, fechaInicio, fechaFin, horainicio, horafin, observacion, estado;
        Double totalhoras, cantdescontar;
        int diassolicita, horassolicitadas, fkdocente;
        int idUpdate;
        String pe;//estas variables se usaran para recibir los datos

        //zona de captura de datos
        motivo = request.getParameter("txtMotivo");
        fechaInicio = request.getParameter("tsFechaInicio");//con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        fechaFin = request.getParameter("tsFechaFin");
        diassolicita = Integer.parseInt(request.getParameter("tsDiasSolicita")); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        horassolicitadas = Integer.parseInt(request.getParameter("tsHoraSolicita")); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        horainicio = request.getParameter("horainicio");
        horafin = request.getParameter("horafin");
        cantdescontar = Double.parseDouble(request.getParameter("nbCantidadDescontar"));
        observacion = request.getParameter("txtObservacion");
        estado = request.getParameter("txtEstado");
        fkdocente = Integer.parseInt(request.getParameter("intFkdocente"));
        String tsDiasSolicitaParam = request.getParameter("tsDiasSolicita");
        String tsHoraSolicitaParam = request.getParameter("tsHoraSolicita");
        String nbCantidadDescontarParam = request.getParameter("nbCantidadDescontar");

        diassolicita = (tsDiasSolicitaParam != null && !tsDiasSolicitaParam.isEmpty()) ? Integer.parseInt(tsDiasSolicitaParam) : 0;
        horassolicitadas = (tsHoraSolicitaParam != null && !tsHoraSolicitaParam.isEmpty()) ? Integer.parseInt(tsHoraSolicitaParam) : 0;
        cantdescontar = (nbCantidadDescontarParam != null && !nbCantidadDescontarParam.isEmpty()) ? Double.parseDouble(nbCantidadDescontarParam) : 0;

        // Verificación de existencia de cedulaDocente en la solicitud
        String idParam = request.getParameter("idUpdate");
        if (idParam != null && !idParam.isEmpty()) {
            idUpdate = Integer.parseInt(idParam);
        } else {
            idUpdate = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }

        pe = request.getParameter("permiso");

        if (pe.equalsIgnoreCase("Agregar")) {
            // Calcular días y horas
            LocalDateTime inicio = LocalDateTime.parse(fechaInicio + "T" + horainicio + ":00");
            LocalDateTime fin = LocalDateTime.parse(fechaFin + "T" + horafin + ":00");

            long diasDiferencia = ChronoUnit.DAYS.between(inicio.toLocalDate(), fin.toLocalDate());
            long horasDiferencia = ChronoUnit.HOURS.between(inicio, fin);

            Permiso objpe = new Permiso(0, motivo, fechaInicio, fechaFin, (int) diasDiferencia, (int) horasDiferencia,
                    horainicio, horafin, cantdescontar, observacion, estado, fkdocente);
            // Obtener el valor de días solicitados desde el formulario
           

                // Calcular la cantidad a descontar
            double cantidadDescontar = calcularCantidadDescontar(diassolicita);
            request.setAttribute("cantidadDescontar", cantidadDescontar); // Nueva línea

            // Establecer la cantidad a descontar en el objeto Permiso
            objpe.setCantidadDescontar(cantidadDescontar);
            if (test.registrar(objpe)) {

                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }
        }
        if (pe.equalsIgnoreCase("Actualizar")) {
            // Calcular días y horas
            LocalDateTime inicio = LocalDateTime.parse(fechaInicio + "T" + horainicio + ":00");
            LocalDateTime fin = LocalDateTime.parse(fechaFin + "T" + horafin + ":00");

            long diasDiferencia = ChronoUnit.DAYS.between(inicio.toLocalDate(), fin.toLocalDate());
            long horasDiferencia = ChronoUnit.HOURS.between(inicio, fin);

            Permiso objact = new Permiso(idUpdate, motivo, fechaInicio, fechaFin, (int) diasDiferencia, (int) horasDiferencia,
                    horainicio, horafin, cantdescontar, observacion, estado, fkdocente);

            if (test.EditarTODO(objact)) {

                mensaje = "Registro Actualizado";
            } else {
                mensaje = "Error al actualizar el registro";

                // Verificar si el registro no se encuentra
                if (!test.existeRegistro(objact.getId())) {
                    mensaje = "Registro no encontrado";
                }
            }
        }
        
        request.setAttribute("cajitamensajebase", mensaje);
        RequestDispatcher objretorno = request.getRequestDispatcher("Permisos.jsp");
        objretorno.forward(request, response);
        
    }
    // Método para calcular la cantidad a descontar

    private double calcularCantidadDescontar(int diasSolicitados) {
        // Definir el número total de días de vacaciones en un periodo de 30 días
        int totalDiasVacaciones = 30;

        // Definir el número de días laborables en un mes (22 días hábiles)
        int diasLaborables = 22;

        // Calcular el tiempo laboral solicitado
        double tiempoSolicitado = (double) diasSolicitados / diasLaborables;

        // Si se han trabajado 11 meses o más, aplicar el factor de 1,36363636363636
        if (seHananTrabajado11MesesOMas()) {
            return tiempoSolicitado * 1.36363636363636;
        } else {
            // Si no se han trabajado 11 meses, no se aplica el factor
            return tiempoSolicitado;
        }
    }

// Método para determinar si se han trabajado 11 meses o más
    private boolean seHananTrabajado11MesesOMas() {
        // Lógica para determinar si se han trabajado 11 meses o más
        // Puedes implementar tu propia lógica aquí, por ejemplo, contar el número de meses trabajados
        // y compararlo con 11.
        // Si has implementado la lógica de meses trabajados, devolver true si son 11 o más, de lo contrario, devolver false.
        // En este ejemplo, devolveré true siempre para demostrar el concepto.
        return true;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
