<%-- 
    Document   : Docente
    Created on : 26/12/2023, 19:21:32
    Author     : Juan Bedoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="modeloDTO.Docente"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>DATOS DOCENTE</title>
    </head>
    <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var intCedula = obtenerParametroURL('cedulaDocente');
            var txtNacionalidad = obtenerParametroURL('docNacionalidad');
            var txtApellidos = obtenerParametroURL('docApellidos');
            var txtNombres = obtenerParametroURL('docNombres');
            var dateFechaNacimiento = obtenerParametroURL('docFechaNacimiento');
            var txtTipoSangre = obtenerParametroURL('docTipoSangre');
            var txtGenero = obtenerParametroURL('docGenero');
            var txtCorreo = obtenerParametroURL('docCorreo');
            var txtEstadoCivil = obtenerParametroURL('docEstadoCivil');
            var nbTelefonoDomicilio = obtenerParametroURL('docTelefonoDomicilio');
            var nbTelefonoCelular = obtenerParametroURL('docTelefonoCelular');
            var dtDeclaraciones = obtenerParametroURL('docFechaDeclaracionBienes');
            var dtAntecedentes = obtenerParametroURL('docFechaAntecedentesServPubl');
            var txtProvincia = obtenerParametroURL('docProvincia');
            var txtCanton = obtenerParametroURL('docCanton');
            var txtParroquia = obtenerParametroURL('docParroquia');
            var txtCallePrincipal = obtenerParametroURL('docCallePrincipal');
            var txtCalleSecundaria = obtenerParametroURL('docCalleSecundaria');
            var txtNumCallePrincipal = obtenerParametroURL('docCallePrincipalNumero');
            var txtNumCalleSecundaria = obtenerParametroURL('docCalleSecundariaNumero');
            var txtEtnia = obtenerParametroURL('docEtnia');
            var txtEstado = obtenerParametroURL('docEstado');
            var txtUser = obtenerParametroURL('docUser');

            document.getElementById('cedulaDocente').value = intCedula;
            document.getElementById('docNacionalidad').value = txtNacionalidad;
            document.getElementById('docApellidos').value = txtApellidos;
            document.getElementById('docNombres').value = txtNombres;
            document.getElementById('docFechaNacimiento').value = dateFechaNacimiento;
            document.getElementById('docTipoSangre').value = txtTipoSangre;
            document.getElementById('docGenero').value = txtGenero;
            document.getElementById('docCorreo').value = txtCorreo;
            document.getElementById('docEstadoCivil').value = txtEstadoCivil;
            document.getElementById('docTelefonoDomicilio').value = nbTelefonoDomicilio;
            document.getElementById('docTelefonoCelular').value = nbTelefonoCelular;
            document.getElementById('docFechaDeclaracionBienes').value = dtDeclaraciones;
            document.getElementById('docFechaAntecedentesServPubl').value = dtAntecedentes;
            document.getElementById('docProvincia').value = txtProvincia;
            document.getElementById('docCanton').value = txtCanton;
            document.getElementById('docParroquia').value = txtParroquia;
            document.getElementById('docCallePrincipal').value = txtCallePrincipal;
            document.getElementById('docCalleSecundaria').value = txtCalleSecundaria;
            document.getElementById('docCallePrincipalNumero').value = txtNumCallePrincipal;
            document.getElementById('docCalleSecundariaNumero').value = txtNumCalleSecundaria;
            document.getElementById('docEtnia').value = txtEtnia;
            document.getElementById('docEstado').value = txtEstado;
            document.getElementById('docUser').value = txtUser;



        }

        // Ejecutar la función después de que la página se haya cargado
        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>


    <body class="d-flex align-items-center justify-content-center" style="height: 100vh; background-color: #f8f9fa;">
        <div class="container mt-8">
            <div class="card mb-6">
                <div class="card-body"> 
                    <form action="Controlador" method="POST">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="form-group row">
                                    <label for="intCedula"  class="col-sm-5 col-form-label">Cedula</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="intCedula" class="form-control form-control-sm" id="intCedula">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtNacionalidad" class="col-sm-5 col-form-label">Nacion</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtNacionalidad" class="form-control form-control-sm" id="txtNacionalidad" >
                                    </div>
                                </div>
                                <div  class="form-group row">
                                    <label for="txtApellidos" class="col-sm-5 col-form-label">Apellidos</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtApellidos" class="form-control form-control-sm" id="txtApellidos">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtNombres" class="col-sm-5 col-form-label">Nombres</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtNombres" class="form-control form-control-sm" id="txtNombres">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="dateFechaNacimiento" class="col-sm-5 col-form-label">Fecha Nacimiento</label>
                                    <div class="col-sm-7">
                                        <input type="date"  name="dateFechaNacimiento" class="form-control form-control-sm" id="dateFechaNacimiento">
                                    </div>
                                </div> 
                                <div class="form-group row">
                                    <label for="txtTipoSangre" class="col-sm-5 col-form-label">Tipo Sangre</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtTipoSangre" class="form-control form-control-sm" id="txtTipoSangre">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label  for="txtGenero"class="col-sm-5 col-form-label">Genero</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtGenero" class="form-control form-control-sm" id="txtGenero">
                                            <option value="Masculino">Masculino</option>
                                            <option value="Femenino">Femenino</option>
                                        </select>
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-3">
                                <div class="form-group row">
                                    <label for="txtCorreo" class="col-sm-5 col-form-label">Correo</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtCorreo" class="form-control form-control-sm" id="txtCorreo" >
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtEstadoCivil" class="col-sm-5 col-form-label">Estado Civil</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="c" class="form-control form-control-sm"  id="txtEstadoCivil" >
                                            <option value="Soltero(a)">Soltero(a)</option>
                                            <option value="Casado(a)">Casado(a)</option>
                                            <option value="Viudo(a)">Viudo(a)</option>
                                            <option value="Divorciado(a)">Divorciado(a)</option>
                                            <option value="Separado(a)">Separado(a)</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="nbTelefonoDomicilio" class="col-sm-5 col-form-label">Telefono Domicilio</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="nbTelefonoDomicilio" class="form-control form-control-sm" id="nbTelefonoDomicilio">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="nbTelefonoCelular" class="col-sm-5 col-form-label">Telefono Celular</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="nbTelefonoCelular" class="form-control form-control-sm" id="nbTelefonoCelular">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="dtDeclaraciones" class="col-sm-5 col-form-label">Fecha Declaracion Bienes</label>
                                    <div class="col-sm-7">
                                        <input type="date"  name="dtDeclaraciones" class="form-control form-control-sm" id="dtDeclaraciones">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="dtAntecedentes" class="col-sm-5 col-form-label">Fecha Servicio Publico</label>
                                    <div class="col-sm-7">
                                        <input type="date"  name="dtAntecedentes" class="form-control form-control-sm" id="dtAntecedentes">
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-3">
                                <div class="form-group row">
                                    <label for="txtProvincia" class="col-sm-5 col-form-label">Provincia</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtProvincia" class="form-control form-control-sm" id="txtProvincia">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtCanton" class="col-sm-5 col-form-label">Canton</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtCanton" class="form-control form-control-sm" id="txtCanton">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtParroquia" class="col-sm-5 col-form-label">Parroquia</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtParroquia" class="form-control form-control-sm" id="txtParroquia">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtCallePrincipal" class="col-sm-5 col-form-label">Calle Principal:</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtCallePrincipal" class="form-control form-control-sm" id="txtCallePrincipal">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtCalleSecundaria" class="col-sm-5 col-form-label">Calle Secundaria:</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtCalleSecundaria" class="form-control form-control-sm" id="txtCalleSecundaria">
                                    </div>
                                </div>
                            </div>

                            <div class="col-md-3">
                                <div class="form-group row">
                                    <label for="txtEtnia" class="col-sm-5 col-form-label">Etnia</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtEtnia" class="form-control form-control-sm" id="txtEtnia">
                                            <option value="Mestizo">Mestizo</option>
                                            <option value="Indígena">Indígena</option>
                                            <option value="Afrodescendiente">Afrodescendiente</option>
                                            <option value="Blanco">Blanco</option>

                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtEstado" class="col-sm-5 col-form-label">Estado</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtEstado" class="form-control form-control-sm" id="txtEstado">
                                            <option value="Activo">Activo</option>
                                            <option value="Inactivo">Inactivo</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtUser" class="col-sm-5 col-form-label">User</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtUser" class="form-control form-control-sm" id="txtUser">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtNumCallePrincipal" class="col-sm-5 col-form-label">Num.Calle Principal:</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtNumCallePrincipal" class="form-control form-control-sm" id="txtNumCallePrincipal">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtNumCalleSecundaria" class="col-sm-5 col-form-label">Num.Calle Secundaria:</label>
                                    <div class="col-sm-7">
                                        <input type="text"  name="txtNumCalleSecundaria" class="form-control form-control-sm" id="txtNumCalleSecundaria">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12 mt-3 mr-auto">
                                        <input type="submit" name="docente" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="docente" value="Actualizar" class="btn btn-success">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <%
                            
                            if (request.getAttribute("cajitamensajebase") != null) {
                                out.println(request.getAttribute("cajitamensajebase"));
                            }
                           
                        %>
                    </form>
                </div>
            </div>
        </div>
   
    </body>
</html>