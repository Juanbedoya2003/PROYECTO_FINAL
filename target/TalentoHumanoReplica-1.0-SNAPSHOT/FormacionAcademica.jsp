<%-- 
    Document   : FormacionAcademica
    Created on : 03/01/2024, 18:13:33
    Author     : Juan Bedoya
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>FORMACION ACADEMICA</title>
    </head>
    <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idFormacionAcademica = obtenerParametroURL('id');
            var institucion = obtenerParametroURL('formInstitucionEducativa');
            var nivelInstruccion = obtenerParametroURL('formNivelInstruccion');
            var certificadoSenecyt = obtenerParametroURL('formNumeroCertificadoSenecyt');
            var aniosAprobados = obtenerParametroURL('formNumeroAniosAprobados');
            var areaConocimiento = obtenerParametroURL('formAreaConocimiento');
            var egresadoGraduado = obtenerParametroURL('formEgresadoGraduado');
            var titulo = obtenerParametroURL('formTituloObtenido');
            var pais = obtenerParametroURL('formPaisTituloObtenido');
            var cedula = obtenerParametroURL('docente_cedulaDocente');


            document.getElementById('idFormacionAcademica').value = idFormacionAcademica;
            document.getElementById('formInstitucionEducativa').value = institucion;
            document.getElementById('formNivelInstruccion').value = nivelInstruccion;
            document.getElementById('formNumeroCertificadoSenecyt').value = certificadoSenecyt;
            document.getElementById('formNumeroAniosAprobados').value =aniosAprobados;
            document.getElementById('formAreaConocimiento').value = areaConocimiento;
            document.getElementById('formEgresadoGraduado').value = egresadoGraduado;
            document.getElementById('formTituloObtenido').value = titulo;
            document.getElementById('formPaisTituloObtenido').value = pais;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>
    <body class="d-flex align-items-center justify-content-center" style="height: 60vh; background-color: #f8f9fa;">
        <div class="container mt-4">
            <div class="card mb-3">
                <div class="card-body">
                    <form action="ControladorFormacionAcademica" method="POST">
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Id Formacion Academica:</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="idUpdate" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Cedula  docente:</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="intFkdocente" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Institucion</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtInstitucioneducativa" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Nivel instrucción</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtNivelinstruccion">
                                            <option value="BACHILLERATO">BACHILLERATO</option>
                                            <option value="TERCER NIVEL">TERCER NIVEL</option>
                                            <option value="CUARTO NIVEL">CUARTO NIVEL</option>
                                        </select>
                                    </div>
                                </div>

                            </div>
                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Años Aprobados</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="intAniosaprobados" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Área</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtareaconocimiento" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Graduado </label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtGraduadoegresado">
                                            <option value="Egresado">Egresado</option>
                                            <option value="Graduado">Graduado</option>
                                        </select>
                                    </div>
                                </div>

                            </div>
                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Titulo Obtenido</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtTitulo" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">País del Título </label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtPais" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Certificado</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="intCertificadosenecyt" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12 text-center">
                                        <input type="submit" name="formacion" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="formacion" value="Actualizar" class="btn btn-success">
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

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


    </body>
</html>
