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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.CuentaBancariaDAO;
import modeloDTO.CuentaBancaria;


/**
 *
 * @author Juan Bedoya
 */
public class ControladorBanco extends HttpServlet {
    CuentaBancariaDAO test;
    String mensaje = "Error de conexion"; //variable para enviar mensaje hacia la vista

    // metodo para dar orden de abrir la conexion
    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL"); //extraigo el dato
        String jdbcUSERName = getServletContext().getInitParameter("jdbcUSERName"); //extraigo el dato
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword"); //extraigo el dato

        try {
            test = new CuentaBancariaDAO(jdbcURL, jdbcUSERName, jdbcPassword);
            mensaje = "Conexion establecida";
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBanco.class.getName()).log(Level.SEVERE, null, ex);;
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
            out.println("<title>Servlet ControladorBanco</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorBanco at " + request.getContextPath() + "</h1>");
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
         String  institucionFinanciera, tipocuenta, numerocuenta;
         int   fkdocentecedula;
         int idUpdate;
        String cu;//estas variables se usaran para recibir los datos 
        
        //zona de captura de datos
       
        institucionFinanciera = request.getParameter("txtInstitucion");//con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        tipocuenta = request.getParameter("txtTipo"); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        numerocuenta = request.getParameter("intNumcuenta");
        fkdocentecedula = Integer.parseInt(request.getParameter("intFkdocente"));
        
         // Verificación de existencia de cedulaDocente en la solicitud
        String idParam = request.getParameter("idUpdate");
        if (idParam != null && !idParam.isEmpty()) {
            idUpdate = Integer.parseInt(idParam);
        } else {
            idUpdate = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }
        cu = request.getParameter("cuenta");

        CuentaBancaria objcu = new CuentaBancaria  (0,  institucionFinanciera, tipocuenta, numerocuenta, fkdocentecedula);
        if (cu.equalsIgnoreCase("Agregar")) {
            if (test.registrar(objcu)) {
                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }
        }
        if (cu.equalsIgnoreCase("Actualizar")) {
            CuentaBancaria objact = new CuentaBancaria  (idUpdate,  institucionFinanciera, tipocuenta, numerocuenta, fkdocentecedula);

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
        RequestDispatcher objretorno = request.getRequestDispatcher("CuentaBancaria.jsp");
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
