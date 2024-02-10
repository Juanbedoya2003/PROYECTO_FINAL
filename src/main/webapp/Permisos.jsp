<%-- 
    Document   : Permisos 
    Created on : 26/12/2023, 19:21:32
    Author     : Juan Bedoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>PERMISOS</title>

    </head>
    <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idPermiso = obtenerParametroURL('id');
            var motivo = obtenerParametroURL('permMotivo');
            var fechaInicio = obtenerParametroURL('permFechaInicio');
            var fechaFin = obtenerParametroURL('permFechaFin');
            var dias = obtenerParametroURL('permDiasSolicitar');
            var horas = obtenerParametroURL('permHorasSolictar');
            var horaInicio = obtenerParametroURL('permHoraInicio');
            var horaFin = obtenerParametroURL('permHoraFinaliza');
            var cantidadDescontar = obtenerParametroURL('permCantidadDescontar');
            var observacion = obtenerParametroURL('permObservacion');
            var estado = obtenerParametroURL('permEstado');
            var cedula = obtenerParametroURL('docente_cedulaDocente');


            document.getElementById('idPermiso').value = idPermiso;
            document.getElementById('permMotivo').value = motivo;
            document.getElementById('permFechaInicio').value = fechaInicio;
            document.getElementById('permFechaFin').value = fechaFin;
            document.getElementById('permDiasSolicitar').value = dias;
            document.getElementById('permHorasSolictar').value = horas;
            document.getElementById('permHoraInicio').value = horaInicio;
            document.getElementById('permHoraFinaliza').value = horaFin;
            document.getElementById('permCantidadDescontar').value = cantidadDescontar;
            document.getElementById('permObservacion').value = observacion;
            document.getElementById('permEstado').value = estado;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>
    <body>
    <body class="d-flex align-items-center justify-content-center" style="height: 80vh; background-color: #f8f9fa;">
        <div class="d-flex">
            <div class="card col-sm-14">
                <div class="card-body">
                    <form action="ControladorPermiso" method="POST" class="row">
                        <div class="form-group col-sm-3">
                            <label>Id Permiso:</label>
                            <input type="number" name="idUpdate" class="form-control form-control-sm">
                        </div>
                        <div class="form-group col-sm-3">
                            <label>Cedula del docente:</label>
                            <input type="number" name="intFkdocente" class="form-control form-control-sm">
                        </div>
                        <div class="form-group col-sm-6">
                            <label>Motivo del permiso:</label>
                            <select class="form-control form-control-sm" name="txtMotivo">
                                <option value="LICENCIA POR CALAMIDAD DOMESTICA">LICENCIA POR CALAMIDAD DOMESTICA</option>
                                <option value="LICENCIA POR ENFERMEDAD">LICENCIA POR ENFERMEDAD</option>
                                <option value="LICENCIA POR MATERNIDAD">LICENCIA POR MATERNIDAD</option>
                                <option value="LICENCIA POR MATERNIDAD O UNION DE HECHO">LICENCIA POR MATERNIDAD O UNION DE HECHO</option>
                                <option value="LICENCIA POR PATERNIDAD">LICENCIA POR PATERNIDAD</option>
                                <option value="PERMISO PARA ESTUDIOS REGULARES">PERMISO PARA ESTUDIOS REGULARES</option>
                                <option value="PERMISO  DE DIAS CON CARGO A VACACIONES">PERMISO  DE DIAS CON CARGO A VACACIONES</option>
                                <option value="PERMISO POR ASUNTOS OFICIALES">PERMISO POR ASUNTOS OFICIALES</option>
                                <option value="PERMISO PARA ATENCION MEDICA">PERMISO PARA ATENCION MEDICA</option>
                                <option value="OTROS">OTROS</option>
                            </select>
                        </div>

                        <!-- Fila 3 (Adicional) -->
                        <div class="form-group col-sm-3">
                            <label>Dias a solicitar:</label>
                            <input type="number" name="tsDiasSolicita" value="0" max="100" class="form-control form-control-sm" readonly>
                        </div>
                        <!-- Fila 3 -->
                        <div class="form-group col-sm-3">
                            <label>Horas a Solicitar:</label>
                            <input type="number" name="tsHoraSolicita" value="0" max="7" class="form-control form-control-sm" readonly>
                        </div>



                        <!-- Fila 2 (Adicional) -->
                        <div class="form-group col-sm-3">
                            <label>Fecha Inicio:</label>
                            <input type="date" name="tsFechaInicio" class="form-control form-control-sm" required="">
                        </div>
                        <!-- Fila 2 (Adicional) -->
                        <div class="form-group col-sm-3">
                            <label>Fecha Final</label>
                            <input type="date" name="tsFechaFin" class="form-control form-control-sm" >
                        </div>

                        <div class="form-group col-sm-3">
                            <label>Hora Inicio </label>
                            <input type="time" name="horainicio" class="form-control form-control-sm" >
                        </div>

                        <div class="form-group col-sm-3">
                            <label>Hora Final</label>
                            <input type="time" name="horafin" class="form-control form-control-sm">
                        </div>

                        <div class="form-group col-sm-3">
                            <label>Cantidad a descontar:</label>
                            <input type="number" name="nbCantidadDescontar" value="0" class="form-control form-control-sm" readonly>
                        </div>
                        <div class="form-group col-sm-6">
                            <label>Observacion:</label>
                            <input type="text" name="txtObservacion" class="form-control form-control-sm">
                        </div>

                        <div class="form-group col-sm-6">
                            <label>Estado:</label>
                            <select class="form-control form-control-sm" name="txtEstado">
                                <option value="Activo">Activo</option>
                                <option value="Inactivo">Inactivo</option>
                            </select>
                        </div>

                        <div class="form-group col-sm-12 text-center">
                            <input type="submit" name="permiso" value="Agregar" class="btn btn-info">
                            <input type="submit" name="permiso" value="Actualizar" class="btn btn-success">
                        </div>

                        <% if (request.getAttribute("cajitamensajebase") != null) {
                            out.println(request.getAttribute("cajitamensajebase"));
                        } %>

                    </form>
                </div>
            </div>
        </div>


    </body>
</html>


