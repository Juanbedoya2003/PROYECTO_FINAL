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
public class ExperienciaLaboral {
    private int id;
    private String instPublicaPrivada;
    private String nombreinstitucion;
    private String departamentoArea;
    private String puesto;
    private String fechaingreso;
    private String fechasalida;
    private String modalidad;
    private String  motivosalida;
    private int fkdocente;
    
    
    public ExperienciaLaboral(){
    }

    public ExperienciaLaboral(int id, String instPublicaPrivada, String nombreinstitucion, String departamentoArea, String puesto, String fechaingreso, String fechasalida, String modalidad, String motivosalida, int fkdocente) {
        this.id = id;
        this.instPublicaPrivada = instPublicaPrivada;
        this.nombreinstitucion = nombreinstitucion;
        this.departamentoArea = departamentoArea;
        this.puesto = puesto;
        this.fechaingreso = fechaingreso;
        this.fechasalida = fechasalida;
        this.modalidad = modalidad;
        this.motivosalida = motivosalida;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstPublicaPrivada() {
        return instPublicaPrivada;
    }

    public void setInstPublicaPrivada(String instPublicaPrivada) {
        this.instPublicaPrivada = instPublicaPrivada;
    }

    public String getNombreinstitucion() {
        return nombreinstitucion;
    }

    public void setNombreinstitucion(String nombreinstitucion) {
        this.nombreinstitucion = nombreinstitucion;
    }

    public String getDepartamentoArea() {
        return departamentoArea;
    }

    public void setDepartamentoArea(String departamentoArea) {
        this.departamentoArea = departamentoArea;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getMotivosalida() {
        return motivosalida;
    }

    public void setMotivosalida(String motivosalida) {
        this.motivosalida = motivosalida;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "ExperienciaLaboral{" + "id=" + id + ", instPublicaPrivada=" + instPublicaPrivada + ", nombreinstitucion=" + nombreinstitucion + ", departamentoArea=" + departamentoArea + ", puesto=" + puesto + ", fechaingreso=" + fechaingreso + ", fechasalida=" + fechasalida + ", modalidad=" + modalidad + ", motivosalida=" + motivosalida + ", fkdocente=" + fkdocente + '}';
    }
    
}
