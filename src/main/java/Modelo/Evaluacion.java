/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author Juan Bedoya
 */
public class Evaluacion {
    private int idevaluacion;
    private LocalDate evaperiodoinicio;
    private LocalDate evaperiodohasta;
    private String evanombreinstitucion;
    private String evapuntaje;
    private String evacalificacion;
    private String evaobservacion;

    public Evaluacion(int idevaluacion, LocalDate evaperiodoinicio, LocalDate evaperiodohasta, String evanombreinstitucion, String evapuntaje, String evacalificacion, String evaobservacion) {
        this.idevaluacion = idevaluacion;
        this.evaperiodoinicio = evaperiodoinicio;
        this.evaperiodohasta = evaperiodohasta;
        this.evanombreinstitucion = evanombreinstitucion;
        this.evapuntaje = evapuntaje;
        this.evacalificacion = evacalificacion;
        this.evaobservacion = evaobservacion;
    }

    public String getEvaobservacion() {
        return evaobservacion;
    }

    public void setEvaobservacion(String evaobservacion) {
        this.evaobservacion = evaobservacion;
    }

    public int getIdevaluacion() {
        return idevaluacion;
    }

    public void setIdevaluacion(int idevaluacion) {
        this.idevaluacion = idevaluacion;
    }

    public LocalDate getEvaperiodoinicio() {
        return evaperiodoinicio;
    }

    public void setEvaperiodoinicio(LocalDate evaperiodoinicio) {
        this.evaperiodoinicio = evaperiodoinicio;
    }

    public LocalDate getEvaperiodohasta() {
        return evaperiodohasta;
    }

    public void setEvaperiodohasta(LocalDate evaperiodohasta) {
        this.evaperiodohasta = evaperiodohasta;
    }

    public String getEvanombreinstitucion() {
        return evanombreinstitucion;
    }

    public void setEvanombreinstitucion(String evanombreinstitucion) {
        this.evanombreinstitucion = evanombreinstitucion;
    }

    public String getEvapuntaje() {
        return evapuntaje;
    }

    public void setEvapuntaje(String evapuntaje) {
        this.evapuntaje = evapuntaje;
    }

    public String getEvacalificacion() {
        return evacalificacion;
    }

    public void setEvacalificacion(String evacalificacion) {
        this.evacalificacion = evacalificacion;
    }
    
}
