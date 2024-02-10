    
<%@page import="java.util.List"%>
<%@page import="modeloDTO.CuentaBancaria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>REPORTE BANCO</title>
        
    </head>
    <body>
        <div class="container mt-18">
            <div class="card mb-6">
                <div class="card-body"> 
                    <form action="ControladorReporteBanco" method="post" class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="txtbusqueda" class="form-label">Cedula del docente</label>
                                <div class="input-group">
                                    <input name="txtbusqueda" type="text" class="form-control" id="txtbusqueda">
                                    <div class="input-group-append">
                                        <input name="cuenta" type="submit" class="btn btn-outline-primary" value="Buscar">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="txteliminar" class="form-label">Id CuentaBancaria</label>
                                <div class="input-group">
                                    <input name="deleteId" type="text" class="form-control" id="deleteId">
                                    <div class="input-group-append">
                                        <input name="cuenta" type="submit" class="btn btn-outline-danger" value="Eliminar">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-12 text-center">
                            <input name="cuenta" type="submit" class="btn btn-outline-primary" value="Reporte">
                            <a href="CuentaBancaria.jsp" class="btn btn-light text-dark border-dark">EDITAR</a>
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
                                    <th>INSTITUCION FINANCIERA</th>
                                    <th>TIPO DE CUENTA</th>
                                    <th>NUMERO DE CUENTA</th> 
                                     <th>CEDULA DOCENTE</th> 
                                     <th>ACCION</th>

                                </tr>
                            </thead>
                            <!---   ITERAR SOBRE LOS DATOS Y MOSTRAR CADA FILA EN ORDEN --->
                            <% 
                                //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                                if (request.getAttribute("cajitareportebd") !=null) {
                                    List<CuentaBancaria> arrItems = (List<CuentaBancaria>) request.getAttribute("cajitareportebd");
                                    for (CuentaBancaria items : arrItems){          
                            %>

                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getInstitucionfinanciera()%></td>
                                <td><%= items.getTipocuenta()%></td>
                                <td><%= items.getNumerocuenta()%></td>         
                                <td><%= items.getFkdocente()%></td>
                                 <td>
                                    <a href="CuentaBancaria.jsp?id=<%= items.getId()%>&institucion=<%=items.getInstitucionfinanciera()%>
                                       &tipoCuenta=<%=items.getTipocuenta()%>&numeroCuenta=<%=items.getNumerocuenta()%>
                                       &cedula=<%=items.getFkdocente()%>"
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
                                   List<CuentaBancaria> arrItems = (List<CuentaBancaria>) request.getAttribute("cajitareportebduno");
                                   for (CuentaBancaria items : arrItems){          
                            %>
                            <tr>
                               <td><%= items.getId()%></td>
                                <td><%= items.getInstitucionfinanciera()%></td>
                                <td><%= items.getTipocuenta()%></td>
                                <td><%= items.getNumerocuenta()%></td>         
                                <td><%= items.getFkdocente()%></td>
                                 <td>
                                    <a href="CuentaBancaria.jsp?id=<%= items.getId()%>&institucion=<%=items.getInstitucionfinanciera()%>
                                       &tipoCuenta=<%=items.getTipocuenta()%>&numeroCuenta=<%=items.getNumerocuenta()%>
                                       &cedula=<%=items.getFkdocente()%>"
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

