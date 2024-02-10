<%-- 
    Document   : ReporteDocente
    Created on : 26/01/2024, 23:39:55
    Author     : Juan Bedoya
--%>


<%@page import="java.util.List"%>
<%@page import="modeloDTO.Docente"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-18">

            <div class="card-body"> 
                <form action="ControladorReporteDocente" method="post" class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="txtbusqueda" class="form-label">Cedula del docente</label>
                            <div class="input-group">
                                <input name="txtbusqueda" type="text" class="form-control" id="txtbusqueda">
                                <div class="input-group-append">
                                    <input name="docente" type="submit" class="btn btn-outline-primary" value="Buscar">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="deleteId" class="form-label">Cedula</label>
                            <div class="input-group">
                                <input name="deleteId" type="text" class="form-control" id="deleteId">
                                <div class="input-group-append">
                                    <input name="docente" type="submit" class="btn btn-outline-danger" value="Eliminar">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-12 text-center">
                        <input name="docente" type="submit" class="btn btn-outline-primary" value="Reporte">
                        <a href="Docente.jsp" class="btn btn-light text-dark border-dark">EDITAR</a>

                    </div>

                    <%                                
                              if (request.getAttribute("cajitaeliminar") != null) {
                                    out.println(request.getAttribute("cajitaeliminar"));
                              }
                    %>
                </form>

                <div class="col-sm-18">
                    <table class="table table-hover">
                        <thead>
                            <tr>

                                <th>CEDULA</th>
                                <th>NACIONALIDAD</th>
                                <th>APELLIDOS</th>
                                <th>NOMBRES</th>     
                                <th>FECHA NACI.</th>                                    
                                <th>TIPO SANGRE</th>
                                <th>GENERO</th>
                                <th>CORREO</th>
                                <th>ESTADO CIVIL</th>
                                <th>TELEFONO DOMICILIO</th>
                                <th>TELEFON CELULAR</th>
                                <th>FECHA BIENES</th>
                                <th>FECHA SERVICIO</th>
                                <th>PROVINCIA</th>
                                <th>CANTON</th>
                                <th>PARROQUIA</th>
                                <th>CALLE PRINC</th>
                                <th>CALLE SECUNDA</th>
                                <th>#CALLE PRINC</th>
                                <th>#CALLE SECUNDA</th>
                                <th>ETNIA</th>
                                <th>ESTADO</th>
                                <th>USER</th>
                                <th>ACCIONES</th>



                            </tr>
                        </thead>
                        <!---   ITERAR SOBRE LOS DATOS Y MOSTRAR CADA FILA EN ORDEN --->
                        <% 
                            //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                            if (request.getAttribute("cajitareportebd") !=null) {
                                List<Docente> arrCapas = (List<Docente>) request.getAttribute("cajitareportebd");
                                for (Docente capas : arrCapas){          
                        
                         
                        %>

                        <tr onclick="redirectToDocente('<%= capas.getCedula()%>')">
                        <tr>
                            <td><%= capas.getCedula()%></td>
                            <td><%= capas.getNacionalidad()%></td>
                            <td><%= capas.getApellidos()%></td>
                            <td><%= capas.getNombres()%></td>         
                            <td><%= capas.getFechaNac()%></td>
                            <td><%= capas.getTipoSangre()%></td>
                            <td><%= capas.getGenero()%></td>
                            <td><%= capas.getCorreo()%></td>
                            <td><%= capas.getEstadocivil()%></td>
                            <td><%= capas.getTelefonodomicilio()%></td>
                            <td><%= capas.getTelefonocelular() %></td>
                            <td><%= capas.getFechadeclaraciones()%></td>
                            <td><%= capas.getFechaantecedentes()%></td>
                            <td><%= capas.getProvincia()%></td>
                            <td><%= capas.getCanton()%></td>
                            <td><%= capas.getParroquia()%></td>
                            <td><%= capas.getCalleprincipal()%></td>
                            <td><%= capas.getCallesecundaria()%></td>
                            <td><%= capas.getNumcalleprincipal()%></td>
                            <td><%= capas.getNumcallesecundaria()%></td>
                            <td><%= capas.getEtnia()%></td>
                            <td><%= capas.getEstado()%></td>
                            <td><%= capas.getUser()%></td>
                            <td>
                                <!-- Agrega un botón de edición con un ícono de lápiz y datos asociados a cada fila -->
                                <a href="Docente.jsp?intCedula=<%=capas.getCedula()%>&txtNacionalidad=<%=capas.getNacionalidad()%>
                                   &txtApellidos=<%=capas.getApellidos()%>&txtNombres=<%=capas.getNombres() %>
                                   &dateFechaNacimiento=<%=capas.getFechaNac()%>&txtTipoSangre=<%=capas.getTipoSangre()%>
                                   &txtGenero=<%=capas.getGenero()%>&txtCorreo=<%= capas.getCorreo()%>
                                   &txtEstadoCivil=<%=capas.getEstadocivil()%>&nbTelefonoDomicilio=<%=capas.getTelefonodomicilio()%>
                                   &nbTelefonoCelular=<%=capas.getTelefonocelular()%>&dtDeclaraciones=<%=capas.getFechadeclaraciones()%>
                                   &dtAntecedentes=<%=capas.getFechaantecedentes()%>&txtProvincia=<%=capas.getProvincia()%>
                                   &txtCanton=<%=capas.getCanton()%>&txtParroquia=<%= capas.getParroquia()%>
                                   &txtCallePrincipal=<%=capas.getCalleprincipal()%>&txtCalleSecundaria=<%=capas.getCallesecundaria()%>
                                   &txtNumCallePrincipal=<%=capas.getNumcalleprincipal()%>&txtNumCalleSecundaria=<%=capas.getNumcallesecundaria()%>
                                   &txtNumCalleSecundaria=<%=capas.getEtnia()%>&txtEstado=<%=capas.getEstado()%>
                                   &txtUser=<%=capas.getUser()%>"
                                   class="btn btn-dark btn-sm">                                    
                                    Editar
                                </a>
                            </td>



                        </tr>

                        <%
                                             }
                                      }
                        %>

                        <% 
                           //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                           if (request.getAttribute("cajitareportebduno") !=null) {
                               List<Docente> arrCapas = (List<Docente>) request.getAttribute("cajitareportebduno");
                               for (Docente capas : arrCapas){          
                        %>
                        <tr>
                            <td><%= capas.getCedula()%></td>
                            <td><%= capas.getNacionalidad()%></td>
                            <td><%= capas.getApellidos()%></td>
                            <td><%= capas.getNombres()%></td>         
                            <td><%= capas.getFechaNac()%></td>
                            <td><%= capas.getTipoSangre()%></td>
                            <td><%= capas.getGenero()%></td>
                            <td><%= capas.getCorreo()%></td>
                            <td><%= capas.getEstadocivil()%></td>
                            <td><%= capas.getTelefonodomicilio()%></td>
                            <td><%= capas.getTelefonocelular()%></td>
                            <td><%= capas.getFechadeclaraciones()%></td>
                            <td><%= capas.getFechaantecedentes()%></td>
                            <td><%= capas.getProvincia()%></td>
                            <td><%= capas.getCanton()%></td>
                            <td><%= capas.getParroquia()%></td>
                            <td><%=  capas.getCalleprincipal()%></td>
                            <td><%= capas.getCallesecundaria()%></td>
                            <td><%= capas.getNumcalleprincipal()%></td>
                            <td><%= capas.getNumcallesecundaria()%></td>
                            <td><%= capas.getEtnia()%></td>
                            <td><%= capas.getEstado()%></td>
                            <td><%= capas.getUser()%></td>
                            <td>
                                <!-- Agrega un botón de edición con un ícono de lápiz y datos asociados a cada fila -->
                                <a href="Docente.jsp?id=<%=capas.getCedula()%>&txtNacionalidad=<%=capas.getNacionalidad()%>
                                   &txtApellidos=<%=capas.getApellidos()%>&txtNombres=<%=capas.getNombres() %>
                                   &dateFechaNacimiento=<%=capas.getFechaNac()%>&txtTipoSangre=<%=capas.getTipoSangre()%>
                                   &txtGenero=<%=capas.getGenero()%>&txtCorreo=<%= capas.getCorreo()%>
                                   &txtEstadoCivil=<%=capas.getEstadocivil()%>&nbTelefonoDomicilio=<%=capas.getTelefonodomicilio()%>
                                   &nbTelefonoCelular=<%=capas.getTelefonocelular()%>&dtDeclaraciones=<%=capas.getFechadeclaraciones()%>
                                   &dtAntecedentes=<%=capas.getFechaantecedentes()%>&txtProvincia=<%=capas.getProvincia()%>
                                   &txtCanton=<%=capas.getCanton()%>&txtParroquia=<%= capas.getParroquia()%>
                                   &txtCallePrincipal=<%=capas.getCalleprincipal()%>&txtCalleSecundaria=<%=capas.getCallesecundaria()%>
                                   &txtNumCallePrincipal=<%=capas.getNumcalleprincipal()%>&txtNumCalleSecundaria=<%=capas.getNumcallesecundaria()%>
                                   &txtNumCalleSecundaria=<%=capas.getEtnia()%>&txtEstado=<%=capas.getEstado()%>
                                   &txtUser=<%=capas.getUser()%>"
                                   class="btn btn-dark btn-sm">                                    
                                    Editar
                                </a>
                            </td>

                        </tr>

                        <%
                                           }
                                    }
                        %>

                </div>
            </div>
        </div>
    </body>
</html>