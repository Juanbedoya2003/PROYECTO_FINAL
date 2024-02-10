/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import Modelo.ConexionBd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloDTO.Permiso;


public class PermisoDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public PermisoDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(Permiso pe) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into permiso values(null,'" + pe.getMotivo() + "','" + pe.getFechaInicio() + "','" + pe.getFechaFin()+"','" + pe.getDiasSolicitados() + "','" + pe.getHorasSolicitadas() + "','" + pe.getHoraInicio() + "','" + pe.getHoraFin() + "','" +  pe.getCantidadDescontar() + "','" + pe.getObservacion() + "','" + pe.getEstado() + "','" + pe.getFkdocente() + "')";
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
        Permiso objDAOpermiso;

        ArrayList<Permiso> arrPermiso = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resPermiso = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from permiso";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resPermiso = stm.executeQuery(sql);
            while (resPermiso.next()) {//mientras el objeto tengo registros
                objDAOpermiso = new Permiso(resPermiso.getInt("idPermiso"), resPermiso.getString("permMotivo"),
                resPermiso.getString("permFechaInicio"), resPermiso.getString("permFechaFin"),
                resPermiso.getInt("permDiasSolicitar"), resPermiso.getInt("permHorasSolictar"), resPermiso.getString("permHoraInicio"),
                resPermiso.getString("permHoraFinaliza"), resPermiso.getDouble("permCantidadDescontar"), 
                resPermiso.getString("permObservacion"), resPermiso.getString("permEstado"),
                resPermiso.getInt("docente_cedulaDocente"));
                arrPermiso.add(objDAOpermiso);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrPermiso;
    }
      //METODO PARA SELECCIONAR TODO EN UNA TABLA
    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        Permiso objper;

        ArrayList<Permiso> arrPermiso = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resPermiso = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from permiso where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resPermiso = stm.executeQuery(sql);
            while (resPermiso.next()) {//mientras el objeto tengo registros
                objper = new Permiso(resPermiso.getInt("idPermiso"), resPermiso.getString("permMotivo"), resPermiso.getString("permFechaInicio"),
                resPermiso.getString("permFechaFin"),resPermiso.getInt("permDiasSolicitar"),resPermiso.getInt("permHorasSolictar"),
                resPermiso.getString("permHoraInicio"), resPermiso.getString("permHoraFinaliza"),
                resPermiso.getDouble("permCantidadDescontar"),  resPermiso.getString("permObservacion"),
                resPermiso.getString("permEstado"), resPermiso.getInt("docente_cedulaDocente"));
                arrPermiso.add(objper);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrPermiso;
    }
      //metodo para borrar
    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from permiso where idPermiso = " + idDelete;
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
    public boolean EditarTODO(Permiso objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE permiso SET permMotivo = '" + objupdate.getMotivo() + "', "
                + "permFechaInicio = '" + objupdate.getFechaInicio()+ "', permFechaFin = '" + objupdate.getFechaFin() + "', permDiasSolicitar='"+objupdate.getDiasSolicitados()+"',"
                + "permHorasSolictar = '" + objupdate.getHorasSolicitadas() + "', permHoraInicio = '" + objupdate.getHoraInicio()+ "', "
                + "permHoraFinaliza = '" + objupdate.getHoraFin() + "', permCantidadDescontar = '" + objupdate.getCantidadDescontar() + "', "
                + "permObservacion = '" + objupdate.getObservacion() + "', permEstado = '" + objupdate.getEstado() + "' "
                + "WHERE idPermiso = " + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM permiso WHERE idPermiso = " + id;

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
