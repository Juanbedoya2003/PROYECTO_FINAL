<%-- 
    Document   : Vacaciones
    Created on : 26/12/2023, 19:19:39
    Author     : Juan Bedoya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
        <title>Vacaciones</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <form action="Controlador?menu=RegistrarVacaciones"method="POST">
                        <div class="card-body">
                            <div class="form-group"> 
                                <label><i class="icon ion-md-people mr-1"></i>Datos Docente:</label>
                            </div>
                            <div class="form-group d-flex"> 
                                <div class="col-sm-5 d-flex">
                                    
                                    <button  type="text" name="codigopermiso1"  style="width: 30%; border: 1px solid #ccc; padding: 6px; box-sizing: border-box; outline: none;"><i class="icon ion-md-barcode"></i></button>

                                    <!-- Segundo input (más grande) -->
                                    <input type="text" name="codigopermiso2" style="width: 40%; border: 1px solid #ccc; padding: 6px; box-sizing: border-box; outline: none;">

                                    <!-- Tercer input (Botón Buscar, más pequeño) -->
                                    <button type="submit" name="accion" value="Buscar" style="width: 30%; border: 1px solid #ccc; padding: 6px; box-sizing: border-box; outline: none; background-color: #f0f0f0;" class="btn btn-outline-info"><i class="icon ion-md-search"></i></button>
                                </div>
                                <div class="col-sm-7">
                                    <input type="text" name="nombresdocente" class="form-control">
                                </div>
                            </div>

                            <div class="form-group"> 
                                <label><i class="icon ion-md-document mr-1"></i>Datos Vacaciones:</label>
                            </div>
                            <div class="form-group d-flex"> 
                                <div class="col-sm-5 d-flex">
                                    <button type="text" name="codigopermiso1" style="width: 30%; border: 1px solid #ccc; padding: 6px; box-sizing: border-box; outline: none;"><i class="icon ion-md-barcode"></i></button>

                                    <!-- Segundo input (más grande) -->
                                    <input type="text" name="codigopermiso2" style="width: 40%; border: 1px solid #ccc; padding: 6px; box-sizing: border-box; outline: none;">

                                    <!-- Tercer input (Botón Buscar, más pequeño) -->
                                    <button type="submit" name="accion" value="Buscar" style="width: 30%; border: 1px solid #ccc; padding: 6px; box-sizing: border-box; outline: none; background-color: #f0f0f0;" class="btn btn-outline-info"><i class="icon ion-md-search"></i></button>
                                </div>
                                <div class="col-sm-7">
                                    <input type="text" name="nombresdocente" class="form-control">
                                </div>
                            </div>
                            <div class="form-group d-flex"> 
                                <div class="col-sm-5 d-flex">
                                    <button type="text" name="codigovacacion" class="form-control" placeholder="Codigo"></button>
                                </div>
                                <div class="col-sm-3">
                                    <input type="text" name="nombresdocente" class="form-control">
                                </div>
                                <div class="col-sm-3">
                                    <input type="text" name="nombresdocente" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm">
                                    <button type="submit" name="accion" value="Agregar" class="btn btn-outline-info"><i class="icon ion-md-person mr-1"></i>Agregar vacacion</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-6 ml-auto">
                            <label>NumeroSerie</label>
                            <input type="text" name="NroSerie" class="form-control">
                        </div>
                        <br>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Nro</th>
                                    <th>Codigo</th>
                                    <th>Fecha</th>
                                    <th>Hora Entrada</th>
                                    <th>Hora Salida</th>
                                    <th>Observacion</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td class="d-flex">
                                        <a href="#" class="btn btn-success" style="background: white"><i class="icon ion-md-checkmark" style="color: #28a745;"></i></a>
                                        <a href="#" class="btn btn-danger" style=" background: white; margin-left: 10px"><i class="icon ion-md-trash" style="color: #dc3545;"></i></a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>

                    </div>
                    <div class="card-footer">
                        <div>
                            <button type="submit" name="accion" value="Generar Asistencia" class="btn btn-success"><i class="icon ion-md-paper mr-1"></i>Generar Asistencia</button>
                            <button type="submit" name="accion" value="Cancelar" class="btn btn-danger"><i class="icon ion-md-power mr-1"></i>Cancelar</button>
                        </div>

                    </div>
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
