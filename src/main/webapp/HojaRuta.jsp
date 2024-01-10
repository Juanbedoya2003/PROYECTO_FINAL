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
    <body>
        <div class="d-flex">
            <div class="card col-sm-14">
                <div class="card-body">
                    <form action="Controlador?menu=HojaRuta" method="POST">
                        <div class="form-group">
                            <label>Fecha Hora de Inicio:</label>
                            <input type="datetime" name="txtCedula"  class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Fecha Hora de Fin:</label>
                            <input type="datetime" name="txtNombres"  class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Observacion:</label>
                            <input type="text" name="txtApellidos"  class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado:</label>
                            <div class="col-sm-14">
                                <select class="form-control" name="txtEstado">
                                    <option value="1">ACTIVO</option>
                                    <option value="0">INACTIVO</option>
                                </select>
                            </div>
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>

                </div>

            </div>


            <div class="col-sm-9">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>FECHA HORA INICIO</th>
                            <th>FECHA HORA FINALIZA</th>
                            <th>OBSERVACION</th>
                            <th>ESTADO</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="doc" items="${docentes}">
                        <tr>
                            <td>${doc.getId()}</td>
                            <td>{doc.getId}</td>
                            <td>{doc.getId}</td>
                            <td>{doc.getId}</td>
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


    </body>
</html>

