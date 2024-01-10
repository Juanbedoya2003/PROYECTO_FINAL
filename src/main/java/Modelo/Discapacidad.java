/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Juan Bedoya
 */
public class Discapacidad {
    private int idiscapacidad;
    private String discsituacion;
    private String disctiporelacion;
    private String discnumeroconadis;
    private String discertificado;
    private String  disctipo;
    private String discporcentaje;
    private String disctipoenfermedad;

    public Discapacidad(int idiscapacidad, String discsituacion, String disctiporelacion, String discnumeroconadis, String discertificado, String disctipo, String discporcentaje, String disctipoenfermedad) {
        this.idiscapacidad = idiscapacidad;
        this.discsituacion = discsituacion;
        this.disctiporelacion = disctiporelacion;
        this.discnumeroconadis = discnumeroconadis;
        this.discertificado = discertificado;
        this.disctipo = disctipo;
        this.discporcentaje = discporcentaje;
        this.disctipoenfermedad = disctipoenfermedad;
    }

    public String getDisctipoenfermedad() {
        return disctipoenfermedad;
    }

    public void setDisctipoenfermedad(String disctipoenfermedad) {
        this.disctipoenfermedad = disctipoenfermedad;
    }

    public int getIdiscapacidad() {
        return idiscapacidad;
    }

    public void setIdiscapacidad(int idiscapacidad) {
        this.idiscapacidad = idiscapacidad;
    }

    public String getDiscsituacion() {
        return discsituacion;
    }

    public void setDiscsituacion(String discsituacion) {
        this.discsituacion = discsituacion;
    }

    public String getDisctiporelacion() {
        return disctiporelacion;
    }

    public void setDisctiporelacion(String disctiporelacion) {
        this.disctiporelacion = disctiporelacion;
    }

    public String getDiscnumeroconadis() {
        return discnumeroconadis;
    }

    public void setDiscnumeroconadis(String discnumeroconadis) {
        this.discnumeroconadis = discnumeroconadis;
    }

    public String getDiscertificado() {
        return discertificado;
    }

    public void setDiscertificado(String discertificado) {
        this.discertificado = discertificado;
    }

    public String getDisctipo() {
        return disctipo;
    }

    public void setDisctipo(String disctipo) {
        this.disctipo = disctipo;
    }

    public String getDiscporcentaje() {
        return discporcentaje;
    }

    public void setDiscporcentaje(String discporcentaje) {
        this.discporcentaje = discporcentaje;
    }
    
}
