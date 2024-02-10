<%-- 
    Document   : Discapacidad
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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.17.0/font/bootstrap-icons.css">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>DISCAPACIDAD ENFERMEDAD</title>
    </head>
    <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idDiscapacidad = obtenerParametroURL('id');
            var situacion = obtenerParametroURL('discSituacionDisc');
            var tipoRelacion = obtenerParametroURL('discTipoRelacionDisc');
            var numeroConadis = obtenerParametroURL('discNumeroConadis');
            var certificado = obtenerParametroURL('discCertificadoDiscSiNo');
            var tipo = obtenerParametroURL('discTipoDisc');
            var porcentaje = obtenerParametroURL('discPorcentajeDisc');
            var enfermedad = obtenerParametroURL('discTipoEnfermedad');
            var cedula = obtenerParametroURL('docente_cedulaDocente');


            document.getElementById('idDiscapacidad').value = idDiscapacidad;
            document.getElementById('discSituacionDisc').value = situacion;
            document.getElementById('discTipoRelacionDisc').value = tipoRelacion;
            document.getElementById('discNumeroConadis').value = numeroConadis ;
            document.getElementById('discCertificadoDiscSiNo').value = certificado;
            document.getElementById('discTipoDisc').value = tipo;
            document.getElementById('discPorcentajeDisc').value = porcentaje ;
            document.getElementById('discTipoEnfermedad').value = enfermedad;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>
    <body class="d-flex align-items-center justify-content-center" style="height: 60vh; background-color: #f8f9fa;">
        <div class="container mt-4">
            <div class="card mb-3">
                <div class="card-body">
                    <form action="ControladorDiscapacidad" method="POST">
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Id Discapacidad:</label>
                                    <div class="col-sm-6">
                                        <input type="number" name="idUpdate" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Cedula del docente:</label>
                                    <div class="col-sm-6">
                                        <input type="number" name="intFkdocente" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Situacion de Discapacidad</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtSituacion">
                                            <option value="Discapacidad Física">Discapacidad Fisica</option>
                                            <option value="Discapacidad Sensorial">Discapacidad Sensorial</option>
                                            <option value="Discapacidad Intelectual o del Desarrollo">Discapacidad Intelectual o del Desarrollo</option>
                                            <option value="Discapacidad Psicosocial o de Salud Mental">Discapacidad Psicosocial o de Salud Mental</option>
                                            <option value="Discapacidad del Habla o del Lenguaje">Discapacidad del Habla o del Lenguaje</option>
                                            <option value="Discapacidad Crónica">Discapacidad Crónica</option>
                                            <option value="Discapacidad de Aprendizaje">Discapacidad de Aprendizaje</option>
                                            <option value="Otros">Otros</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label  class="col-sm-6 col-form-label">Tipo Relacion</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtTiporelacion">
                                            <option value="Persona con Discapacidad">Persona  Discapacidad</option>
                                            <option value="Familiar de Persona con Discapacidad">Familiar con Discapacidad</option>
                                            <option value="Persona con Discapacidad">Persona Discapacidad</option>
                                            <option value="Amigo/a de Persona con Discapacidad">Amigo/a  Discapacidad</option>
                                            <option value="Otros">Otros</option>
                                        </select>
                                    </div>
                                </div>           `
                            </div>

                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Numero Conadis</label>
                                    <div class="col-sm-6">
                                        <input type="number" name="nbNumconadis" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Certificado Discapacidad</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtCertificado">
                                            <option value="Si">Si</option>
                                            <option value="No">No</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Tipo Discapacidad</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtTipo">
                                            <option value="Grave">Grave</option>
                                            <option value="Normal">Normal</option>
                                            <option value="Normal">Sencilla</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <!-- Columna 3 -->
                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Porcentaje Discapacidad</label>
                                    <div class="col-sm-6">
                                        <input type="number" name="txtPorcentaje" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Tipo Enfermedad</label>
                                    <div class="col-sm-6">
                                        <input type="text" name="txtTipoenfermedad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12 text-center">
                                        <input type="submit" name="discapacidad" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="discapacidad" value="Actualizar" class="btn btn-success">
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

