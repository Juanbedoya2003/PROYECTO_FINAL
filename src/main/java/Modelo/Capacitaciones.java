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
public class Capacitaciones {

    private int idcapacitacion;
    private String capnombre;
    private String captipo;
    private String capauspiciante;
    private int capduracion;
    private boolean capaprobadodesaprobado;
    private String cappais;
    private String capinstitucionaprueba;
    private LocalDateTime capfechahorainicio;
    private LocalDateTime capfechahorafin;

    public Capacitaciones(int idcapacitacion, String capnombre, String captipo, String capauspiciante, int capduracion, boolean capaprobadodesaprobado, String cappais, String capinstitucionaprueba, LocalDateTime capfechahorainicio, LocalDateTime capfechahorafin) {
        this.idcapacitacion = idcapacitacion;
        this.capnombre = capnombre;
        this.captipo = captipo;
        this.capauspiciante = capauspiciante;
        this.capduracion = capduracion;
        this.capaprobadodesaprobado = capaprobadodesaprobado;
        this.cappais = cappais;
        this.capinstitucionaprueba = capinstitucionaprueba;
        this.capfechahorainicio = capfechahorainicio;
        this.capfechahorafin = capfechahorafin;
    }

    public LocalDateTime getCapfechahorafin() {
        return capfechahorafin;
    }

    public void setCapfechahorafin(LocalDateTime capfechahorafin) {
        this.capfechahorafin = capfechahorafin;
    }

    public int getIdcapacitacion() {
        return idcapacitacion;
    }

    public void setIdcapacitacion(int idcapacitacion) {
        this.idcapacitacion = idcapacitacion;
    }

    public String getCapnombre() {
        return capnombre;
    }

    public void setCapnombre(String capnombre) {
        this.capnombre = capnombre;
    }

    public String getCaptipo() {
        return captipo;
    }

    public void setCaptipo(String captipo) {
        this.captipo = captipo;
    }

    public String getCapauspiciante() {
        return capauspiciante;
    }

    public void setCapauspiciante(String capauspiciante) {
        this.capauspiciante = capauspiciante;
    }

    public int getCapduracion() {
        return capduracion;
    }

    public void setCapduracion(int capduracion) {
        this.capduracion = capduracion;
    }

    public boolean isCapaprobadodesaprobado() {
        return capaprobadodesaprobado;
    }

    public void setCapaprobadodesaprobado(boolean capaprobadodesaprobado) {
        this.capaprobadodesaprobado = capaprobadodesaprobado;
    }

    public String getCappais() {
        return cappais;
    }

    public void setCappais(String cappais) {
        this.cappais = cappais;
    }

    public String getCapinstitucionaprueba() {
        return capinstitucionaprueba;
    }

    public void setCapinstitucionaprueba(String capinstitucionaprueba) {
        this.capinstitucionaprueba = capinstitucionaprueba;
    }

    public LocalDateTime getCapfechahorainicio() {
        return capfechahorainicio;
    }

    public void setCapfechahorainicio(LocalDateTime capfechahorainicio) {
        this.capfechahorainicio = capfechahorainicio;
    }
    

}
