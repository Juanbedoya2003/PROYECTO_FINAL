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
import modeloDTO.Discapacidad;



public class DiscapacidadDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public DiscapacidadDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(Discapacidad di) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into discapacidad values(null,'" + di.getSituacion() + "','" + di.getTiporelacion() + "','" + di.getNumcarnetconadis() + "','" + di.getCertificado() + "','" + di.getTipo() + "','" + di.getPorcentaje() + "','" +  di.getTipoenfermedad() + "','" + di.getFkdocente() + "')";
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
        Discapacidad objDAOdiscapacidad;

        ArrayList<Discapacidad> arrDiscapacidad = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resDiscapacidad = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from discapacidad";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resDiscapacidad = stm.executeQuery(sql);
            while (resDiscapacidad.next()) {//mientras el objeto tengo registros
                objDAOdiscapacidad = new Discapacidad(resDiscapacidad.getInt("idDiscapacidad"),
                        resDiscapacidad.getString("discSituacionDisc"), 
                        resDiscapacidad.getString("discTipoRelacionDisc"), 
                        resDiscapacidad.getString("discNumeroConadis"), 
                        resDiscapacidad.getString("discCertificadoDiscSiNo"),
                        resDiscapacidad.getString("discTipoDisc"), 
                        resDiscapacidad.getString("discPorcentajeDisc"),
                        resDiscapacidad.getString("discTipoEnfermedad"), 
                        resDiscapacidad.getInt("docente_cedulaDocente"));
                arrDiscapacidad.add(objDAOdiscapacidad);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrDiscapacidad;
    }
     //METODO PARA SELECCIONAR TODO EN UNA TABLA
    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        Discapacidad objdis;

        ArrayList<Discapacidad> arrDiscapacidad = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resDiscapacidad = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from discapacidad where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resDiscapacidad = stm.executeQuery(sql);
            while (resDiscapacidad.next()) {//mientras el objeto tengo registros
                objdis = new Discapacidad(resDiscapacidad.getInt("idDiscapacidad"), resDiscapacidad.getString("discSituacionDisc"), resDiscapacidad.getString("discTipoRelacionDisc"), resDiscapacidad.getString("discNumeroConadis"), resDiscapacidad.getString("discCertificadoDiscSiNo"), resDiscapacidad.getString("discTipoDisc"), resDiscapacidad.getString("discPorcentajeDisc"), resDiscapacidad.getString("discTipoEnfermedad"), resDiscapacidad.getInt("docente_cedulaDocente"));
                arrDiscapacidad.add(objdis);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrDiscapacidad;
    }
        //metodo para borrar
    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from discapacidad where idDiscapacidad = " + idDelete;
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
    public boolean EditarTODO(Discapacidad objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE discapacidad SET discSituacionDisc = '" + objupdate.getSituacion()+ "', "
                + "discTipoRelacionDisc = '" + objupdate.getTiporelacion() + "', discNumeroConadis = '" + objupdate.getNumcarnetconadis()+ "', "
                + "discCertificadoDiscSiNo = '" + objupdate.getCertificado() + "', discTipoDisc = '" + objupdate.getTipo() + "', "
                + "discPorcentajeDisc = '" + objupdate.getPorcentaje() + "', discTipoEnfermedad = '" + objupdate.getTipoenfermedad() + "' "
                + "WHERE idDiscapacidad = " + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM discapacidad WHERE idDiscapacidad = " + id;

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