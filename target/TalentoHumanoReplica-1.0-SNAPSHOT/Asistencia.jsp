<%-- 
    Document   : Asistenca crud
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
        <title>ASISTENCIA</title>
    </head>
     <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idAsistencia = obtenerParametroURL('id');
            var fecha = obtenerParametroURL('asisFecha');
            var horaEntrada = obtenerParametroURL('asisHoraEntrada');
            var horaSalida = obtenerParametroURL('asisHoraSalida');
            var horasTrabajadas = obtenerParametroURL('asisHorasTrabajadas');
            var observacion = obtenerParametroURL('asisObservacion');
            var estado = obtenerParametroURL('asisEstado');
            var cedula = obtenerParametroURL('docente_cedulaDocente');
            
  
            document.getElementById('idAsistencia').value = idAsistencia;
            document.getElementById('asisFecha').value = fecha;
            document.getElementById('asisHoraEntrada').value = horaEntrada;
            document.getElementById('asisHoraSalida').value = horaSalida;
            document.getElementById('asisHorasTrabajadas').value = horasTrabajadas;
            document.getElementById('asisObservacion').value = observacion;
            document.getElementById('asisEstado').value = estado;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        // Ejecutar la función después de que la página se haya cargado
        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>

    <body  class="d-flex align-items-center justify-content-center" style="height: 80vh; background-color: #f8f9fa;">
            <div class="card col-sm-6  mx-auto">
                <div class="card-body">
                    <form action="ControladorAsistencia" method="POST">
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>id Asistencia:</label>
                                <input type="number" name="idUpdate" class="form-control">
                            </div>

                            <div class="form-group col-md-6">
                                <label>Cedula Docente:</label>
                                <input type="number" name="intFkdocente" class="form-control">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>Fecha Asistencia:</label>
                                <input type="date" name="dtAsistencia" class="form-control">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Hora Entrada:</label>
                                <input type="time" name="tmHoraEntrada" class="form-control">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label>Hora Salida:</label>
                                <input type="time" name="tmHoraSalida" class="form-control">
                            </div>
                            <div class="form-group col-md-6">
                                <label>Horas Trabajadas:</label>
                               <input type="text" name="tmHorasTrabajadas" class="form-control" value="<%= request.getAttribute("horasTrabajadas") != null ? request.getAttribute("horasTrabajadas") : "" %>" readonly>
                            </div>
                        </div>
                        <div class="form-row">
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
                        <div>
                            <input type="submit" name="asistencia" value="Agregar" class="btn btn-info">
                            <input type="submit" name="asistencia" value="Actualizar" class="btn btn-success">
                        </div>
                        <%
                            if (request.getAttribute("cajitamensajebase") != null) {
                                out.println(request.getAttribute("cajitamensajebase"));
                            }
                        %>
                    </form>
                </div>
            </div>
  
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>

