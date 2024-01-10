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
public class Conyuge {
    private int idconyuge;
    private String concedula;
    private String conapellidos;
    private String connombres;
    private String tiporelacion;

    public Conyuge(int idconyuge, String concedula, String conapellidos, String connombres, String tiporelacion) {
        this.idconyuge = idconyuge;
        this.concedula = concedula;
        this.conapellidos = conapellidos;
        this.connombres = connombres;
        this.tiporelacion = tiporelacion;
    }

    public String getTiporelacion() {
        return tiporelacion;
    }

    public void setTiporelacion(String tiporelacion) {
        this.tiporelacion = tiporelacion;
    }

    public int getIdconyuge() {
        return idconyuge;
    }

    public void setIdconyuge(int idconyuge) {
        this.idconyuge = idconyuge;
    }

    public String getConcedula() {
        return concedula;
    }

    public void setConcedula(String concedula) {
        this.concedula = concedula;
    }

    public String getConapellidos() {
        return conapellidos;
    }

    public void setConapellidos(String conapellidos) {
        this.conapellidos = conapellidos;
    }

    public String getConnombres() {
        return connombres;
    }

    public void setConnombres(String connombres) {
        this.connombres = connombres;
    }
    
}
