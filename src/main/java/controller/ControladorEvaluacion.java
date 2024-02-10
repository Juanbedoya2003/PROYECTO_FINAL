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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.EvaluacionDAO;
import modeloDTO.Evaluacion;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorEvaluacion extends HttpServlet {

    EvaluacionDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new EvaluacionDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEvaluacion.class.getName()).log(Level.SEVERE, null, ex);;
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
            out.println("<title>Servlet ControladorEvaluacion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorEvaluacion at " + request.getContextPath() + "</h1>");
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
        String periododesde, periodohasta, nominstitucion, puntaje, calificacion, observacion;
        int fkdocente;
        int idUpdate;
        String ev;//estas variables se usaran para recibir los datos 
        //zona de captura de datos
        periododesde = request.getParameter("dtPeriododesde");
        periodohasta = request.getParameter("dtPeriodohasta");//con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        nominstitucion = request.getParameter("txtNombreinstitucion");
        puntaje = request.getParameter("txtPuntaje"); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        calificacion = request.getParameter("txtCalificacion");
        observacion = request.getParameter("txtObservacion");
        fkdocente = Integer.parseInt(request.getParameter("intFkdocente"));
        
        // Verificación de existencia de cedulaDocente en la solicitud
        String idParam = request.getParameter("idUpdate");
        if (idParam != null && !idParam.isEmpty()) {
            idUpdate = Integer.parseInt(idParam);
        } else {
            idUpdate = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }
        
        ev = request.getParameter("evaluacion");
        

        Evaluacion objev = new Evaluacion(0, periododesde, periodohasta, nominstitucion, puntaje, calificacion, observacion ,fkdocente);

        if (ev.equalsIgnoreCase("Agregar")) {

            if (test.registrar(objev)) {

                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }
        }
         if (ev.equalsIgnoreCase("Actualizar")) {
           Evaluacion objact = new Evaluacion(idUpdate, periododesde, periodohasta, nominstitucion, puntaje, calificacion, observacion ,fkdocente);


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
        RequestDispatcher objretorno = request.getRequestDispatcher("Evaluacion.jsp");
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
