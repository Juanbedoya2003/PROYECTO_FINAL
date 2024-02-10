<%-- 
    Document   : index
    Created on : 23/12/2023, 21:51:24
    Author     : Juan Bedoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>LOGIN</title>

        <style>
            body {
                background-color: #f0f0f0;
            }

            .login-container {
                margin-top: 100px;
                margin-bottom: 15px;
                padding: 20px; /* Aumenta el espacio interno del contenedor */
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            .login-form {
                background-color: #ffffff;
            }

            .submit-button-container {
                margin-top: 15px; /* Separación hacia abajo para el nuevo contenedor */
            }

            .submit-button {
                width: 100%; /* Ocupa el ancho completo del contenedor */
            }
        </style>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class="form-sign" action="ControladorValidar" method="POST">
                        <div class="form-group text-center"> 
                            <h3>Login</h3>
                            <img src="img/imagenLOGIN.png" alt="70" width="170"/>
                            <label>Bienvenidos al Sistema</label>
                        </div>
                        <div class="form-group"> 
                            <label>Usuario:</label>
                            <input type="text" name="txtuser"  class="form-control" value="root">
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" name="txtpass"  class="form-control" value="1234" >
                        </div> 

                        <input type="submit" name="accion" value="Ingresar"  class=" btn btn-primary btn-block" style="margin-bottom: 30px;">
                    </form>
                    <%
                     if (request.getAttribute("loginAttempts") != null) {
                         out.print(request.getAttribute("loginAttempts"));
                     }

                    %>
                </div>
            </div>      
        </div>

    </body>
</html>
