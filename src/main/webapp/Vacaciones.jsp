<%-- 
    Document   : Vacaciones crud
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
        <title>VACACIONES</title>
    </head>
    <body class="d-flex align-items-center justify-content-center" style="height: 80vh; background-color: #f8f9fa;">
        <div class="d-flex">
            <div class="card col-sm-14">
                <div class="card-body">
                    <form action="ControladorVacacion" method="POST" class="row">

                        <div class="form-group col-sm-6">
                            <label>Id de la Vacacion:</label>
                            <input type="number" name="idUpdate" class="form-control">
                        </div>

                        <div class="form-group col-sm-6">
                            <label>Cedula del docente:</label>
                            <input type="number" name="intFkdocente" class="form-control">
                        </div>

                        <div class="form-group col-sm-6">
                            <label>Fecha y Hora Inicio:</label>
                            <input type="datetime-local" name="dtFechahorainicia" class="form-control">
                        </div>

                        <!-- Fila 2 -->
                        <div class="form-group col-sm-6">
                            <label>Fecha y Hora Finaliza:</label>
                            <input type="datetime-local" name="dtFechahorafinaliza" class="form-control">
                        </div>

                        <!-- Fila 2 (Adicional) -->
                        <div class="form-group col-sm-6">
                            <label>Observacion:</label>
                            <input type="text" name="txtObservacion" class="form-control">
                        </div>

                        <!-- Fila 3 -->
                        <div class="form-group col-sm-6">
                            <label>Estado:</label>
                            <select class="form-control" name="txtEstado">
                                <option value="Activo">Activo</option>
                                <option value="Inactivo">Inactivo</option>
                            </select>
                        </div>

                        <!-- Fila 3 (Adicional) -->
                        <div class="form-group col-sm-12 text-center">
                            <input type="submit" name="vacacion" value="Agregar" class="btn btn-info">
                            <input type="submit" name="vacacion" value="Actualizar" class="btn btn-success">
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


