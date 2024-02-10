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
import java.util.List;
import modeloDTO.Docente;

public class DocenteDAO {

    //zona de atributos
    private ConexionBd conecta;
//constructor

    public DocenteDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(Docente doc) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into docente values('" + doc.getCedula() + "','" + doc.getNacionalidad() + "','" + doc.getApellidos() + "','" + doc.getNombres() + "','" + doc.getFechaNac() + "','" 
                + doc.getTipoSangre() + "','" + doc.getGenero() + "','" + doc.getCorreo() + "','" + doc.getEstadocivil() +
                "','" + doc.getTelefonodomicilio() + "','" + doc.getTelefonocelular() + "','"
                + doc.getFechadeclaraciones() + "','" + doc.getFechaantecedentes() + "','" + doc.getProvincia() + "','" 
                + doc.getCanton() + "','" + doc.getParroquia() + "','" + doc.getCalleprincipal() + "','" + doc.getCallesecundaria() + "','" + doc.getNumcalleprincipal() + "','" 
                + doc.getNumcallesecundaria() + "','" + doc.getEtnia() + "','" + doc.getEstado() + "','" + doc.getUser() + "')";
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
        Docente objDAOdocente;

        ArrayList<Docente> arrDocente = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resDocente = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from docente";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resDocente = stm.executeQuery(sql);
            while (resDocente.next()) {//mientras el objeto tengo registros
                objDAOdocente = new Docente(resDocente.getInt("cedulaDocente"),
                        resDocente.getString("docNacionalidad"), resDocente.getString("docApellidos"),
                        resDocente.getString("docNombres"), resDocente.getString("docFechaNacimiento"),
                        resDocente.getString("docTipoSangre"), resDocente.getString("docGenero"),
                        resDocente.getString("docCorreo"), resDocente.getString("docEstadoCivil"),
                        resDocente.getString("docTelefonoDomicilio"), resDocente.getString("docTelefonoCelular"),
                        resDocente.getString("docFechaDeclaracionBienes"),
                        resDocente.getString("docFechaAntecedentesServPubl"),
                        resDocente.getString("docProvincia"), resDocente.getString("docCanton"),
                        resDocente.getString("docParroquia"), resDocente.getString("docCallePrincipal"),
                        resDocente.getString("docCalleSecundaria"), resDocente.getString("docCallePrincipalNumero"),
                        resDocente.getString("docCalleSecundariaNumero"), resDocente.getString("docEtnia"),
                        resDocente.getString("docEstado"), 
                        resDocente.getString("docUser"));
                arrDocente.add(objDAOdocente);//cargo cada registo en el array
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrDocente;
    }

    //METODO PARA SELECCIONAR TODO EN UNA TABLA
    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        Docente objdoc;

        ArrayList<Docente> arrDocente = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resDocente = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from docente where cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resDocente = stm.executeQuery(sql);
            while (resDocente.next()) {//mientras el objeto tengo registros
                   objdoc = new Docente(resDocente.getInt("cedulaDocente"),
                        resDocente.getString("docNacionalidad"), resDocente.getString("docApellidos"),
                        resDocente.getString("docNombres"), resDocente.getString("docFechaNacimiento"),
                        resDocente.getString("docTipoSangre"), resDocente.getString("docGenero"),
                        resDocente.getString("docCorreo"), resDocente.getString("docEstadoCivil"),
                        resDocente.getString("docTelefonoDomicilio"), resDocente.getString("docTelefonoCelular"),
                        resDocente.getString("docFechaDeclaracionBienes"),
                        resDocente.getString("docFechaAntecedentesServPubl"),
                        resDocente.getString("docProvincia"), resDocente.getString("docCanton"),
                        resDocente.getString("docParroquia"), resDocente.getString("docCallePrincipal"),
                        resDocente.getString("docCalleSecundaria"), resDocente.getString("docCallePrincipalNumero"),
                        resDocente.getString("docCalleSecundariaNumero"), resDocente.getString("docEtnia"),
                        resDocente.getString("docEstado"), 
                        resDocente.getString("docUser"));
                arrDocente.add(objdoc);//cargo cada registo en el array
            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrDocente;
    }
   //metodo para borrar
    public boolean Eliminar(String idDelete){
        //zona de variables
        
        boolean estado = false;
        Statement stm;
        String sql = "delete from docente where cedulaDocente = "+idDelete;
        try{
            conecta.connection();
            stm = conecta.getJdbcConnection().createStatement();
            stm.executeUpdate(sql);
            estado = true;
            stm.close();
            conecta.discconect();
        }
        catch(SQLException e){
            estado = false;
            e.printStackTrace();
        }
        return estado;
    }
    //METODO PARA MODIFICAR
    public boolean EditarTODO(Docente objupdate) {
        boolean estado = false;
        Statement stm;
        if (!existeRegistro(objupdate.getCedula())) {
        return false; // Si no existe el registro, retornar false
    }
       String sql = "UPDATE docente SET docNacionalidad = '" + objupdate.getNacionalidad() + "', "
                + "docApellidos = '" + objupdate.getApellidos() + "', docNombres = '" + objupdate.getNombres() + "', "
                + "docFechaNacimiento = '" + objupdate.getFechaNac() + "', docTipoSangre = '" + objupdate.getTipoSangre() + "', "
                + "docGenero = '" + objupdate.getGenero() + "', docCorreo = '" + objupdate.getCorreo() + "', "
                + "docEstadoCivil = '" + objupdate.getEstadocivil() + "', docTelefonoDomicilio = '" + objupdate.getTelefonodomicilio() + "', "
                + "docTelefonoCelular = '" + objupdate.getTelefonocelular() + "', docFechaDeclaracionBienes = '" + objupdate.getFechadeclaraciones() + "', "
                + "docFechaAntecedentesServPubl = '" + objupdate.getFechaantecedentes() + "', docProvincia = '" + objupdate.getProvincia() + "', "
                + "docCanton = '" + objupdate.getCanton() + "', docParroquia = '" + objupdate.getParroquia() + "', "
                + "docCallePrincipal = '" + objupdate.getCalleprincipal() + "', docCalleSecundaria = '" + objupdate.getCallesecundaria() + "', "
                + "docCallePrincipalNumero = '" + objupdate.getNumcalleprincipal() + "', docCalleSecundariaNumero = '" + objupdate.getNumcallesecundaria() + "', "
                + "docEtnia = '" + objupdate.getEtnia() + "', docEstado = '" + objupdate.getEstado() + "', "
                + "docUser = '" + objupdate.getUser() + "' "
                + "WHERE cedulaDocente = " + objupdate.getCedula();
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
public boolean existeRegistro(int cedula) {
    Statement stm;
    ResultSet result = null;
    String sql = "SELECT COUNT(*) AS count FROM docente WHERE cedulaDocente = " + cedula;

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
public Docente obtenerDocentePorCedula(int cedula) {
    // Zona de objetos
    Docente objDAOdocente = null;
    Statement stm; // para interpretar SQL desde Java
    ResultSet resDocente = null; // para recibir el resultado de la consulta a la base de datos MySQL
    String sql = "SELECT * FROM docente WHERE cedulaDocente = " + cedula;

    try {
        conecta.connection(); // abro la conexión a la base de datos
        stm = conecta.getJdbcConnection().createStatement(); // preparo la transacción de consulta
        resDocente = stm.executeQuery(sql);

        if (resDocente.next()) { // si el objeto tiene registros
            objDAOdocente = new Docente(
                resDocente.getInt("cedulaDocente"),
                resDocente.getString("docNacionalidad"),
                resDocente.getString("docApellidos"),
                resDocente.getString("docNombres"),
                resDocente.getString("docFechaNacimiento"),
                resDocente.getString("docTipoSangre"),
                resDocente.getString("docGenero"),
                resDocente.getString("docCorreo"),
                resDocente.getString("docEstadoCivil"),
                resDocente.getString("docTelefonoDomicilio"),
                resDocente.getString("docTelefonoCelular"),
                resDocente.getString("docFechaDeclaracionBienes"),
                resDocente.getString("docFechaAntecedentesServPubl"),
                resDocente.getString("docProvincia"),
                resDocente.getString("docCanton"),
                resDocente.getString("docParroquia"),
                resDocente.getString("docCallePrincipal"),
                resDocente.getString("docCalleSecundaria"),
                resDocente.getString("docCallePrincipalNumero"),
                resDocente.getString("docCalleSecundariaNumero"),
                resDocente.getString("docEtnia"),
                resDocente.getString("docEstado"),
                resDocente.getString("docUser")
            );
        }

        stm.close();
        conecta.discconect();
    } catch (SQLException e) {
        e.printStackTrace(); // capturo toda la traza del error en el servidor
    }

    return objDAOdocente;
}


  // Método para verificar la existencia de un registro por su ID

    public boolean existeRegistro(String cedula) {
        Statement stm;
        ResultSet result = null;
        String sql = "SELECT COUNT(*) AS count FROM docente WHERE cedulaDocente = " + cedula;

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
