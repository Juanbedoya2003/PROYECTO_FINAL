/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
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
import javax.servlet.http.HttpSession;
import modeloDTO.Docente;
import modeloDAO.DocenteDAO;

/**
 *
 * @author Juan Bedoya
 */
public class Controlador extends HttpServlet {

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
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);;
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
        // processRequest(request, response);
        //DOCENTES:
        String nacionalidad, apellidos, nombres, fechanacimiento, tiposangre, genero, correo, estadocivil, telefonodomicilio, telefonocelular,
                fechadeclaraciones, fechaantecedentes, provincia, canton, parroquia, calleprincipal, callesecundaria, numcalleprincipal, numcallesecundaria, etnia, estado, user;
        int cedula, intCedula;

        String doc;//estas variables se usaran para recibir los datos 

        cedula = Integer.parseInt(request.getParameter("intCedula"));//con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        nacionalidad = request.getParameter("txtNacionalidad"); //con esta linea de codigo podemos recibir cualquier dato que venga de la vista
        apellidos = request.getParameter("txtApellidos");
        nombres = request.getParameter("txtNombres");
        fechanacimiento = request.getParameter("dateFechaNacimiento");
        tiposangre = request.getParameter("txtTipoSangre");
        genero = request.getParameter("txtGenero");
        correo = request.getParameter("txtCorreo");
        estadocivil = request.getParameter("txtEstadoCivil");
        telefonodomicilio = request.getParameter("nbTelefonoDomicilio");
        telefonocelular = request.getParameter("nbTelefonoCelular");
        fechadeclaraciones = request.getParameter("dtDeclaraciones");
        fechaantecedentes = request.getParameter("dtAntecedentes");
        provincia = request.getParameter("txtProvincia");
        canton = request.getParameter("txtCanton");
        parroquia = request.getParameter("txtParroquia");
        calleprincipal = request.getParameter("txtCallePrincipal");
        callesecundaria = request.getParameter("txtCalleSecundaria");
        numcalleprincipal = request.getParameter("txtNumCallePrincipal");
        numcallesecundaria = request.getParameter("txtNumCalleSecundaria");
        etnia = request.getParameter("txtEtnia");
        estado = request.getParameter("txtEstado");
        user = request.getParameter("txtUser");

        // Verificación de existencia de cedulaDocente en la solicitud
        String cedulaDocenteParam = request.getParameter("intCedula");
        if (cedulaDocenteParam != null && !cedulaDocenteParam.isEmpty()) {
          intCedula = Integer.parseInt(cedulaDocenteParam);
        } else {
           intCedula = 0; // O asigna el valor que desees para indicar que no se proporcionó un id
        }

        doc = request.getParameter("docente");

        Docente objdo = new Docente(cedula, nacionalidad, apellidos, nombres, fechanacimiento,
                tiposangre, genero, correo, estadocivil, telefonodomicilio, telefonocelular,
                fechadeclaraciones, fechaantecedentes, provincia, canton, parroquia, numcalleprincipal,
                calleprincipal, numcallesecundaria, callesecundaria, etnia, estado, user);

        if (doc.equalsIgnoreCase("Agregar")) {

            if (test.registrar(objdo)) {

                // dar la orden de insertar
                mensaje = "Datos insertados correctamente";
            } else {
                mensaje = "Error en la inserción de datos";
            }
        }
        if (doc.equalsIgnoreCase("Actualizar")) {
            Docente objact = new Docente(intCedula, nacionalidad, apellidos, nombres, fechanacimiento,
                    tiposangre, genero, correo, estadocivil, telefonodomicilio, telefonocelular,
                    fechadeclaraciones, fechaantecedentes, provincia, canton, parroquia, numcalleprincipal,
                    calleprincipal, numcallesecundaria, callesecundaria, etnia, estado, user);
            if (test.EditarTODO(objact)) {

                mensaje = "Registro Actualizado";
            } else {
                mensaje = "Error al actualizar el registro";

                // Verificar si el registro no se encuentra
                if (!test.existeRegistro(objact.getCedula())) {
                    mensaje = "Registro no encontrado";
                }
            }
        }
        
        
            
            request.setAttribute("cajitamensajebase", mensaje);
            RequestDispatcher objretorno = request.getRequestDispatcher("Docente.jsp");
            objretorno.forward(request, response);
        }

        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
