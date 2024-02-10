package modeloDAO;

import Modelo.ConexionBd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloDTO.Evaluacion;

public class EvaluacionDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public EvaluacionDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(Evaluacion ev) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into evaluacion values(null,'" + ev.getPeriodoinicio() + "','" + ev.getPeriodohasta() + "','" + ev.getNombreinstitucion() + "','" + ev.getPuntaje() + "','" + ev.getCalificacion() + "','" + ev.getObservacion() + "','" + ev.getFkdocente() + "')";
        try{
            conecta.connection();//abro la conexión a la bd
            stm = conecta.getJdbcConnection().createStatement();
        stm.execute(sql); //Ejecuto script de insersion en la bd
        estado=true;
        stm.close();
        conecta.discconect();
        }
        catch(SQLException ex){
        estado=false;
        ex.printStackTrace();
    }
        return estado;
    }
     //METODO PARA SELECCIONAR TODO EN UNA TABLA
    public ArrayList SeleccionarTodo() {
        //zona de objetos
        Evaluacion objDAOevaluacion;

        ArrayList<Evaluacion> arrEvaluacion = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resEvaluacion = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from evaluacion";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resEvaluacion = stm.executeQuery(sql);
            while (resEvaluacion.next()) {//mientras el objeto tengo registros
                objDAOevaluacion = new Evaluacion(resEvaluacion.getInt("idEvaluacion"), resEvaluacion.getString("evaPeriodeDesde"), resEvaluacion.getString("evaPeriodoHasta"), resEvaluacion.getString("evaNombreInstitucion"), resEvaluacion.getString("evaPuntaje"), resEvaluacion.getString("evaCalificacion"), resEvaluacion.getString("evaObservacion"), resEvaluacion.getInt("docente_cedulaDocente"));
                arrEvaluacion.add(objDAOevaluacion);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrEvaluacion;
    }
      //METODO PARA SELECCIONAR TODO EN UNA TABLA
    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        Evaluacion objeva;

        ArrayList<Evaluacion> arrEvaluacion = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resEvaluacion = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from evaluacion where docente_cedulaDocente = "+ cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resEvaluacion = stm.executeQuery(sql);
            while (resEvaluacion.next()) {//mientras el objeto tengo registros
                objeva = new Evaluacion(resEvaluacion.getInt("idEvaluacion"), resEvaluacion.getString("evaPeriodeDesde"), resEvaluacion.getString("evaPeriodoHasta"), resEvaluacion.getString("evaNombreInstitucion"), resEvaluacion.getString("evaPuntaje"), resEvaluacion.getString("evaCalificacion"), resEvaluacion.getString("evaObservacion"), resEvaluacion.getInt("docente_cedulaDocente"));
                arrEvaluacion.add(objeva);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrEvaluacion;
    }
   public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from evaluacion where idEvaluacion = " + idDelete;
        try {
            conecta.connection();
            stm = conecta.getJdbcConnection().createStatement();
            stm.executeUpdate(sql);
            estado = true;
            stm.close();
            conecta.discconect();

        } catch (SQLException e) {
            estado = false;
            e.printStackTrace();
        }
        return estado;
    }
    //METODO PARA MODIFICAR
    public boolean EditarTODO(Evaluacion objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE evaluacion SET evaPeriodeDesde = '" + objupdate.getPeriodoinicio()+ "', "
                + "evaPeriodoHasta = '" + objupdate.getPeriodohasta() + "', evaNombreInstitucion = '" + objupdate.getNombreinstitucion()+ "', "
                + "evaPuntaje = '" + objupdate.getPuntaje()+ "', "
                + "evaCalificacion = '" + objupdate.getCalificacion() + "', evaObservacion = '" + objupdate.getObservacion() + "' "
                + "WHERE idEvaluacion = " + objupdate.getId();
        try {

            conecta.connection();
            stm = conecta.getJdbcConnection().createStatement();
            stm.executeUpdate(sql);
            estado = true;
            stm.close();
            conecta.discconect();
        } catch (SQLException err) {
            estado = false;
            err.printStackTrace();
        }
        return estado;
    }
     // Método para verificar la existencia de un registro por su ID
    public boolean existeRegistro(int id) {
        Statement stm;
        ResultSet result = null;
        String sql = "SELECT COUNT(*) AS count FROM evaluacion WHERE idEvaluacion = " + id;

        try {
            conecta.connection();
            stm = conecta.getJdbcConnection().createStatement();
            result = stm.executeQuery(sql);
            result.next();
            int count = result.getInt("count");

            stm.close();
            conecta.discconect();

            return count > 0; // Si count > 0, el registro existe
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En caso de error, asumimos que el registro no existe
        }
    }
}