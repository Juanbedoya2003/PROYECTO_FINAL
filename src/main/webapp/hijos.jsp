<%-- 
    Document   : hijos
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
        <title>Hijos</title>
    </head>
    <body  class="d-flex align-items-center justify-content-center" style="height: 90vh; background-color: #f8f9fa;">
         <div class="container mt-4">
        <div class="row justify-content-center">
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <form action="ControladorHijo" method="POST">
                              <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Id Hijo del docente:</label>
                                <div class="col-sm-9">
                                    <input type="number" name="idUpdate" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Cedula del docente:</label>
                                <div class="col-sm-9">
                                    <input type="text" name="intFkdocente" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Cedula Hij@:</label>
                                <div class="col-sm-9">
                                    <input type="number" name="intCedula" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Apellidos:</label>
                                <div class="col-sm-9">
                                    <input type="text" name="txtApellidos" class="form-control">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Nombres:</label>
                                <div class="col-sm-9">
                                    <input type="text" name="txtNombres" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Fecha de nacimiento:</label>
                                <div class="col-sm-9">
                                    <input type="date" name="dtFechanacimiento" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label class="col-sm-3 col-form-label">Escolaridad:</label>
                                <div class="col-sm-9">
                                    <select class="form-control" name="txtEscolaridad">
                                        <option value="Escolar">Escolar</option>
                                        <option value="Bachillerato">Bachillerato</option>
                                        <option value="3er Nivel">3er.Nivel</option>
                                        <option value="4to.Nivel">4to.Nivel</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-12 text-center">
                                    <input type="submit" name="hijo" value="Agregar" class="btn btn-primary">
                                    <input type="submit" name="hijo" value="Actualizar" class="btn btn-success">
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
