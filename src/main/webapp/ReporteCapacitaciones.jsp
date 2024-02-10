<%-- 
    Document   : ReporteCapacitaciones
    Created on : 26/01/2024, 16:52:39
    Author     : Juan Bedoya
--%>
<%@page import="java.util.List"%>
<%@page import="modeloDTO.Capacitaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>REPORTE CAPACITACIONES</title>
    </head>
    <body>
        <div class="container mt-8">
            <div class="card mb-8 w-100">
                <div class="card-body"> 
                    <form action="ControladorReporteCapacitaciones" method="post" class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="txtbusqueda" class="form-label">Cedula del docente</label>
                                <div class="input-group">
                                    <input name="txtbusqueda" type="text" class="form-control" id="txtbusqueda">
                                    <div class="input-group-append">
                                        <input name="capacitacion" type="submit" class="btn btn-outline-primary" value="Buscar">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="txteliminar" class="form-label">Id Capacitacion</label>
                                <div class="input-group">
                                    <input name="deleteId" type="text" class="form-control" id="deleteId">
                                    <div class="input-group-append">
                                        <input name="capacitacion" type="submit" class="btn btn-outline-danger" value="Eliminar">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-12 text-center">
                            <input name="capacitacion" type="submit" class="btn btn-outline-primary" value="Reporte">
                            <a href="Capacitaciones.jsp" class="btn btn-light text-dark border-dark">EDITAR</a>
                        </div>

                        <%                                
                                   if (request.getAttribute("cajitaeliminar") != null) {
                                        out.println(request.getAttribute("cajitaeliminar"));
                                   }
                        %>
                    </form>

                    <div class="col-sm-12  mr-6">
                        <table class="table table-hover text-center">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>NOMBRE</th>
                                    <th>TIPO</th>
                                    <th>AUSPICIANTE</th> 
                                    <th>DURACION</th> 
                                    <th>CONDICION</th>
                                    <th>APRUEBA</th>
                                    <th>INICIO</th>
                                    <th>FIN</th>
                                     <th>CEDULA </th>
                                </tr>
                            </thead>
                            <!---   ITERAR SOBRE LOS DATOS Y MOSTRAR CADA FILA EN ORDEN --->
                            <% 
                                //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                                if (request.getAttribute("cajitareportebd") !=null) {
                                    List<Capacitaciones> arrItems = (List<Capacitaciones>) request.getAttribute("cajitareportebd");
                                    for (Capacitaciones items : arrItems){          
                            %>

                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getNombre()%></td>
                                <td><%= items.getTipo()%></td>
                                <td><%= items.getAuspiciante()%></td>         
                                <td><%= items.getDuracion()%></td>
                                <td><%= items.getAprobadoDesaprobado()%></td> 
                                <td><%= items.getInstitucionaprueba()%></td> 
                                <td><%= items.getFechahorainicio()%></td>
                                <td><%= items.getFechahorafin()%></td>
                                <td><%= items.getFkdocente()%></td>
                            </tr>

                            <%
                                                 }
                                          }
                            %>


                            <% 
                                   if (request.getAttribute("cajitareportebduno") !=null) {
                                   List<Capacitaciones> arrItems = (List<Capacitaciones>) request.getAttribute("cajitareportebduno");
                                   for (Capacitaciones items : arrItems){          
                            %>
                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getNombre()%></td>
                                <td><%= items.getTipo()%></td>
                                <td><%= items.getAuspiciante()%></td>         
                                <td><%= items.getDuracion()%></td>
                                <td><%= items.getAprobadoDesaprobado()%></td>
                                <td><%= items.getInstitucionaprueba()%></td> 
                                <td><%= items.getFechahorainicio()%></td>
                                <td><%= items.getFechahorafin()%></td>
                                <td><%= items.getFkdocente()%></td>
                            </tr>
                            <%
                                               }
                                        }
                            %>

                    </div>
                </div>
            </div>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>

