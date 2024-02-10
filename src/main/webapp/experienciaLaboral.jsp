
<%-- 
    Document   : experienciaLaboral
    Created on : 03/01/2024, 18:04:18
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
        <title>EXPERIENCIA LABORAL</title>
    </head>
    <body class="d-flex align-items-center justify-content-center" style="height: 70vh; background-color: #f8f9fa;">
        <div class="container mt-4">
            <div class="card mb-3">
                <div class="card-body">
                    <form action="ControladorExperienciaLaboral" method="POST">
                        <div class="row">
                            <div class="col-md-4">
                                   <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Id Experiencia Laboral:</label>
                                    <div class="col-sm-6">
                                        <input type="number" name="idUpdate" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Cedula  docente</label>
                                    <div class="col-sm-6">
                                        <input type="number" name="intFkdocente" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Tipo Institucion</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtInstitucion">
                                            <option value="Publica">Publica</option>
                                            <option value="Privada">Privada</option>
                                            <option value="Mixta">Mixta</option>
                                        </select>
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Nombre Institucion</label>
                                    <div class="col-sm-6">
                                        <input type="text" name="txtNombreinstitucion" class="form-control form-control-sm">
                                    </div>
                                </div>
                            </div>
                            <!-- Columna 2 -->
                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Departamento Area</label>
                                    <div class="col-sm-6">
                                        <input type="text" name="txtDepartamento" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Puesto</label>
                                    <div class="col-sm-6">
                                        <input type="text" name="txtPuesto" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Motivo Salida</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtMotivosalida">
                                            <option value="Renuncia">Renuncia</option>
                                            <option value="Terminacion contrato">Terminacion contrato</option>
                                        </select>
                                    </div>
                                </div>
                                
                            </div>
                            <!-- Columna 3 -->
                            <div class="col-md-4">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Fecha Ingreso</label>
                                    <div class="col-sm-6">
                                        <input type="date" name="dtFechaingreso" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Fecha Salida</label>
                                    <div class="col-sm-6">
                                        <input type="date" name="dtFechasalida" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-6 col-form-label">Modalidad Ingreso</label>
                                    <div class="col-sm-6">
                                        <select class="form-control" name="txtModalidad">
                                            <option value="Contrato">Contrato</option>
                                            <option value="Nombramiento">Nombramiento</option>
                                            <option value="Libre nombramiento">Libre nombramiento</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-12 text-center">
                                <input type="submit" name="experiencia" value="Agregar" class="btn btn-primary">
                                <input type="submit" name="experiencia" value="Actualizar" class="btn btn-success">
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
