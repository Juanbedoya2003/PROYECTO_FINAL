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
import modeloDTO.InclusionLaboral;

public class InclusionLaboralDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public InclusionLaboralDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(InclusionLaboral in) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into inclusionLaboral values(null,'" + in.getMigrante() + "','" + in.getNacionalidad() + "','" + in.getEmbarazo() + "','" + in.getMesesembarazo() + "','" + in.getLicencia() + "','" + in.getPorcentaje() + "','" + in.getFkdocente() + "')";
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
        InclusionLaboral objDAOinclusionlaboral;

        ArrayList<InclusionLaboral> arrInclusionLaboral = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resInclusionLaboral = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from inclusionLaboral";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resInclusionLaboral = stm.executeQuery(sql);
            while (resInclusionLaboral.next()) {//mientras el objeto tengo registros
                objDAOinclusionlaboral = new InclusionLaboral(resInclusionLaboral.getInt("idInclusionLaboral"), resInclusionLaboral.getString("inclMigrante"), resInclusionLaboral.getString("inclNacionalidad"), resInclusionLaboral.getString("inclEmbarazo"), resInclusionLaboral.getString("inclMesesEmbarazo"), resInclusionLaboral.getString("inclLicencia"), resInclusionLaboral.getString("inclPorcentaje"), resInclusionLaboral.getInt("docente_cedulaDocente"));
                arrInclusionLaboral.add(objDAOinclusionlaboral);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrInclusionLaboral;
    }
    //METODO PARA SELECCIONAR TODO EN UNA TABLA

    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        InclusionLaboral objinc;

        ArrayList<InclusionLaboral> arrInclusionLaboral = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resInclusionLaboral = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from inclusionLaboral where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resInclusionLaboral = stm.executeQuery(sql);
            while (resInclusionLaboral.next()) {//mientras el objeto tengo registros
                objinc = new InclusionLaboral(resInclusionLaboral.getInt("idInclusionLaboral"), resInclusionLaboral.getString("inclMigrante"), resInclusionLaboral.getString("inclNacionalidad"), resInclusionLaboral.getString("inclEmbarazo"), resInclusionLaboral.getString("inclMesesEmbarazo"), resInclusionLaboral.getString("inclLicencia"), resInclusionLaboral.getString("inclPorcentaje"), resInclusionLaboral.getInt("docente_cedulaDocente"));
                arrInclusionLaboral.add(objinc);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrInclusionLaboral;
    }
    //metodo para borrar

    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from inclusionLaboral where idInclusionLaboral = " + idDelete;
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

    public boolean EditarTODO(InclusionLaboral objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE inclusionLaboral SET inclMigrante = '" + objupdate.getMigrante() + "', "
                + "inclNacionalidad = '" + objupdate.getNacionalidad() + "', inclEmbarazo = '" + objupdate.getEmbarazo() + "', "
                + "inclMesesEmbarazo = '" + objupdate.getMesesembarazo() + "', inclLicencia = '" + objupdate.getLicencia() + "', "
                + "inclPorcentaje = '" + objupdate.getPorcentaje() + "' "
                + "WHERE idInclusionLaboral = " + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM inclusionLaboral WHERE idInclusionLaboral = " + id;

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
