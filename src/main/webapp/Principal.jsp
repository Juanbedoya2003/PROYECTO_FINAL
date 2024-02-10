<%-- 
    Document   : principal
    Created on : 23/12/2023, 21:51:35
    Author     : Juan Bedoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
    <title>MENU PRINCIPAL</title>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
            <a class="navbar-brand" href="Principal.jsp"></a>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a  style="margin-left: 10px; border: none"class="btn btn-outline-light" href=""><i class="icon ion-md-home mr-1"></i>RRHH</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle"  target="myFrame" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="icon ion-md-people mr-1"></i> Docentes
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="Docente.jsp" target="myFrame">Datos Docente </a>
                            <a class="dropdown-item" href="Asistencia.jsp" target="myFrame">Asistencia </a>
                            <a class="dropdown-item" href="Permisos.jsp" target="myFrame">Permisos </a>
                            <a class="dropdown-item" href="Vacaciones.jsp" target="myFrame">Vacaciones </a>
                            <a class="dropdown-item" href="Discapacidad.jsp" target="myFrame">Discapacidad</a>
                            <a class="dropdown-item" href="Evaluacion.jsp" target="myFrame">Evaluacion Desempeño</a>
                            <a class="dropdown-item" href="contactoEmergencia.jsp" target="myFrame">Contactos de emergencia</a>
                            <a class="dropdown-item" href="Capacitaciones.jsp" target="myFrame">Eventos de Capacitacion</a>
                            <a class="dropdown-item" href="FormacionAcademica.jsp" target="myFrame">Formacion Academica</a>
                            <a class="dropdown-item" href="InclusionLaboral.jsp" target="myFrame">Inclusion Laboral</a>
                            <a class="dropdown-item" href="experienciaLaboral.jsp" target="myFrame">Experiencia Laboral</a>
                            <a class="dropdown-item" href="HojaRuta.jsp" target="myFrame">Hoja Ruta</a>
                            <a class="dropdown-item" href="CuentaBancaria.jsp" target="myFrame">Cuenta Bancaria</a>
                            <a class="dropdown-item" href="conyuge.jsp" target="myFrame">Conyuge</a>
                            <a class="dropdown-item" href="hijos.jsp" target="myFrame">Hijos del Docente</a>
                        </div>
                    </li>

                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="ReporteAsistencia.jsp" target="myFrame"><i class="icon ion-md-clipboard mr-1"></i>Asistencias</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="ReportePermiso.jsp" target="myFrame"><i class="icon ion-md-calendar mr-1"></i>Permisos</a>
                    </li>
                    <li class="nav-item">
                        <a  style="margin-left: 10px; border: none" class="btn btn-outline-light" href="ReporteVacacion.jsp" target="myFrame"><i class="icon ion-md-browsers mr-1"></i>Vacaciones</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-light dropdown-toggle"   target="myFrame" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="icon ion-md-document"></i> Reportes
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="ReporteDocente.jsp" target="myFrame">Reporte Docente </a>
                            <a class="dropdown-item" href="ReporteDiscapacidad.jsp" target="myFrame">Reporte Discapacidad</a>
                            <a class="dropdown-item" href="ReporteEvaluacion.jsp" target="myFrame">Reporte Evaluacion</a>
                            <a class="dropdown-item" href="ReporteContactoEmergencia.jsp" target="myFrame">Reporte Contacto Emergencia</a>
                            <a class="dropdown-item" href="ReporteCapacitaciones.jsp" target="myFrame">Reporte Capacitaciones</a>
                            <a class="dropdown-item" href="ReporteFormacionAcademica.jsp" target="myFrame">Reporte Formacion</a>
                            <a class="dropdown-item" href="ReporteInclusionLaboral.jsp" target="myFrame">Reporte Inclusion </a>
                            <a class="dropdown-item" href="ReporteExperienciaLaboral.jsp" target="myFrame">Reporte Experiencia</a>
                            <a class="dropdown-item" href="ReporteHojaRuta.jsp" target="myFrame">Reporte Hoja Ruta</a>
                            <a class="dropdown-item" href="ReporteBanco.jsp" target="myFrame">Reporte Banco</a>
                            <a class="dropdown-item" href="ReporteConyuge.jsp" target="myFrame">Reporte Conyuge</a>
                            <a class="dropdown-item" href="ReporteHijo.jsp" target="myFrame">Reporte Hijos</a>

                        </div>
                    </li>


                </ul>
            </div>

            <div class="ml-auto">
                <div class="nav-item dropdown">
                    <button  style="border: none; " class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">

                    </button>
                    <div class="dropdown-menu dropdown-menu-right text-center">
                        <a class="dropdown-item" href="#">
                            <img src="img/user.png" alt="60" width="60"/>
                        </a>
                        <a class="dropdown-item" href="#"></a>
                        <a class="dropdown-item" href="#">Usuario@gmail.com</a>

                        <div class="dropdown-divider"></div>
                        <form action="" method="POST">
                            <button   class="dropdown-item" href="index.jsp"><i class="icon ion-md-exit mr-3"></i>Salir</button>
                        </form>
                    </div>
                </div> 
        </nav>




        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%; width: 100%; border: none;"></iframe>
        </div>
        
    </body>
</html>

