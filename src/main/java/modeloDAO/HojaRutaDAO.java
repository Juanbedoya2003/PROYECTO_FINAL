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
import modeloDTO.HojaRuta;

public class HojaRutaDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public HojaRutaDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(HojaRuta ho) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into hojaRuta values(null,'" + ho.getFecha() + "','" + ho.getHorainicio() + "','" + ho.getHorafin() 
                + "','" + ho.getHoratotal() + "','" + ho.getObservacion() + "','" + ho.getEstado() + "','" + ho.getFkdocente() + "')";
        try {
            conecta.connection();//abro la conexión a la bd
            stm = conecta.getJdbcConnection().createStatement();
            stm.execute(sql); //Ejecuto script de insersion en la bd
            estado = true;
            stm.close();
            conecta.discconect();
        } catch (SQLException ex) {
            estado = false;
            ex.printStackTrace();
        }
        return estado;
    }
    //METODO PARA SELECCIONAR TODO EN UNA TABLA

    public ArrayList SeleccionarTodo() {
        //zona de objetos
        HojaRuta objDAOhojaruta;

        ArrayList<HojaRuta> arrHojaRuta = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resHojaRuta = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from hojaRuta";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resHojaRuta = stm.executeQuery(sql);
            while (resHojaRuta.next()) {//mientras el objeto tengo registros
                objDAOhojaruta = new HojaRuta(resHojaRuta.getInt("idHojaRuta"), resHojaRuta.getString("hojaFecha"), 
               resHojaRuta.getString("hojaHoraInicia"), resHojaRuta.getString("hojaHoraFinaliza"),
               resHojaRuta.getDouble("hojaHoraTotal"), resHojaRuta.getString("hojaObservacion"),
               resHojaRuta.getString("hojaEstado"),resHojaRuta.getInt("docente_cedulaDocente"));
                arrHojaRuta.add(objDAOhojaruta);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrHojaRuta;
    }
    //METODO PARA SELECCIONAR TODO EN UNA TABLA

    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        HojaRuta objhij;

        ArrayList<HojaRuta> arrHojaRuta = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resHojaRuta = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from hojaRuta where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resHojaRuta = stm.executeQuery(sql);
            while (resHojaRuta.next()) {//mientras el objeto tengo registros
                objhij = new HojaRuta(resHojaRuta.getInt("idHojaRuta"), resHojaRuta.getString("hojaFecha"), resHojaRuta.getString("hojaHoraInicia"), 
                resHojaRuta.getString("hojaHoraFinaliza"), resHojaRuta.getDouble("hojaHoraTotal"), resHojaRuta.getString("hojaObservacion"),
                 resHojaRuta.getString("hojaEstado"),resHojaRuta.getInt("docente_cedulaDocente"));
                arrHojaRuta.add(objhij);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrHojaRuta;
    }
    //metodo para borrar

    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from hojaRuta where idHojaRuta = " + idDelete;
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

    public boolean EditarTODO(HojaRuta objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE hojaRuta SET hojaFecha = '" + objupdate.getFecha() + "', "
                + "hojaHoraInicia = '" + objupdate.getHorainicio() + "', hojaHoraFinaliza = '" + objupdate.getHorafin() + "', "
                + "hojaHoraTotal = '" + objupdate.getHoratotal() + "', hojaObservacion = '" + objupdate.getObservacion() + "',"
                + "hojaEstado = '" + objupdate.getEstado() + "' "
                + "WHERE idHojaRuta = " + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM hojaRuta WHERE idHojaRuta = " + id;

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
