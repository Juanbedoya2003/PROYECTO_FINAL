package modeloDAO;

import Modelo.ConexionBd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloDTO.Capacitaciones;

public class CapacitacionesDAO {

//zona de atributos
    private ConexionBd conecta;
//constructor

    public CapacitacionesDAO(String jdbcURL, String jdbcUSERName, String jdbcPassword) throws SQLException {
        conecta = new ConexionBd(jdbcURL, jdbcUSERName, jdbcPassword);//instanciamos la clase conexion bd
    }

    public boolean registrarCapacitacion(Capacitaciones ca) {
        // Zona de variables
        boolean estado = false; //variable para detectar el estado de la inserción den la base de datos  
        Statement stm; // Objeto interpreta las setencias sql desde java para bd
        String sql = "Insert into capacitaciones values(null,'" + ca.getNombre() + "','" + ca.getTipo() + "','" + ca.getAuspiciante() + "','" + ca.getDuracion() + "','" + ca.getAprobadoDesaprobado() + "','" + ca.getPais() + "','" + ca.getInstitucionaprueba() + "','" + ca.getFechahorainicio() + "','" + ca.getFechahorafin() + "','" + ca.getFkdocente() + "')";
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
        Capacitaciones objDAOcapacitaciones;

        ArrayList<Capacitaciones> arrCapacitaciones = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resCapacitaciones = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from capacitaciones";
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resCapacitaciones = stm.executeQuery(sql);
            while (resCapacitaciones.next()) {//mientras el objeto tengo registros
                objDAOcapacitaciones = new Capacitaciones(resCapacitaciones.getInt("idCapacitaciones"), resCapacitaciones.getString("capNombre"), resCapacitaciones.getString("capTipo"), resCapacitaciones.getString("capAuspiciante"), resCapacitaciones.getInt("capDuracionHoras"), resCapacitaciones.getString("capAprobadoDesaprobado"), resCapacitaciones.getString("capPais"), resCapacitaciones.getString("capInstQueAprueba"), resCapacitaciones.getString("capFechaHoraInicio"), resCapacitaciones.getString("capFechaHoraInicio"), resCapacitaciones.getInt("docente_cedulaDocente"));
                arrCapacitaciones.add(objDAOcapacitaciones);//cargo cada registo en el array 

            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrCapacitaciones;
    }
    //METODO PARA SELECCIONAR SOLO UNO EN UNA TABLA

    public ArrayList SeleccionarUno(String cedula) {
        //zona de objetos
        Capacitaciones objcap;

        ArrayList<Capacitaciones> arrCapacitaciones = new ArrayList();//objeto para definir la estructura del arraylist y recibir la consulta desde la bd
        Statement stm; //para interpretar sql desde java
        ResultSet resCapacitaciones = null; // para recibir el resultado de la consulta ralizada para la base de datos mysql
        String sql = "select * from capacitaciones where docente_cedulaDocente = " + cedula;
        try {
            conecta.connection();//abro laconexion ala bd
            stm = conecta.getJdbcConnection().createStatement(); // para preparar la transaccion de consulta
            resCapacitaciones = stm.executeQuery(sql);
            while (resCapacitaciones.next()) {//mientras el objeto tengo registros
                objcap = new Capacitaciones(resCapacitaciones.getInt("idCapacitaciones"), resCapacitaciones.getString("capNombre"),
                        resCapacitaciones.getString("capTipo"), resCapacitaciones.getString("capAuspiciante"), resCapacitaciones.getInt("capDuracionHoras"),
                        resCapacitaciones.getString("capAprobadoDesaprobado"), resCapacitaciones.getString("capPais"), resCapacitaciones.getString("capInstQueAprueba"),
                        resCapacitaciones.getString("capFechaHoraInicio"), resCapacitaciones.getString("capFechaHoraInicio"),
                        resCapacitaciones.getInt("docente_cedulaDocente"));
                arrCapacitaciones.add(objcap);//cargo cada registo en el array 

            }
            stm.close();
            conecta.discconect();
        } catch (SQLException e) {
            e.printStackTrace(); //capturo toda la traza del error en el servidor
        }
        return arrCapacitaciones;
    }
    //metodo para borrar

    public boolean Eliminar(String idDelete) {
        //zona de variables
        boolean estado = false;
        Statement stm;//ejectura el  codigo sql
        String sql = "delete from capacitaciones where idCapacitaciones = " + idDelete;
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
    public boolean EditarTODO(Capacitaciones objupdate) {
        boolean estado = false;
        Statement stm;
        // Verificar si el registro existe antes de intentar actualizar
    if (!existeRegistro(objupdate.getId())) {
        return false; // Si no existe el registro, retornar false
    }
        String sql = "UPDATE capacitaciones SET capNombre = '" + objupdate.getNombre() + "', "
                + "capTipo = '" + objupdate.getTipo() + "', capAuspiciante = '" + objupdate.getAuspiciante() + "', "
                + "capDuracionHoras = '" + objupdate.getDuracion() + "', capAprobadoDesaprobado = '" + objupdate.getAprobadoDesaprobado() + "', "
                + "capPais = '" + objupdate.getPais() + "', capInstQueAprueba = '" + objupdate.getInstitucionaprueba() + "', "
                + "capFechaHoraInicio = '" + objupdate.getFechahorainicio() + "', capFechaHoraFin = '" + objupdate.getFechahorafin() + "' "
                + "WHERE idCapacitaciones = " + objupdate.getId();
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
    String sql = "SELECT COUNT(*) AS count FROM capacitaciones WHERE idCapacitaciones = " + id;

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
