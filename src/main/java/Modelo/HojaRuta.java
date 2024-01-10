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
public class HojaRuta {
    private int idhojaruta;
    private LocalDateTime hojfechahorainicio;
    private LocalDateTime hojfechahorafin;
    private String hojobservacion;
    private String hojestado;

    public HojaRuta(int idhojaruta, LocalDateTime hojfechahorainicio, LocalDateTime hojfechahorafin, String hojobservacion, String hojestado) {
        this.idhojaruta = idhojaruta;
        this.hojfechahorainicio = hojfechahorainicio;
        this.hojfechahorafin = hojfechahorafin;
        this.hojobservacion = hojobservacion;
        this.hojestado = hojestado;
    }

    public String getHojestado() {
        return hojestado;
    }

    public void setHojestado(String hojestado) {
        this.hojestado = hojestado;
    }

    public int getIdhojaruta() {
        return idhojaruta;
    }

    public void setIdhojaruta(int idhojaruta) {
        this.idhojaruta = idhojaruta;
    }

    public LocalDateTime getHojfechahorainicio() {
        return hojfechahorainicio;
    }

    public void setHojfechahorainicio(LocalDateTime hojfechahorainicio) {
        this.hojfechahorainicio = hojfechahorainicio;
    }

    public LocalDateTime getHojfechahorafin() {
        return hojfechahorafin;
    }

    public void setHojfechahorafin(LocalDateTime hojfechahorafin) {
        this.hojfechahorafin = hojfechahorafin;
    }

    public String getHojobservacion() {
        return hojobservacion;
    }

    public void setHojobservacion(String hojobservacion) {
        this.hojobservacion = hojobservacion;
    }
    
}
