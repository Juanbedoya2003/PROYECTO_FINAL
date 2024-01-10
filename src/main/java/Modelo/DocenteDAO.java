/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DocenteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Docente validar(String user, String cedula) {
        Docente doc = new Docente();
        String sql = "select * from docente where docUser=? and docCedulaPasaporte=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, cedula);
            rs = ps.executeQuery();
            while (rs.next()) {
                doc.setId(rs.getInt("idDocente"));
                doc.setUser(rs.getString("docUser"));
                doc.setCedula(rs.getString("docCedulaPasaporte"));
                doc.setApellidos(rs.getString("docApellidos"));
                doc.setNombres(rs.getString("docNombres"));
                doc.setNacionalidad(rs.getString("docNacionalida"));
                doc.setFechaNac(rs.getDate("docFechaNacimiento"));
                doc.setTipoSangre(rs.getString("docTipoSangre"));
                doc.setGenero(rs.getString("docGenero"));
                doc.setCorreo(rs.getString("docCorreo"));
                doc.setEstadocivil(rs.getString("docEstadoCivil"));
                doc.setTelefonodomicilio(rs.getString("docTelefonoDomocilio"));
                doc.setTelefonocelular(rs.getString("docTelefonoCelular"));
                doc.setFechadeclaraciones(rs.getDate("docFechaDeclaracionBienes"));
                doc.setFechaantecedentes(rs.getDate("docFechaAntecedentesServPubl"));
                doc.setProvincia(rs.getString("docProvincia"));
                doc.setCanton(rs.getString("docCanton"));
                doc.setParroquia(rs.getString("docParroquia"));
                doc.setNumcalleprincipal(rs.getString("docCallePrincipalNumero"));
                doc.setCalleprincipal(rs.getString("docCallePrincipal"));
                doc.setNumcallesecundaria(rs.getString("docCalleSecundariaNumero"));
                doc.setCallesecundaria(rs.getString("docCalleSecundaria"));
                doc.setEtnia(rs.getString("docEtnia"));
                doc.setEstado(rs.getString("docEstado"));
            }

        } catch (Exception e) {

        }
        return doc;
    }

}