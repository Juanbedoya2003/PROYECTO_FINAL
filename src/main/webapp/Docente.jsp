<%-- 
    Document   : Docente
    Created on : 26/12/2023, 19:21:32
    Author     : Juan Bedoya
--%>

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
        <title>DATOS DOCENTE</title>
    </head>
    <body>
        <div class="container mt-8">
            <div class="card mb-6">
                <div class="card-body"> 
                    <form action="Controlador?menu=Docente" method="POST">
                        <div class="row">

                            <!-- Columna 1 -->
                            <div class="col-md-3">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label for="txtApellidos" class="col-sm-5 col-form-label">Cedula:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getNom()}" name="txtApellidos" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Fila 2 -->
                                <div class="form-group row">
                                    <label for="txtNombres" class="col-sm-5 col-form-label">Nacion:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getPre()}" name="txtNombres" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Fila 3 -->
                                <div class="form-group row">
                                    <label for="txtTel" class="col-sm-5 col-form-label">Apellidos:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtTel" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Fila 4 -->
                                <div class="form-group row">
                                    <label for="txtCel" class="col-sm-5 col-form-label">Nombres:</label>
                                    <div class="col-sm-7">
                                        <input type="number" value="${producto.getStock()}" name="txtCel" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtCel" class="col-sm-5 col-form-label">Fecha Nacimiento:</label>
                                    <div class="col-sm-7">
                                        <input type="date" value="${producto.getStock()}" name="txtCel" class="form-control form-control-sm">
                                    </div>
                                </div> 
                                <div class="form-group row">
                                    <label for="txtFechaSalida" class="col-sm-5 col-form-label">Tipo Sangre:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtFechaSalida" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Genero:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>

                            </div>

                            <!-- Columna 2 -->
                            <div class="col-md-3">
                                <!-- Fila 8 -->
                                <div class="form-group row">
                                    <label for="txtMotivoSalida" class="col-sm-5 col-form-label">Correo:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtMotivoSalida" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Estado Civil:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 10 -->
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Telefono Domicilio:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 11 -->
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Telefono Celular:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <!-- Fila 12 -->
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Fecha Declaracion Bienes:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Fecha Servicio Publico:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>





                            </div>

                            <!-- Columna 3 -->
                            <div class="col-md-3">
                                <!-- Fila 1 -->
                                <div class="form-group row">
                                    <label for="txtApellidos" class="col-sm-5 col-form-label">Provincia:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getNom()}" name="txtApellidos" class="form-control form-control-sm">
                                    </div>
                                </div>


                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Canton:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Parroquia:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Calle Principal:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Calle Secundaria:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>

                            </div>

                            <div class="col-md-3">

                                <div class="form-group row">
                                    <label for="txtMotivoSalida" class="col-sm-5 col-form-label">Etnia :</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtMotivoSalida" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Fila 23 -->
                                <div class="form-group row">
                                    <label for="txtEstado" class="col-sm-5 col-form-label">Estado:</label>
                                    <div class="col-sm-7">
                                        <select class="form-control form-control-sm" name="txtEstado">
                                            <option value="1">ACTIVO</option>
                                            <option value="0">INACTIVO</option>
                                        </select>
                                    </div>
                                </div>

                                <!-- Fila 24 -->
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">User:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Num Calle Principal:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Num Calle Secundaria:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12 mt-3 mr-auto">
                                        <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                                    </div>
                                </div>

                            </div>

                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="col-sm-16">
                <div class="card mb-3 ">
                    <div class="card-body">
                        <table class="table table-hover" style="width: 100%" id="example">
                            <thead>
                                <tr class="text-center">
                                    <th>#</th>
                                    <th>CEDULA</th>
                                    <th>NACIONALIDAD</th>
                                    <th>APELLIDOS</th>
                                    <th>NOMBRES</th>     
                                    <th>FECHA NACI.</th>                                    
                                    <th>TIPO SANGRE</th>
                                    <th>GENERO</th>
                                    <th>CORREO</th>
                                    <th>ESTADO CIVIL</th>
                                    <th>TELEFONO DOMICILIO</th>
                                    <th>TELEFON CELULAR</th>
                                    <th>FECHA BIENES</th>
                                    <th>FECHA SERVICIO</th>
                                    <th>PROVINCIA</th>
                                    <th>CANTON</th>
                                    <th>PARROQUIA</th>
                                    <th>CALLE PRINC</th>
                                    <th>#CALLE PRINC</th>
                                    <th>CALLE SECUNDA</th>
                                    <th>#CALLE SECUNDA</th>
                                    <th>ETNIA</th>
                                    <th>ESTADO</th>
                                    <th>USER</th>
                                    <th>ESTADO</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                            <c:forEach var="em" items="${productos}">
                                <tr>
                                    <td class="text-center">${em.getId()}</td>                                      
                                    <td>${em.getNom()}</td>
                                    <td>${em.getPre()}</td>
                                    <td>${em.getStock()}</td>
                                    <th></th>     
                                    <th></th>                                    
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>

                                <c:if test="${em.getEstado()=='1'}">
                                    <td class="text-center">ACTIVO</td>
                                </c:if>
                                <c:if test="${em.getEstado()!='1'}">
                                    <td class="text-center">INACTIVO</td>
                                </c:if>
                                <td class="text-center">
                                    <div class="btn-group">
                                        <a class="btn btn-outline-warning btn-sm mr-2" href="Controlador?menu=Producto&accion=Editar&id=${em.getId()}"><i class="icon ion-md-create"></i></a>
                                        <a class="btn btn-outline-danger btn-sm" href="Controlador?menu=Producto&accion=Delete&id=${em.getId()}"><i class="icon ion-md-trash"></i></a>
                                    </div>
                                </td>
                                </tr>
                            </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>      


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


    </body>
</html>
