<%-- 
    Document   : Capacitaciones
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
        <title>CAPACITACIONES</title>
    </head>
    <body class="d-flex align-items-center justify-content-center" style="height: 60vh; background-color: #f8f9fa;">
        <div class="container mt-8">
            <div class="card mb-6">
                <div class="card-body">
                    <form action="ControladorCapacitaciones" method="POST">
                        <div class="row">
                            <div class="col-md-4">
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Id Capacitacion:</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="idUpdate" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Nombre</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtNomcapacitacion" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Tipo</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtTipo">
                                            <option value="Charla">Charla</option>
                                            <option value="Taller">Taller</option>
                                            <option value="Conferencia">Conferencia</option>
                                            <option value="Congreso">Congreso</option>
                                            <option value="Curso">Curso</option>
                                            <option value="Otros">Otros</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- Fila 4 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Auspiciante</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtAuspiciante">
                                            <option value="Empresa">Empresa</option>
                                            <option value="Institucion">Institucion</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <!-- Columna 2 -->
                            <div class="col-md-4">
                               <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Cedula docente:</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="intFkdocente" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Horas</label>
                                    <div class="col-sm-7">
                                        <input type="number" name="txtHoras" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Certificado</label>
                                    <div class="col-sm-7">
                                        <select class="form-control" name="txtAprobadodesaprobado">
                                            <option value="Aprobacion">Aprobacion</option>
                                            <option value="Asistencia">Asistencia</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">País</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtPais" class="form-control form-control-sm">
                                    </div>
                                </div>
                            </div>
                            <!-- Columna 3 -->
                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Aprobación</label>
                                    <div class="col-sm-7">
                                        <input type="text" name="txtInstitucion" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Inicio</label>
                                    <div class="col-sm-7">
                                        <input type="datetime-local" name="dtFechahorainicio" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-5 col-form-label">Finaliza</label>
                                    <div class="col-sm-7">
                                        <input type="datetime-local" name="dtFechahorafin" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12 text-center">
                                        <input type="submit" name="capacitacion" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="capacitacion" value="Actualizar" class="btn btn-success">
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
