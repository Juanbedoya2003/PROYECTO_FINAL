/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Modelo.Ingresar;
import modeloDTO.Docente;
import modeloDAO.DocenteDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juan Bedoya
 */
public class ControladorValidar extends HttpServlet {
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
            Logger.getLogger(ControladorValidar.class.getName()).log(Level.SEVERE, null, ex);;
            mensaje = "Error de conexion";
        }
    }
    
   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
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
                   //zona de captura de datos
        String enteredUsername = request.getParameter("txtuser");
        String enteredPassword = request.getParameter("txtpass");

        HttpSession session = request.getSession();
        Ingresar login = (Ingresar) session.getAttribute("login");

        //zona de proceso de logeo
        if (login == null) {
            login = new Ingresar();
            session.setAttribute("login", login);
        }

        boolean isValid = login.validateCredentials(enteredUsername, enteredPassword);

        if (isValid) {
            // limpiamos los intentos
            login.resetAttempts();
            response.sendRedirect("Principal.jsp");
        } else {
            int remainingAttempts = login.getRemainingAttempts();

            //zona devolución de datos
            if (remainingAttempts > 0) {
                request.setAttribute("loginAttempts", "Intentos que te quedan: " + remainingAttempts);
            } else {
                request.setAttribute("loginAttempts", " Cuenta bloqueada vuelve mas tarde. ");
            }

            // Permanecemos en el mismo index.jsp
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

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
