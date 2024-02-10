
<%@page import="java.util.List"%>
<%@page import="modeloDTO.ContactoEmergencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>REPORTE CONTACTOS</title>
    </head>
    <body>
        <div class="container mt-8">
            <div class="card mb-6">
                <div class="card-body"> 
                    <form action="ControladorReporteContactoEmergencia" method="post" class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="txtbusqueda" class="form-label">Cedula del docente</label>
                                <div class="input-group">
                                    <input name="txtbusqueda" type="text" class="form-control" id="txtbusqueda">
                                    <div class="input-group-append">
                                        <input name="contacto" type="submit" class="btn btn-outline-primary" value="Buscar">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="deleteId" class="form-label">Id Contacto Emergencia</label>
                                <div class="input-group">
                                    <input name="deleteId" type="text" class="form-control" id="deleteId">
                                    <div class="input-group-append">
                                        <input name="contacto" type="submit" class="btn btn-outline-danger" value="Eliminar">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-12 text-center">
                            <input name="contacto" type="submit" class="btn btn-outline-primary" value="Reporte">
                            <a href="contactoEmergencia.jsp" class="btn btn-light text-dark border-dark">EDITAR</a>
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
                                    <th>APELLIDOS</th>
                                    <th>NOMBRES</th>
                                    <th>TELEFONO DOMICILIO</th> 
                                    <th>TELEFONO CELULAR</th> 
                                    <th>CEDULA DOCENTE</th> 
                                </tr>
                            </thead>
                            <!---   ITERAR SOBRE LOS DATOS Y MOSTRAR CADA FILA EN ORDEN --->
                            <% 
                                //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                                if (request.getAttribute("cajitareportebd") !=null) {
                                    List<ContactoEmergencia> arrItems = (List<ContactoEmergencia>) request.getAttribute("cajitareportebd");
                                    for (ContactoEmergencia items : arrItems){          
                            %>

                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getContactoapellidos()%></td>
                                <td><%= items.getContactonombres()%></td>
                                <td><%= items.getContactotelefonodomicilio()%></td>         
                                <td><%= items.getContactotelefonocelular()%></td>
                                <td><%= items.getFkdocente()%></td>
                            </tr>

                            <%
                                                 }
                                          }
                            %>


                            <% 
                               //VERIFICA SI ARROB NO ES NULO Y TIENE ELEMENTOS
                               if (request.getAttribute("cajitareportebduno") !=null) {
                                   List<ContactoEmergencia> arrItems = (List<ContactoEmergencia>) request.getAttribute("cajitareportebduno");
                                   for (ContactoEmergencia items : arrItems){          
                            %>
                            <tr>
                                <td><%= items.getId()%></td>
                                <td><%= items.getContactoapellidos()%></td>
                                <td><%= items.getContactonombres()%></td>
                                <td><%= items.getContactotelefonodomicilio()%></td>         
                                <td><%= items.getContactotelefonocelular()%></td>
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

