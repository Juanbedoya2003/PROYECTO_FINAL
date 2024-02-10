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
import java.time.Duration;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.HojaRutaDAO;
import modeloDTO.HojaRuta;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorHojaRuta extends HttpServlet {

    HojaRutaDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new HojaRutaDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorHojaRuta.class.getName()).log(Level.SEVERE, null, ex);;
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
            out.println("<title>Servlet ControladorHojaRuta</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorHojaRuta at " + request.getContextPath() + "</h1>");
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
        // processRequest(request, response);
        String fechainicia, horainicia, horafinaliza, observacionvacacion, estado;
        int fkdocente;
        int idUpdate;
        
        String ho;//estas variables se usaran para recibir los datos

        //zona de captura de datos
        fechainicia = request.getParameter("tsFechahorainicia");//con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        horainicia = request.getParameter("txtHoraInicia"); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        horafinaliza = request.getParameter("txtHoraFinaliza");
        
        observacionvacacion = request.getParameter("txtObservacion");
        estado = request.getParameter("txtEstado");
        fkdocente = Integer.parseInt(request.getParameter("intFkdocente"));

        String horaIniciaStr = request.getParameter("txtHoraInicia");
        String horaFinalizaStr = request.getParameter("txtHoraFinaliza");

        String horatotalStr = request.getParameter("txtHoraTotal");
        Double horatotal = null;

        if (horatotalStr != null && !horatotalStr.isEmpty()) {
            horatotal = Double.parseDouble(horatotalStr);
        } else {
            // Manejar el caso en el que la cadena esté vacía o nula
            // Por ejemplo, asignar un valor predeterminado o mostrar un mensaje de error
            System.err.println("La cadena es vacía o nula.");
            // Puedes asignar un valor predeterminado
            horatotal = 0.0; // O cualquier otro valor predeterminado que consideres adecuado
        }

        // Convierte las cadenas a objetos LocalTime
        LocalTime horaInicia = LocalTime.parse(horaIniciaStr);
        LocalTime horaFinaliza = LocalTime.parse(horaFinalizaStr);

        // Calcula las horas que se ausenta
        Duration duracionAusencia = Duration.between(horaInicia, horaFinaliza);
        long horasAusencia = duracionAusencia.toHours();
        request.setAttribute("horasAusencia", horasAusencia);

        // Verificación de existencia de cedulaDocente en la solicitud
        String idParam = request.getParameter("idUpdate");
        if (idParam != null && !idParam.isEmpty()) {
            idUpdate = Integer.parseInt(idParam);
        } else {
            idUpdate = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }

        ho = request.getParameter("hojaruta");

        HojaRuta objho = new HojaRuta(0, fechainicia, horainicia, horafinaliza, Double.valueOf(horasAusencia), observacionvacacion, estado, fkdocente);

        if (ho.equalsIgnoreCase("Agregar")) {

            if (test.registrar(objho)) {

                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }
        }
        if (ho.equalsIgnoreCase("Actualizar")) {
            HojaRuta objact = new HojaRuta(idUpdate, fechainicia, horainicia, horafinaliza, horatotal,
                    observacionvacacion, estado, fkdocente);

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
        RequestDispatcher objretorno = request.getRequestDispatcher("HojaRuta.jsp");
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
