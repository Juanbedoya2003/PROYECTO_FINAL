/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author Juan Bedoya
 */
public class Vacaciones {
    private LocalDateTime fechaHoraInicia;
    private LocalDateTime fechaHoraFinaliza;
    private String observacion;
    private String estado;

    public Vacaciones(LocalDateTime fechaHoraInicia, LocalDateTime fechaHoraFinaliza, String observacion, String estado) {
        this.fechaHoraInicia = fechaHoraInicia;
        this.fechaHoraFinaliza = fechaHoraFinaliza;
        this.observacion = observacion;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaHoraInicia() {
        return fechaHoraInicia;
    }

    public void setFechaHoraInicia(LocalDateTime fechaHoraInicia) {
        this.fechaHoraInicia = fechaHoraInicia;
    }

    public LocalDateTime getFechaHoraFinaliza() {
        return fechaHoraFinaliza;
    }

    public void setFechaHoraFinaliza(LocalDateTime fechaHoraFinaliza) {
        this.fechaHoraFinaliza = fechaHoraFinaliza;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
}
