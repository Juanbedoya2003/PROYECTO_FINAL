<%-- 
    Document   : HojaRuta
    Created on : 26/12/2023, 19:21:32
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
        <title>HOJA RUTA</title>
    </head>
    <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idHojaRuta = obtenerParametroURL('id');
            var fecha = obtenerParametroURL('hojaFecha');
            var horaInicia = obtenerParametroURL('hojaHoraInicia');
            var horaFinaliza = obtenerParametroURL('hojaHoraFinaliza');
            var horaTotal = obtenerParametroURL('hojaHoraTotal');
            var observacion = obtenerParametroURL('hojaObservacion');
            var estado = obtenerParametroURL('hojaEstado');
            var cedula = obtenerParametroURL('docente_cedulaDocente');


            document.getElementById('idHojaRuta').value = idHojaRuta;
            document.getElementById('hojaFecha').value = fecha;
            document.getElementById('hojaHoraInicia').value = horaInicia;
            document.getElementById('hojaHoraFinaliza').value = horaFinaliza;
            document.getElementById('hojaHoraTotal').value = horaTotal;
            document.getElementById('hojaObservacion').value = observacion;
            document.getElementById('hojaEstado').value = estado;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>

    <body class="d-flex align-items-center justify-content-center" style="height: 80vh; background-color: #f8f9fa;">
        <div class="d-flex">
            <div class="card col-sm-14">
                <div class="card-body">
                    <form action="ControladorHojaRuta" method="POST">
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Id Hoja Ruta:</label>
                                    <input type="number" name="idUpdate" class="form-control">
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Cedula del Docente:</label>
                                    <input type="number" name="intFkdocente" class="form-control">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <!-- Segunda fila -->
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Fecha de Ausencia:</label>
                                    <input type="date" name="tsFechahorainicia" class="form-control">
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Hora inicia:</label>
                                    <input type="time" name="txtHoraInicia" class="form-control">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Hora Finaliza:</label>
                                    <input type="time" name="txtHoraFinaliza" class="form-control">
                                </div>
                            </div>

                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label>Horas total:</label>
                                    <input type="text" name="txtHoraTotal"  class="form-control" value="<%= request.getAttribute("horasAusencia") != null ? request.getAttribute("horasAusencia") : "" %>" readonly>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-group col-md-6">
                                <label>Observacion:</label>
                                <input type="text" name="txtObservacion" class="form-control">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Estado:</label>
                                <select class="form-control" name="txtEstado">
                                    <option value="ACTIVO">ACTIVO</option>
                                    <option value="INACTIVO">INACTIVO</option>
                                </select>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-sm-12 text-center">
                                <input type="submit" name="hojaruta" value="Agregar" class="btn btn-info">
                                <input type="submit" name="hojaruta" value="Actualizar" class="btn btn-success">
                            </div>
                        </div>

                        <% if (request.getAttribute("cajitamensajebase") != null) {
                            out.println(request.getAttribute("cajitamensajebase"));
                        } %>
                    </form>
                </div>
            </div>
        </div>
    </body>
