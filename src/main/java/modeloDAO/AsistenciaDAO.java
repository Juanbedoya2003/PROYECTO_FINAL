/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import modeloDTO.Asistencia;
import Modelo.ConexionBd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AsistenciaDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public AsistenciaDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(Asistencia as) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into asistencia values(null,'" + as.getFecha() + "','" + as.getHoraEntrada() + "','" + as.getHoraSalida() + "','" + as.getHorasTrabajadas() + "','" + as.getObservacion() + "','" + as.getEstado() + "','" + as.getFkdocente() + "')";
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
        Asistencia objDAOasistencia;

        ArrayList<Asistencia> arrAsistencia = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resAsistencia = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from asistencia";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resAsistencia = stm.executeQuery(sql);
            while (resAsistencia.next()) {//mientras el objeto tengo registros
                objDAOasistencia = new Asistencia(resAsistencia.getInt("idAsistencia"), resAsistencia.getString("asisFecha"),
                        resAsistencia.getString("asisHoraEntrada"), resAsistencia.getString("asisHoraSalida"), resAsistencia.getString("asisHorasTrabajadas"),
                        resAsistencia.getString("asisObservacion"),
                        resAsistencia.getString("asisEstado"), resAsistencia.getInt("docente_cedulaDocente"));
                arrAsistencia.add(objDAOasistencia);//cargo cada registo en el array 

            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrAsistencia;
    }

    //metodo para selecionar un registro que cumpla con una condicion
    public ArrayList SeleccionarUno(String cedula) {

        Asistencia objasi;
        ArrayList<Asistencia> arrAsistencia = new ArrayList();
        Statement stm;
        ResultSet resAsistencia = null;
        String sql = "select * from asistencia where  docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resAsistencia = stm.executeQuery(sql);
            while (resAsistencia.next()) {//mientras el objeto tengo registros
                objasi = new Asistencia(resAsistencia.getInt("idAsistencia"), resAsistencia.getString("asisFecha"),
                        resAsistencia.getString("asisHoraEntrada"), resAsistencia.getString("asisHoraSalida"),resAsistencia.getString("asisHorasTrabajadas"),
                        resAsistencia.getString("asisObservacion"), resAsistencia.getString("asisEstado"),
                        resAsistencia.getInt("docente_cedulaDocente"));
                arrAsistencia.add(objasi);//cargo cada registo en el array 

            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrAsistencia;
    }
     //metodo para borrar
    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from asistencia where idAsistencia = " + idDelete;
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
    public boolean EditarTODO(Asistencia objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "update asistencia set asisFecha = '" + objupdate.getFecha() + "', "
                + " asisHoraEntrada = '" + objupdate.getHoraEntrada() + "',"
                + " asisHoraSalida = '" + objupdate.getHoraSalida() + "',"
                + " asisObservacion = '" + objupdate.getObservacion() + "',"
                + " asisEstado = '" + objupdate.getEstado()+ "'"     
                + " where idAsistencia = "
                + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM asistencia WHERE idAsistencia = " + id;

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


