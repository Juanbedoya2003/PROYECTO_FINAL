
package modeloDTO;

import java.sql.Date;

public class Docente {

    private int cedula;
    private String nacionalidad;
    private String apellidos;
    private String nombres;
    private String fechaNac;
    private String tipoSangre;
    private String genero;
    private String correo;
    private String estadocivil;
    private String telefonodomicilio;
    private String telefonocelular;
    private String fechadeclaraciones;
    private String fechaantecedentes;
    private String provincia;
    private String canton;
    private String parroquia;
    private String numcalleprincipal;
    private String calleprincipal;
    private String numcallesecundaria;
    private String callesecundaria;
    private String etnia;
    private String estado;
    private String user;

    
    public Docente(){
    }
    
    public Docente(int cedula, String nacionalidad, String apellidos, String nombres, String fechaNac, String tipoSangre, String genero, String correo, String estadocivil, String telefonodomicilio, String telefonocelular, String fechadeclaraciones, String fechaantecedentes, String provincia, String canton, String parroquia, String numcalleprincipal, String calleprincipal, String numcallesecundaria, String callesecundaria, String etnia, String estado, String user) {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
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

    public String getFechadeclaraciones() {
        return fechadeclaraciones;
    }

    public void setFechadeclaraciones(String fechadeclaraciones) {
        this.fechadeclaraciones = fechadeclaraciones;
    }

    public String getFechaantecedentes() {
        return fechaantecedentes;
    }

    public void setFechaantecedentes(String fechaantecedentes) {
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

    @Override
    public String toString() {
        return "Docente{" + "cedula=" + cedula + ", nacionalidad=" + nacionalidad + ", apellidos=" + apellidos + ", nombres=" + nombres + ", fechaNac=" + fechaNac + ", tipoSangre=" + tipoSangre + ", genero=" + genero + ", correo=" + correo + ", estadocivil=" + estadocivil + ", telefonodomicilio=" + telefonodomicilio + ", telefonocelular=" + telefonocelular + ", fechadeclaraciones=" + fechadeclaraciones + ", fechaantecedentes=" + fechaantecedentes + ", provincia=" + provincia + ", canton=" + canton + ", parroquia=" + parroquia + ", numcalleprincipal=" + numcalleprincipal + ", calleprincipal=" + calleprincipal + ", numcallesecundaria=" + numcallesecundaria + ", callesecundaria=" + callesecundaria + ", etnia=" + etnia + ", estado=" + estado + ", user=" + user + '}';
    }

    
}
