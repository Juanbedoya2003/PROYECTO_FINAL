<%-- 
    Document   : contactoEmergencia
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
        <title>CONTACTO EMERGENCIA</title>
    </head>
    <body class="d-flex align-items-center justify-content-center" style="height: 80vh; background-color: #f8f9fa;">
        <div class="container mt-4">
            <div class="row justify-content-center">
                <div class="col-sm-8">
                    <div class="card">
                        <div class="card-body">
                            <form action="ControladorContactoEmergencia" method="POST">

                                <div class="form-group row">
                                    <label class="col-sm-4 col-form-label">Id Contacto Emergencia:</label>
                                    <div class="col-sm-8">
                                        <input type="number" name="idUpdate" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-sm-4 col-form-label">Cedula del docente:</label>
                                    <div class="col-sm-8">
                                        <input type="number" name="intFkdocente" class="form-control">
                                    </div>
                                </div>

                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label class="col-sm-4 col-form-label">Apellidos:</label>
                                    <div class="col-sm-8">
                                        <input type="text" name="txtApellidos" class="form-control">
                                    </div>
                                </div>

                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label class="col-sm-4 col-form-label">Nombres:</label>
                                    <div class="col-sm-8">
                                        <input type="text" name="txtNombres" class="form-control">
                                    </div>
                                </div>

                                <!-- Fila 4 -->
                                <div class="form-group row">
                                    <label class="col-sm-4 col-form-label">Telefono Domicilio:</label>
                                    <div class="col-sm-8">
                                        <input type="number" name="txtTeldomicilio" class="form-control">
                                    </div>
                                </div>

                                <!-- Fila 5 -->
                                <div class="form-group row">
                                    <label class="col-sm-4 col-form-label">Telefono Celular:</label>
                                    <div class="col-sm-8">
                                        <input type="number" name="txtTelcelular" class="form-control">
                                    </div>
                                </div>

                                <!-- Fila 6 -->
                                <div class="form-group row">
                                    <div class="col-sm-12 text-center">
                                        <input type="submit" name="contacto" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="contacto" value="Actualizar" class="btn btn-success">
                                    </div>
                                </div>

                                <% if (request.getAttribute("cajitamensajebase") != null) {
                                    out.println(request.getAttribute("cajitamensajebase"));
                                } %>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>               

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


    </body>
</html>
