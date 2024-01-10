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
public class FormacionAcademica {
    private int idformacion;
    private String forinstitucioneducativa;
    private String fornivelinstruccion;
    private String fornumerocertificado;
    private String foraniosaprobados;
    private String forareaconocimiento;
    private String foregresadograduado;
    private String fortitulobtenido;
    private String forpaistitulo;

    public FormacionAcademica(int idformacion, String forinstitucioneducativa, String fornivelinstruccion, String fornumerocertificado, String foraniosaprobados, String forareaconocimiento, String foregresadograduado, String fortitulobtenido, String forpaistitulo) {
        this.idformacion = idformacion;
        this.forinstitucioneducativa = forinstitucioneducativa;
        this.fornivelinstruccion = fornivelinstruccion;
        this.fornumerocertificado = fornumerocertificado;
        this.foraniosaprobados = foraniosaprobados;
        this.forareaconocimiento = forareaconocimiento;
        this.foregresadograduado = foregresadograduado;
        this.fortitulobtenido = fortitulobtenido;
        this.forpaistitulo = forpaistitulo;
    }

    public String getForpaistitulo() {
        return forpaistitulo;
    }

    public void setForpaistitulo(String forpaistitulo) {
        this.forpaistitulo = forpaistitulo;
    }

    public int getIdformacion() {
        return idformacion;
    }

    public void setIdformacion(int idformacion) {
        this.idformacion = idformacion;
    }

    public String getForinstitucioneducativa() {
        return forinstitucioneducativa;
    }

    public void setForinstitucioneducativa(String forinstitucioneducativa) {
        this.forinstitucioneducativa = forinstitucioneducativa;
    }

    public String getFornivelinstruccion() {
        return fornivelinstruccion;
    }

    public void setFornivelinstruccion(String fornivelinstruccion) {
        this.fornivelinstruccion = fornivelinstruccion;
    }

    public String getFornumerocertificado() {
        return fornumerocertificado;
    }

    public void setFornumerocertificado(String fornumerocertificado) {
        this.fornumerocertificado = fornumerocertificado;
    }

    public String getForaniosaprobados() {
        return foraniosaprobados;
    }

    public void setForaniosaprobados(String foraniosaprobados) {
        this.foraniosaprobados = foraniosaprobados;
    }

    public String getForareaconocimiento() {
        return forareaconocimiento;
    }

    public void setForareaconocimiento(String forareaconocimiento) {
        this.forareaconocimiento = forareaconocimiento;
    }

    public String getForegresadograduado() {
        return foregresadograduado;
    }

    public void setForegresadograduado(String foregresadograduado) {
        this.foregresadograduado = foregresadograduado;
    }

    public String getFortitulobtenido() {
        return fortitulobtenido;
    }

    public void setFortitulobtenido(String fortitulobtenido) {
        this.fortitulobtenido = fortitulobtenido;
    }
    
}
