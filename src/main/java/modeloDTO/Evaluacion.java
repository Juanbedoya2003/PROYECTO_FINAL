/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDTO;

import java.sql.Date;

/**
 *
 * @author Juan Bedoya
 */
public class Evaluacion {
    private int id;
    private String periodoinicio;
    private String periodohasta;
    private String nombreinstitucion;
    private String puntaje;
    private String calificacion;
    private String observacion;
    private int fkdocente;
    
    
    public Evaluacion(){
    }

    public Evaluacion(int id, String periodoinicio, String periodohasta, String nombreinstitucion, String puntaje, String calificacion, String observacion, int fkdocente) {
        this.id = id;
        this.periodoinicio = periodoinicio;
        this.periodohasta = periodohasta;
        this.nombreinstitucion = nombreinstitucion;
        this.puntaje = puntaje;
        this.calificacion = calificacion;
        this.observacion = observacion;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriodoinicio() {
        return periodoinicio;
    }

    public void setPeriodoinicio(String periodoinicio) {
        this.periodoinicio = periodoinicio;
    }

    public String getPeriodohasta() {
        return periodohasta;
    }

    public void setPeriodohasta(String periodohasta) {
        this.periodohasta = periodohasta;
    }

    public String getNombreinstitucion() {
        return nombreinstitucion;
    }

    public void setNombreinstitucion(String nombreinstitucion) {
        this.nombreinstitucion = nombreinstitucion;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "id=" + id + ", periodoinicio=" + periodoinicio + ", periodohasta=" + periodohasta + ", nombreinstitucion=" + nombreinstitucion + ", puntaje=" + puntaje + ", calificacion=" + calificacion + ", observacion=" + observacion + ", fkdocente=" + fkdocente + '}';
    }
    
}
