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
public class ExperienciaLaboral {
    private int idexperiencialaboral;
    private String expinstitucion;
    private String expnombreinst;
    private String expdepartamento;
    private String  expuesto;
    private LocalDate expfechaingreso;
    private LocalDate expfechasalida;
    private String expmodalidad;
    private String  expmotivosalida;

    public ExperienciaLaboral(int idexperiencialaboral, String expinstitucion, String expnombreinst, String expdepartamento, String expuesto, LocalDate expfechaingreso, LocalDate expfechasalida, String expmodalidad, String expmotivosalida) {
        this.idexperiencialaboral = idexperiencialaboral;
        this.expinstitucion = expinstitucion;
        this.expnombreinst = expnombreinst;
        this.expdepartamento = expdepartamento;
        this.expuesto = expuesto;
        this.expfechaingreso = expfechaingreso;
        this.expfechasalida = expfechasalida;
        this.expmodalidad = expmodalidad;
        this.expmotivosalida = expmotivosalida;
    }

    public String getExpmotivosalida() {
        return expmotivosalida;
    }

    public void setExpmotivosalida(String expmotivosalida) {
        this.expmotivosalida = expmotivosalida;
    }

    public int getIdexperiencialaboral() {
        return idexperiencialaboral;
    }

    public void setIdexperiencialaboral(int idexperiencialaboral) {
        this.idexperiencialaboral = idexperiencialaboral;
    }

    public String getExpinstitucion() {
        return expinstitucion;
    }

    public void setExpinstitucion(String expinstitucion) {
        this.expinstitucion = expinstitucion;
    }

    public String getExpnombreinst() {
        return expnombreinst;
    }

    public void setExpnombreinst(String expnombreinst) {
        this.expnombreinst = expnombreinst;
    }

    public String getExpdepartamento() {
        return expdepartamento;
    }

    public void setExpdepartamento(String expdepartamento) {
        this.expdepartamento = expdepartamento;
    }

    public String getExpuesto() {
        return expuesto;
    }

    public void setExpuesto(String expuesto) {
        this.expuesto = expuesto;
    }

    public LocalDate getExpfechaingreso() {
        return expfechaingreso;
    }

    public void setExpfechaingreso(LocalDate expfechaingreso) {
        this.expfechaingreso = expfechaingreso;
    }

    public LocalDate getExpfechasalida() {
        return expfechasalida;
    }

    public void setExpfechasalida(LocalDate expfechasalida) {
        this.expfechasalida = expfechasalida;
    }

    public String getExpmodalidad() {
        return expmodalidad;
    }

    public void setExpmodalidad(String expmodalidad) {
        this.expmodalidad = expmodalidad;
    }
    
    
}
