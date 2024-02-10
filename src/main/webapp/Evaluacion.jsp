<%-- 
    Document   : Evaluacion
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
        <title>Evaluacion</title>
    </head>
    <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idEvaluacion = obtenerParametroURL('id');
            var periodoDesde = obtenerParametroURL('evaPeriodeDesde');
            var periodoHasta = obtenerParametroURL('evaPeriodoHasta');
            var institucion = obtenerParametroURL('evaNombreInstitucion');
            var puntaje = obtenerParametroURL('evaPuntaje');
            var calificacion = obtenerParametroURL('evaCalificacion');
            var observacion = obtenerParametroURL('evaObservacion');
            var cedula = obtenerParametroURL('docente_cedulaDocente');


            document.getElementById('idEvaluacion').value = idEvaluacion;
            document.getElementById('evaPeriodeDesde').value = periodoDesde;
            document.getElementById('evaPeriodoHasta').value = periodoHasta;
            document.getElementById('evaNombreInstitucion').value = institucion;
            document.getElementById('evaPuntaje').value = puntaje;
            document.getElementById('evaCalificacion').value = calificacion;
            document.getElementById('evaObservacion').value = observacion;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>
    <body class="d-flex align-items-center justify-content-center" style="height: 50vh; background-color: #f8f9fa;">
        <div class="container mt-8">
            <div class="card mb-6">
                <div class="card-body">
                    <form action="ControladorEvaluacion" method="POST">
                        <div class="row">
                            <!-- Columna 1 -->
                            <div class="col-md-4">
                                 <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Id Evaluacion Desempeño:</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="idUpdate" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Cedula docente:</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="intFkdocente" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Periodo Desde</label>
                                    <div class="col-sm-7">
                                        <input type="date" name="dtPeriododesde" class="form-control form-control-sm">
                                    </div>
                                </div>
                            </div>
                            <!-- Columna 2 -->
                            <div class="col-md-4">
                                  <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Periodo Hasta</label>
                                    <div class="col-sm-7">
                                        <input type="date" name="dtPeriodohasta" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Institucion</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtNombreinstitucion" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Puntaje</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="txtPuntaje" class="form-control form-control-sm">
                                    </div>
                                </div>
                            </div>
                            <!-- Columna 3 -->
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Calificacion</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtCalificacion">
                                            <option value="Excelente">Excelente</option>
                                            <option value="Buena">Buena</option>
                                            <option value="Regular">Regular</option>
                                            <option value="Deficiente">Deficiente</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Observacion</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtObservacion" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12 text-center">
                                        <input type="submit" name="evaluacion" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="evaluacion" value="Actualizar" class="btn btn-success">
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

