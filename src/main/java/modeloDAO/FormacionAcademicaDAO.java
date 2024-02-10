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
import modeloDTO.FormacionAcademica;

public class FormacionAcademicaDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public FormacionAcademicaDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(FormacionAcademica fo) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into formacionAcademica values(null,'" + fo.getInstitucioneducativa() + "','" + fo.getNivelinstruccion() + "','" + fo.getNumerocertificado() + "','" + fo.getAniosaprobados() + "','" + fo.getAreaconocimiento() + "','" + fo.getEgresadograduado() + "','" + fo.getTitulobtenido() + "','" + fo.getPaistitulo() + "','" + fo.getFkdocente() + "')";
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
        FormacionAcademica objDAOformacionacademica;

        ArrayList<FormacionAcademica> arrFormacionAcademica = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resFormacionAcademica = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from formacionAcademica";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resFormacionAcademica = stm.executeQuery(sql);
            while (resFormacionAcademica.next()) {//mientras el objeto tengo registros
                objDAOformacionacademica = new FormacionAcademica(resFormacionAcademica.getInt("idFormacionAcademica"), resFormacionAcademica.getString("formInstitucionEducativa"), resFormacionAcademica.getString("formNivelInstruccion"), resFormacionAcademica.getString("formNumeroCertificadoSenecyt"), resFormacionAcademica.getInt("formNumeroAniosAprobados"), resFormacionAcademica.getString("formAreaConocimiento"), resFormacionAcademica.getString("formEgresadoGraduado"), resFormacionAcademica.getString("formTituloObtenido"), resFormacionAcademica.getString("formPaisTituloObtenido"), resFormacionAcademica.getInt("docente_cedulaDocente"));
                arrFormacionAcademica.add(objDAOformacionacademica);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrFormacionAcademica;
    }
    //METODO PARA SELECCIONAR TODO EN UNA TABLA

    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        FormacionAcademica objfor;

        ArrayList<FormacionAcademica> arrFormacionAcademica = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resFormacionAcademica = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from formacionAcademica where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resFormacionAcademica = stm.executeQuery(sql);
            while (resFormacionAcademica.next()) {//mientras el objeto tengo registros
                objfor = new FormacionAcademica(resFormacionAcademica.getInt("idFormacionAcademica"), resFormacionAcademica.getString("formInstitucionEducativa"), resFormacionAcademica.getString("formNivelInstruccion"), resFormacionAcademica.getString("formNumeroCertificadoSenecyt"), resFormacionAcademica.getInt("formNumeroAniosAprobados"), resFormacionAcademica.getString("formAreaConocimiento"), resFormacionAcademica.getString("formEgresadoGraduado"), resFormacionAcademica.getString("formTituloObtenido"), resFormacionAcademica.getString("formPaisTituloObtenido"), resFormacionAcademica.getInt("docente_cedulaDocente"));
                arrFormacionAcademica.add(objfor);//cargo cada registo en el array 
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrFormacionAcademica;
    }
    //metodo para borrar

    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from formacionAcademica where idFormacionAcademica = " + idDelete;
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

    public boolean EditarTODO(FormacionAcademica objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE formacionAcademica SET formInstitucionEducativa = '" + objupdate.getInstitucioneducativa() + "', "
                + "formNivelInstruccion = '" + objupdate.getNivelinstruccion() + "', formNumeroCertificadoSenecyt = '" + objupdate.getNumerocertificado() + "', "
                + "formNumeroAniosAprobados = '" + objupdate.getAniosaprobados() + "', formAreaConocimiento = '" + objupdate.getAreaconocimiento() + "', "
                + "formEgresadoGraduado = '" + objupdate.getEgresadograduado() + "', formTituloObtenido = '" + objupdate.getTitulobtenido() + "', "
                + "formPaisTituloObtenido = '" + objupdate.getPaistitulo() + "' "
                + "WHERE idFormacionAcademica = " + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM formacionAcademica WHERE idFormacionAcademica = " + id;

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
