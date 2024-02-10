<%-- 
    Document   : CuentaBancaria
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
        <title>CUENTA BANCARIA</title>
    </head>
         <script type="text/javascript">
        // Función para obtener un parámetro de la URL
        function obtenerParametroURL(nombre) {
            var url = new URL(window.location.href);
            return url.searchParams.get(nombre);
        }

        // Función para llenar los campos del formulario con los parámetros de la URL
        function llenarCamposFormulario() {
            var idCuentaBancaria = obtenerParametroURL('id');
            var institucion = obtenerParametroURL('cuenInstitucionFinanciera');
            var tipoCuenta = obtenerParametroURL('cuenTipoCuenta');
            var numeroCuenta = obtenerParametroURL('cuenNumeroCuenta');
            var cedula = obtenerParametroURL('docente_cedulaDocente');
           
            
            document.getElementById('idCuentaBancaria').value = idCuentaBancaria;
            document.getElementById('cuenInstitucionFinanciera').value = institucion;
            document.getElementById('cuenTipoCuenta').value = tipoCuenta;
            document.getElementById('cuenNumeroCuenta').value = numeroCuenta;
            document.getElementById('docente_cedulaDocente').value = cedula;
        }

        document.addEventListener('DOMContentLoaded', llenarCamposFormulario);
    </script>
    <body class="d-flex align-items-center justify-content-center" style="height: 100vh; background-color: #f8f9fa;">
        <div class="card col-sm-6">
            <div class="card-body">
                <form action="ControladorBanco" method="POST">
                     <div class="form-group">
                        <label>Id Cuenta Bancaria:</label>
                        <input type="number" name="idUpdate" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Cedula del docente:</label>
                        <input type="number" name="intFkdocente" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Institucion Financiera:</label>
                        <input type="text" name="txtInstitucion" class="form-control">
                    </div>
                    <div class="form-group">
                        <label>Tipo de cuenta:</label>
                        <div>
                            <select class="form-control" name="txtTipo" class="form-control form-control-sm">
                                <option value="Ahorros">Ahorros</option>
                                <option value="Corriente">Corriente</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Numero de Cuenta:</label>
                        <input type="number" name="intNumcuenta" class="form-control">
                    </div>
                    <div>
                        <input type="submit" name="cuenta" value="Agregar" class="btn btn-info">
                        <input type="submit" name="cuenta" value="Actualizar" class="btn btn-success">
                    </div>
                    <%
                        if (request.getAttribute("cajitamensajebase") != null) {
                            out.println(request.getAttribute("cajitamensajebase"));
                        }
                    %>
                </form>
            </div>
        </div>


    </body>
</html>

