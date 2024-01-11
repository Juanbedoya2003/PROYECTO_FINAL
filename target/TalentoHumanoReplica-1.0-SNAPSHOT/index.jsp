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
        <title>Login</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
                            <input type="text" name="txtuser" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Password:</label>
                            <input type="password" name="txtpass" class="form-control">
                        </div> 

                        <input type="submit" name="accion" value="Ingresar" href="index.jsp" class=" btn btn-primary btn-block" style="margin-bottom: 30px;">

                    </form>
                </div>
            </div>      
        </div>




        <!-- Scripts necesarios, como Bootstrap y tu propio script personalizado si es necesario -->
        <!-- ... -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
