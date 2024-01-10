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
    <body>
        <div class="container mt-8">
            <div class="card mb-6">
                <div class="card-body">
                    <form action="Controlador?menu=Capacitaciones" method="POST">
                        <div class="row">
                            <!-- Primera Columna -->
                            <div class="col-md-4">
                                <!-- Campo 1 -->
                                <div class="form-group row">
                                    <label for="txtApellidos" class="col-sm-5 col-form-label">Nombre Capacitacion:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getNom()}" name="txtApellidos" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Campo 2 -->
                                <div class="form-group row">
                                    <label for="txtNombres" class="col-sm-5 col-form-label">Tipo Capacitacion:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getPre()}" name="txtNombres" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Campo 3 -->
                                <div class="form-group row">
                                    <label for="txtTel" class="col-sm-5 col-form-label">Auspiciante Capacitacion:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtTel" class="form-control form-control-sm">
                                    </div>
                                </div>
                            </div>

                            <!-- Segunda Columna -->
                            <div class="col-md-4">
                                <!-- Campo 4 -->
                                <div class="form-group row">
                                    <label for="txtCel" class="col-sm-5 col-form-label">Horas Capacitacion:</label>
                                    <div class="col-sm-7">
                                        <input type="number" value="${producto.getStock()}" name="txtCel" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="txtEstado" class="col-sm-5 col-form-label">Condicion:</label>
                                    <div class="col-sm-7">
                                        <select class="form-control form-control-sm" name="txtEstado">
                                            <option value="1">APROBADO</option>
                                            <option value="0">DESAPROBADO</option>
                                        </select>
                                    </div>
                                </div>

                                <!-- Campo 6 -->
                                <div class="form-group row">
                                    <label for="txtFechaSalida" class="col-sm-5 col-form-label">Pais:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtFechaSalida" class="form-control form-control-sm">
                                    </div>
                                </div>
                            </div>

                            <!-- Tercera Columna -->
                            <div class="col-md-4">
                                <!-- Campo 7 -->
                                <div class="form-group row">
                                    <label for="txtModalidad" class="col-sm-5 col-form-label">Institucion de Aprobacion:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtModalidad" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Campo 8 -->
                                <div class="form-group row">
                                    <label for="txtMotivoSalida" class="col-sm-5 col-form-label">Fecha Hora Inicio:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtMotivoSalida" class="form-control form-control-sm">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="txtMotivoSalida" class="col-sm-5 col-form-label">Fecha Hora Fin:</label>
                                    <div class="col-sm-7">
                                        <input type="text" value="${producto.getStock()}" name="txtMotivoSalida" class="form-control form-control-sm">
                                    </div>
                                </div>

                                <!-- Campo 9 -->
                                <div class="form-group row">
                                    <label for="txtEstado" class="col-sm-5 col-form-label">Estado:</label>
                                    <div class="col-sm-7">
                                        <select class="form-control form-control-sm" name="txtEstado">
                                            <option value="1">ACTIVO</option>
                                            <option value="0">INACTIVO</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Botones alineados al centro -->
                        <div class="form-group row">
                            <div class="col-sm-12 text-center">
                                <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                                <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="col-sm-12">
            <div class="card">
                <div class="card-body">
                    <table class="table table-hover" style="width: 100%" id="example">
                        <thead>
                            <tr class="text-center">
                                <th>#</th>
                                <th>NOMBRE</th>
                                <th>TIPO</th>
                                <th>AUSPICIANTE</th>
                                <th>HORAS DURACION</th>     
                                <th>CONDICION</th>                                    
                                <th>PAIS</th>
                                <th>INSTITUCION APROBACION</th>
                                <th>FECHA INICIO</th>
                                <th>FECHA FINALIZA</th>
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
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>

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
</div>      

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


</body>
</html>
