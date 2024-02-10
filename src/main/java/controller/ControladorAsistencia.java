/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.AsistenciaDAO;
import modeloDTO.Asistencia;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorAsistencia extends HttpServlet {

    AsistenciaDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new AsistenciaDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAsistencia.class.getName()).log(Level.SEVERE, null, ex);;
            mensaje = "Error de conexion";
        }
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAsistencia</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAsistencia at " + request.getContextPath() + "</h1>");
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
        String observacion, estado, asistenciafecha, horaentrada, horasalida, horastrabajadas;
        int fkdocente;
        int idUpdate;
        String as;//estas variables se usaran para recibir los datos 

        //zona de captura de datos
        asistenciafecha = request.getParameter("dtAsistencia");
        horaentrada = request.getParameter("tmHoraEntrada");//con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        horasalida = request.getParameter("tmHoraSalida");
        horastrabajadas = request.getParameter("tmHorasTrabajadas");
        observacion = request.getParameter("txtObservacion"); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        estado = request.getParameter("txtEstado");
        fkdocente = Integer.parseInt(request.getParameter("intFkdocente"));
        String horaEntradaStr = request.getParameter("tmHoraEntrada");
        String horaSalidaStr = request.getParameter("tmHoraSalida");
        

        // Convierte las cadenas a objetos LocalTime
        LocalTime horaEntrada = LocalTime.parse(horaEntradaStr);
        LocalTime horaSalida = LocalTime.parse(horaSalidaStr);

        // Calcula las horas trabajadas
        Duration duracionTrabajo = Duration.between(horaEntrada, horaSalida);
        long horasTrabajadas = duracionTrabajo.toHours();
        request.setAttribute("horasTrabajadas", horasTrabajadas);

        // Verificación de existencia de cedulaDocente en la solicitud
        String idParam = request.getParameter("idUpdate");
        if (idParam != null && !idParam.isEmpty()) {
            idUpdate = Integer.parseInt(idParam);
        } else {
            idUpdate = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }

        as = request.getParameter("asistencia");

        Asistencia objas = new Asistencia(0, asistenciafecha, horaentrada, horasalida, String.valueOf(horasTrabajadas), observacion, estado, fkdocente);

        if (as.equalsIgnoreCase("Agregar")) {

            if (test.registrar(objas)) {
                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }

        }
        if (as.equalsIgnoreCase("Actualizar")) {
            Asistencia objact = new Asistencia(idUpdate, asistenciafecha, horaentrada, horasalida, horastrabajadas,
                    observacion, estado, fkdocente);

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
        RequestDispatcher objretorno = request.getRequestDispatcher("Asistencia.jsp");
        objretorno.forward(request, response);

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
