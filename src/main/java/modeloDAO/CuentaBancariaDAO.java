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
import modeloDTO.CuentaBancaria;

public class CuentaBancariaDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public CuentaBancariaDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrar(CuentaBancaria cu) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into cuentaBancaria values(null,'" + cu.getInstitucionfinanciera() + "','" + cu.getTipocuenta() + "','" + cu.getNumerocuenta() + "','" + cu.getFkdocente() + "')";
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
        CuentaBancaria objDAOcuentabancaria;

        ArrayList<CuentaBancaria> arrCuentaBancaria = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resCuentaBancaria = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from cuentaBancaria";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resCuentaBancaria = stm.executeQuery(sql);
            while (resCuentaBancaria.next()) {//mientras el objeto tengo registros
                objDAOcuentabancaria = new CuentaBancaria(resCuentaBancaria.getInt("idCuentaBancaria"), resCuentaBancaria.getString("cuenInstitucionFinanciera"), resCuentaBancaria.getString("cuenTipoCuenta"), resCuentaBancaria.getString("cuenNumeroCuenta"), resCuentaBancaria.getInt("docente_cedulaDocente"));
                arrCuentaBancaria.add(objDAOcuentabancaria);//cargo cada registo en el array 

            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrCuentaBancaria;
    }
    //METODO PARA SELECCIONAR TODO EN UNA TABLA

    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        CuentaBancaria objcue;

        ArrayList<CuentaBancaria> arrCuentaBancaria = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resCuentaBancaria = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from cuentaBancaria where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resCuentaBancaria = stm.executeQuery(sql);
            while (resCuentaBancaria.next()) {//mientras el objeto tengo registros
                objcue = new CuentaBancaria(resCuentaBancaria.getInt("idCuentaBancaria"), resCuentaBancaria.getString("cuenInstitucionFinanciera"), resCuentaBancaria.getString("cuenTipoCuenta"), resCuentaBancaria.getString("cuenNumeroCuenta"), resCuentaBancaria.getInt("docente_cedulaDocente"));
                arrCuentaBancaria.add(objcue);//cargo cada registo en el array 

            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrCuentaBancaria;
    }
    //metodo para borrar

    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from cuentaBancaria where idCuentaBancaria= " + idDelete;
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
    public boolean EditarTODO(CuentaBancaria objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
        if (!existeRegistro(objupdate.getId())) {
            return false; // Si no existe el registro, retornar false
        }
        String sql = "UPDATE cuentaBancaria SET cuenInstitucionFinanciera = '" + objupdate.getInstitucionfinanciera() + "', "
                + "cuenTipoCuenta = '" + objupdate.getTipocuenta() + "', cuenNumeroCuenta = '" + objupdate.getNumerocuenta() + "' "
                + "WHERE idCuentaBancaria = " + objupdate.getId();
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
        String sql = "SELECT COUNT(*) AS count FROM cuentaBancaria WHERE idCuentaBancaria = " + id;

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
