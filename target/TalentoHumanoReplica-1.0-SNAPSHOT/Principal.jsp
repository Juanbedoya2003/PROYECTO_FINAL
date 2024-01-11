<%-- 
    Document   : principal
    Created on : 23/12/2023, 21:51:35
    Author     : Juan Bedoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
         <!-- Ionic icons -->
    <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>Menu Principal</title>

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a  style="margin-left: 10px; border: none"class="btn btn-outline-light" href=""><i class="icon ion-md-home mr-1"></i>RRHH</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle" href="Controlador?menu=Docente&accion=Listar"  target="myFrame" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           <i class="icon ion-md-people mr-1"></i> Docentes
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="Controlador?menu=Docente" target="myFrame">Datos Docente </a>
                            <a class="dropdown-item" href="Controlador?menu=Asistencia" target="myFrame">Asistencia </a>
                            <a class="dropdown-item" href="Controlador?menu=Permisos" target="myFrame">Permisos </a>
                            <a class="dropdown-item" href="Controlador?menu=Vacaciones" target="myFrame">Vacaciones </a>
                            <a class="dropdown-item" href="Controlador?menu=Discapacidad" target="myFrame">Discapacidad</a>
                            <a class="dropdown-item" href="Controlador?menu=Evaluacion" target="myFrame">Evaluacion Desempeño</a>
                            <a class="dropdown-item" href="Controlador?menu=contactoEmergencia" target="myFrame">Contactos de emergencia</a>
                            <a class="dropdown-item" href="Controlador?menu=Capacitaciones" target="myFrame">Eventos de Capacitacion</a>
                            <a class="dropdown-item" href="Controlador?menu=FormacionAcademica" target="myFrame">Formacion Academica</a>
                            <a class="dropdown-item" href="Controlador?menu=InclusionLaboral" target="myFrame">Inclusion Laboral</a>
                            <a class="dropdown-item" href="Controlador?menu=experienciaLaboral" target="myFrame">Experiencia Laboral</a>
                            <a class="dropdown-item" href="Controlador?menu=HojaRuta" target="myFrame">Hoja Ruta</a>
                            <a class="dropdown-item" href="Controlador?menu=CuentaBancaria" target="myFrame">Cuenta Bancaria</a>
                            <a class="dropdown-item" href="Controlador?menu=conyuge" target="myFrame">Conyuge</a>
                            <a class="dropdown-item" href="Controlador?menu=hijos" target="myFrame">Hijos del Docente</a>
                            <!-- Agrega más opciones según tus necesidades -->
                        </div>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistrarAsistencia" target="myFrame"><i class="icon ion-md-clipboard mr-1"></i>Asistencias</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistrarPermiso" target="myFrame"><i class="icon ion-md-calendar mr-1"></i>Permisos</a>
                    </li>
                    <li class="nav-item">
                        <a  style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=RegistrarVacaciones" target="myFrame"><i class="icon ion-md-browsers mr-1"></i>Vacaciones</a>
                    </li>


                </ul>
            </div>

                <div class="ml-auto">
                    <div class="nav-item dropdown">
                        <button  style="border: none; " class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            ${usuario.getApellidos()}
                        </button>
                        <div class="dropdown-menu dropdown-menu-right text-center">
                            <a class="dropdown-item" href="#">
                                <img src="img/user.png" alt="60" width="60"/>
                            </a>
                            <a class="dropdown-item" href="#">${usuario.getUser()}</a>
                            <a class="dropdown-item" href="#">Usuario@gmail.com</a>

                            <div class="dropdown-divider"></div>
                            <form action="Validar" method="POST">
                                <button name="accion" value="Salir" class="dropdown-item" href="#"><i class="icon ion-md-exit mr-3"></i>Salir</button>
                            </form>
                        </div>
                    </div> 
        </nav>




        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%; border: none;"></iframe>
        </div>






        <!-- Scripts necesarios, como Bootstrap y tu propio script personalizado si es necesario -->
        <!-- ... -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>

