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
    <body>
        <div class="ml-4 mt-4 mr-4">
            <div class="row">
                <div class="col-sm-4">
                    <div class="card">
                        <div class="card-body">
                            <form action="Controlador?menu=hijos" method="POST">
                                <div class="form-group">
                                    <label>Cedula Hij@:</label>
                                    <input type="text" value="${cliente.getDni()}" name="txtDni" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Apellidos:</label>
                                    <input type="text" value="${cliente.getNom()}" name="txtNombres" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Nombres:</label>
                                    <input type="email" value="${cliente.getDir()}" name="txtTel" class="form-control" required="">
                                </div>
                                <div class="form-group">
                                    <label>Fecha de nacimiento::</label>
                                    <input type="email" value="${cliente.getDir()}" name="txtTel" class="form-control" required="">
                                </div>
                                <div class="form-group">
                                    <label>Escolaridad:</label>
                                    <input type="email" value="${cliente.getDir()}" name="txtTel" class="form-control" required="">
                                </div>               
                                <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                                <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                            </form>
                        </div>                         
                    </div>
                </div>                     
                <div class="col-sm-8">
                    <div class="card">
                        <div class="card-body">
                            <table class="table" style="width: 100%" id="example">
                                <thead>
                                    <tr class="text-center">
                                        <th>#</th>                                
                                        <th>CEDULA</th>
                                        <th>APELLIDOS</th>
                                        <th>NOMBRES</th>
                                        <th>FECHA NACIMIENTO</th>                                   
                                        <th>ESCOLARIDAD</th>
                                        <th>ACCIONES</th>
                                    </tr>
                                </thead>
                                <tbody> 
                                <c:forEach var="em" items="${clientes}" varStatus="n">
                                    <tr>
                                        <td class="text-center">${n.index+1}</td>                                    
                                        <td>${em.getNom()}</td>
                                        <td>${em.getDir()}</td>
                                        <td>${em.getDni()}</td>
                                        <td></td>
                                        <td></td>
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
        </div>      

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


    </body>
</html>
