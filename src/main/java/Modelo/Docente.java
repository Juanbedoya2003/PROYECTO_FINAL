/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Juan Bedoya
 */
public class Docente {

    int id;
    String cedula;
    String nacionalidad;
    String apellidos;
    String nombres;
    Date fechaNac;
    String tipoSangre;
    String genero;
    String correo;
    String estadocivil;
    String telefonodomicilio;
    String telefonocelular;
    Date fechadeclaraciones;
    Date fechaantecedentes;
    String provincia;
    String canton;
    String parroquia;
    String numcalleprincipal;
    String calleprincipal;
    String numcallesecundaria;
    String callesecundaria;
    String etnia;
    String estado;
    String user;

    public Docente() {
    }

    public Docente(int id, String cedula, String nacionalidad, String apellidos, String nombres, Date fechaNac, String tipoSangre, String genero, String correo, String estadocivil, String telefonodomicilio, String telefonocelular, Date fechadeclaraciones, Date fechaantecedentes, String provincia, String canton, String parroquia, String numcalleprincipal, String calleprincipal, String numcallesecundaria, String callesecundaria, String etnia, String estado, String user) {
        this.id = id;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.fechaNac = fechaNac;
        this.tipoSangre = tipoSangre;
        this.genero = genero;
        this.correo = correo;
        this.estadocivil = estadocivil;
        this.telefonodomicilio = telefonodomicilio;
        this.telefonocelular = telefonocelular;
        this.fechadeclaraciones = fechadeclaraciones;
        this.fechaantecedentes = fechaantecedentes;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.numcalleprincipal = numcalleprincipal;
        this.calleprincipal = calleprincipal;
        this.numcallesecundaria = numcallesecundaria;
        this.callesecundaria = callesecundaria;
        this.etnia = etnia;
        this.estado = estado;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getTelefonodomicilio() {
        return telefonodomicilio;
    }

    public void setTelefonodomicilio(String telefonodomicilio) {
        this.telefonodomicilio = telefonodomicilio;
    }

    public String getTelefonocelular() {
        return telefonocelular;
    }

    public void setTelefonocelular(String telefonocelular) {
        this.telefonocelular = telefonocelular;
    }

    public Date getFechadeclaraciones() {
        return fechadeclaraciones;
    }

    public void setFechadeclaraciones(Date fechadeclaraciones) {
        this.fechadeclaraciones = fechadeclaraciones;
    }

    public Date getFechaantecedentes() {
        return fechaantecedentes;
    }

    public void setFechaantecedentes(Date fechaantecedentes) {
        this.fechaantecedentes = fechaantecedentes;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getNumcalleprincipal() {
        return numcalleprincipal;
    }

    public void setNumcalleprincipal(String numcalleprincipal) {
        this.numcalleprincipal = numcalleprincipal;
    }

    public String getCalleprincipal() {
        return calleprincipal;
    }

    public void setCalleprincipal(String calleprincipal) {
        this.calleprincipal = calleprincipal;
    }

    public String getNumcallesecundaria() {
        return numcallesecundaria;
    }

    public void setNumcallesecundaria(String numcallesecundaria) {
        this.numcallesecundaria = numcallesecundaria;
    }

    public String getCallesecundaria() {
        return callesecundaria;
    }

    public void setCallesecundaria(String callesecundaria) {
        this.callesecundaria = callesecundaria;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
