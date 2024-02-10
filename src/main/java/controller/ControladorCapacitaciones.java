/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.CapacitacionesDAO;
import modeloDTO.Capacitaciones;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorCapacitaciones extends HttpServlet {

    CapacitacionesDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new CapacitacionesDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCapacitaciones.class.getName()).log(Level.SEVERE, null, ex);;
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
            out.println("<title>Servlet ControladorCapacitaciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorCapacitaciones at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
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

        String nombre, tipo, auspiciante, aprobadodesaprobado, pais, institucionaprueba, fechahorainicia, fechahorafinaliza;
        int duracion, fkdocente;
        String ca;//estas variables se usaran para recibir los datos 
        int idUpdate;

        //zona de captura de datos
        nombre = request.getParameter("txtNomcapacitacion");
        tipo = request.getParameter("txtTipo");
        auspiciante = request.getParameter("txtAuspiciante");
        duracion = Integer.parseInt(request.getParameter("txtHoras"));
        aprobadodesaprobado = request.getParameter("txtAprobadodesaprobado");
        pais = request.getParameter("txtPais");
        institucionaprueba = request.getParameter("txtInstitucion");
        fechahorainicia = request.getParameter("dtFechahorainicio");
        fechahorafinaliza = request.getParameter("dtFechahorafin");
        fkdocente = Integer.parseInt(request.getParameter("intFkdocente"));
        
        
        // Verificación de existencia de cedulaDocente en la solicitud
        String idParam = request.getParameter("idUpdate");
        if (idParam != null && !idParam.isEmpty()) {
            idUpdate = Integer.parseInt(idParam);
        } else {
            idUpdate = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }

        ca = request.getParameter("capacitacion");

        Capacitaciones objca = new Capacitaciones(0, nombre, tipo, auspiciante, duracion,
                aprobadodesaprobado, pais, institucionaprueba, fechahorainicia, fechahorafinaliza, fkdocente);

        if (ca.equalsIgnoreCase("Agregar")) {
            if (test.registrarCapacitacion(objca)) {

                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }
        }
        if (ca.equalsIgnoreCase("Actualizar")) {
            Capacitaciones objact = new Capacitaciones(idUpdate, nombre, tipo, auspiciante, duracion,
                    aprobadodesaprobado, pais, institucionaprueba, fechahorainicia, fechahorafinaliza, fkdocente);

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
        RequestDispatcher objretorno = request.getRequestDispatcher("Capacitaciones.jsp");
        objretorno.forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
