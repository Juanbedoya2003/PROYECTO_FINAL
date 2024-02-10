/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.DocenteDAO;
import modeloDTO.Docente;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorReporteDocente extends HttpServlet {

    DocenteDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new DocenteDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorReporteDocente.class.getName()).log(Level.SEVERE, null, ex);;
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
            out.println("<title>Servlet ControladorReporteDocente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorReporteDocente at " + request.getContextPath() + "</h1>");
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

   int usuario_Cedula;
        int txteliminar;
        String doc;

        ArrayList<Docente> arrobj = new ArrayList();
        ArrayList<Docente> arrobjuno = new ArrayList();


                String vareliminar = request.getParameter("deleteId");
        if (vareliminar != null && !vareliminar.trim().isEmpty()) {
            try {
                usuario_Cedula = Integer.parseInt(vareliminar);
            } catch (NumberFormatException e) {
                // Manejar la excepción en caso de que el valor no sea un entero válido
                // Puedes mostrar un mensaje de error o realizar alguna otra acción
            }
        }
        
        String buscarcedula = request.getParameter("txtbusqueda");
        if (buscarcedula != null && !buscarcedula.trim().isEmpty()) {
            try {
                usuario_Cedula = Integer.parseInt(buscarcedula);
            } catch (NumberFormatException e) {
                // Manejar la excepción en caso de que el valor no sea un entero válido
                // Puedes mostrar un mensaje de error o realizar alguna otra acción
            }
        }
// Aquí continúa el resto de tu lógica, por ejemplo, las operaciones BUSQUEDA o FILTRAR

        doc = request.getParameter("docente");
        
              if (doc.equalsIgnoreCase("Eliminar")) {

            if (test.Eliminar(vareliminar)) {
                mensaje = "Registro eliminado correctamente";
            } else {
                mensaje = "Error al eliminar";

            }
        }

        if (doc.equalsIgnoreCase("Reporte")) {
            arrobj = test.SeleccionarTodo();
        }
        if (doc.equalsIgnoreCase("Buscar")) {
            arrobjuno = test.SeleccionarUno(buscarcedula);
        }
   
        //zona de devolucion de datos
        
        request.setAttribute("cajitaeliminar", mensaje);
        request.setAttribute("cajitareportebd", arrobj);
        request.setAttribute("cajitareportebduno", arrobjuno);
        
        RequestDispatcher objretorno = request.getRequestDispatcher("ReporteDocente.jsp");
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
