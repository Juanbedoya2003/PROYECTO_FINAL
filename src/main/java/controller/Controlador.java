/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan Bedoya
 */
public class Controlador extends HttpServlet {

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
             String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Docente")) {
            request.getRequestDispatcher("Docente.jsp").forward(request, response);
        }
        if (menu.equals("Asistencia")) {
            request.getRequestDispatcher("Asistencia.jsp").forward(request, response);
        }
        if (menu.equals("Permisos")) {
            request.getRequestDispatcher("Permisos.jsp").forward(request, response);
        }
        if (menu.equals("Vacaciones")) {
            request.getRequestDispatcher("Vacaciones.jsp").forward(request, response);
        }
        if (menu.equals("Discapacidad")) {
            request.getRequestDispatcher("Discapacidad.jsp").forward(request, response);
        }
        if (menu.equals("Evaluacion")) {
            request.getRequestDispatcher("Evaluacion.jsp").forward(request, response);
        }
        if (menu.equals("contactoEmergencia")) {
            request.getRequestDispatcher("contactoEmergencia.jsp").forward(request, response);
        }
        if (menu.equals("Capacitaciones")) {
            request.getRequestDispatcher("Capacitaciones.jsp").forward(request, response);
        }
        if (menu.equals("FormacionAcademica")) {
            request.getRequestDispatcher("FormacionAcademica.jsp").forward(request, response);
        }
        if (menu.equals("InclusionLaboral")) {
            request.getRequestDispatcher("InclusionLaboral.jsp").forward(request, response);
        }
        if (menu.equals("experienciaLaboral")) {
            request.getRequestDispatcher("experienciaLaboral.jsp").forward(request, response);
        }
        if (menu.equals("HojaRuta")) {
            request.getRequestDispatcher("HojaRuta.jsp").forward(request, response);
        }
        if (menu.equals("CuentaBancaria")) {
            request.getRequestDispatcher("CuentaBancaria.jsp").forward(request, response);
        }
        if (menu.equals("conyuge")) {
            request.getRequestDispatcher("conyuge.jsp").forward(request, response);
        }
        if (menu.equals("hijos")) {
            request.getRequestDispatcher("hijos.jsp").forward(request, response);
        }
        if (menu.equals("RegistrarAsistencia")) {
            request.getRequestDispatcher("RegistrarAsistencia.jsp").forward(request, response);
        }
        if (menu.equals("RegistrarPermiso")) {
            request.getRequestDispatcher("RegistrarPermiso.jsp").forward(request, response);
        }
        if (menu.equals("RegistrarVacaciones")) {
            request.getRequestDispatcher("RegistrarVacaciones.jsp").forward(request, response);
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
