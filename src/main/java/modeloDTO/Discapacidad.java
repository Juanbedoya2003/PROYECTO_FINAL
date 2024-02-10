/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDTO;

/**
 *
 * @author Juan Bedoya
 */
public class Discapacidad {

    private int id;
    private String situacion;
    private String tiporelacion;
    private String numcarnetconadis;
    private String certificado;
    private String tipo;
    private String porcentaje;
    private String tipoenfermedad;
    private int fkdocente;
    
    public Discapacidad(){
    }

    public Discapacidad(int id, String situacion, String tiporelacion, String numcarnetconadis, String certificado, String tipo, String porcentaje, String tipoenfermedad, int fkdocente) {
        this.id = id;
        this.situacion = situacion;
        this.tiporelacion = tiporelacion;
        this.numcarnetconadis = numcarnetconadis;
        this.certificado = certificado;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
        this.tipoenfermedad = tipoenfermedad;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getTiporelacion() {
        return tiporelacion;
    }

    public void setTiporelacion(String tiporelacion) {
        this.tiporelacion = tiporelacion;
    }

    public String getNumcarnetconadis() {
        return numcarnetconadis;
    }

    public void setNumcarnetconadis(String numcarnetconadis) {
        this.numcarnetconadis = numcarnetconadis;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTipoenfermedad() {
        return tipoenfermedad;
    }

    public void setTipoenfermedad(String tipoenfermedad) {
        this.tipoenfermedad = tipoenfermedad;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Discapacidad{" + "id=" + id + ", situacion=" + situacion + ", tiporelacion=" + tiporelacion + ", numcarnetconadis=" + numcarnetconadis + ", certificado=" + certificado + ", tipo=" + tipo + ", porcentaje=" + porcentaje + ", tipoenfermedad=" + tipoenfermedad + ", fkdocente=" + fkdocente + '}';
    }

   
}
