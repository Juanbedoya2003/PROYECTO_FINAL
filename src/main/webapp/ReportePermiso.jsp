<%-- 
    Document   : Permiso
    Created on : 26/12/2023, 19:19:39
    Author     : Juan Bedoya
--%>
<%@page import="java.util.List"%>
<%@page import="modeloDTO.Permiso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>PERMISOS</title>

    </head>
    <body>
        <div class="container mt-18">
            <div class="card mb-6">
                <div class="card-body"> 
                    <form action="ControladorReportePermiso" method="post" class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="txtbusqueda" class="form-label">Cedula del docente</label>
                                <div class="input-group">
                                    <input name="txtbusqueda" type="text" class="form-control" id="txtbusqueda">
                                    <div class="input-group-append">
                                        <input name="permiso" type="submit" class="btn btn-outline-primary" value="Buscar">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="deleteId" class="form-label">Id Permiso</label>
                                <div class="input-group">
                                    <input name="deleteId" type="text" class="form-control" id="deleteId">
                                    <div class="input-group-append">
                                        <input name="permiso" type="submit" class="btn btn-outline-danger" value="Eliminar">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-12 text-center">
                            <input name="permiso" type="submit" class="btn btn-outline-primary" value="Reporte">
                            <a href="Permisos.jsp" class="btn btn-light text-dark border-dark">EDITAR</a>
                        </div>
                        <%                                
                                  if (request.getAttribute("cajitaeliminar") != null) {
                                       out.println(request.getAttribute("cajitaeliminar"));
                                  }
                        %>
                    </form>

                    <div class="col-sm-18">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>MOTIVO</th>
                                    <th>FECHA INICIO</th>
                                    <th>FECHA FINAL</th>
                                    <th>DIAS</th>
                                    <th>HORAS</th>
                                    <th>HORA INICIO</th> 
                                    <th>HORA FINAL</th>
                                    <th>CANTIDAD A DESCONTAR</th>
                                    <th>OBSERVACION</th>
                                    <th>ESTADO</th>
                                    <th>CEDULA DEL DOCENTE</th>
                                    <th>ACCION</th>
                                </tr>
                            </thead>

                            <% 
                                //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                                if (request.getAttribute("cajitareportebd") !=null) {
                                    List<Permiso> arrItems = (List<Permiso>) request.getAttribute("cajitareportebd");
                                    for (Permiso items : arrItems){          
                            %>

                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getMotivo()%></td>
                                <td><%= items.getFechaInicio()%></td>
                                <td><%= items.getFechaFin() %></td>
                                <td><%= items.getDiasSolicitados()%></td>
                                <td><%= items.getHorasSolicitadas() %></td>         
                                <td><%= items.getHoraInicio() %></td>
                                <td><%= items.getHoraFin()%></td>
                                <td><%= items.getCantidadDescontar()%></td>
                                <td><%= items. getObservacion()%></td>
                                <td><%= items.getEstado()%></td>
                                <td><%= items.getFkdocente()%></td> 
                                <td>
                                    <a href="Permisos.jsp?id=<%=items.getId()%>&motivo=<%=items.getMotivo()%>
                                       &fechaInicio=<%=items.getFechaInicio()%>&fechaFin=<%=items.getHoraFin()%>
                                       &dias=<%=items.getDiasSolicitados()%>&horas=<%=items.getHorasSolicitadas()%>
                                       &horaInicio=<%=items.getHoraInicio()%>&horaFin=<%=items.getHoraFin()%>
                                       &cantidadDescontar=<%=items.getCantidadDescontar()%>&observacion=<%=items. getObservacion()%>
                                       &estado=<%=items.getEstado()%>&cedula=<%=items.getFkdocente()%>"
                                       class="btn btn-dark btn-sm">                                    
                                        Editar
                                    </a>
                                </td>
                            </tr>

                            <%
                                                 }
                                          }
                            %>


                            <% 
                               //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                               if (request.getAttribute("cajitareportebduno") !=null) {
                                   List<Permiso> arrItems = (List<Permiso>) request.getAttribute("cajitareportebduno");
                                   for (Permiso items : arrItems){          
                            %>
                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getMotivo()%></td>
                                <td><%= items.getFechaInicio()%></td>
                                <td><%= items.getFechaFin() %></td>
                                <td><%= items.getDiasSolicitados()%></td>
                                <td><%= items.getHorasSolicitadas() %></td>         
                                <td><%= items.getHoraInicio() %></td>
                                <td><%= items.getHoraFin()%></td>
                                <td><%= items.getCantidadDescontar()%></td>
                                <td><%= items. getObservacion() %></td>
                                <td><%= items.getEstado()%></td>
                                <td><%= items.getFkdocente()%></td>  
                                <td>
                                    <a href="Permisos.jsp?id=<%=items.getId()%>&motivo=<%=items.getMotivo()%>
                                       &fechaInicio=<%=items.getFechaInicio()%>&fechaFin=<%=items.getHoraFin()%>
                                       &dias=<%=items.getDiasSolicitados()%>&horas=<%=items.getHorasSolicitadas()%>
                                       &horaInicio=<%=items.getHoraInicio()%>&horaFin=<%=items.getHoraFin()%>
                                       &cantidadDescontar=<%=items.getCantidadDescontar()%>&observacion=<%=items. getObservacion()%>
                                       &estado=<%=items.getEstado()%>&cedula=<%=items.getFkdocente()%>"
                                       class="btn btn-dark btn-sm">                                    
                                        Editar
                                    </a>
                                </td>
                            </tr>
                            <%
                                               }
                                        }
                            %>

                    </div>
                </div>
            </div>

    </body>
</html>
