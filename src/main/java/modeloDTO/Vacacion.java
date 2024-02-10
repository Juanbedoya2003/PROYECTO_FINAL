/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDTO;

import java.sql.Timestamp;

/**
 *
 * @author Juan Bedoya
 */
public class Vacacion {

    private int id;
    private String fechaHoraInicia;
    private String fechaHoraFinaliza;
    private String observacion;
    private String estado;
    private int fkdocente;
    
    public Vacacion(){
    }

    public Vacacion(int id, String fechaHoraInicia, String fechaHoraFinaliza, String observacion, String estado, int fkdocente) {
        this.id = id;
        this.fechaHoraInicia = fechaHoraInicia;
        this.fechaHoraFinaliza = fechaHoraFinaliza;
        this.observacion = observacion;
        this.estado = estado;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaHoraInicia() {
        return fechaHoraInicia;
    }

    public void setFechaHoraInicia(String fechaHoraInicia) {
        this.fechaHoraInicia = fechaHoraInicia;
    }

    public String getFechaHoraFinaliza() {
        return fechaHoraFinaliza;
    }

    public void setFechaHoraFinaliza(String fechaHoraFinaliza) {
        this.fechaHoraFinaliza = fechaHoraFinaliza;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Vacacion{" + "id=" + id + ", fechaHoraInicia=" + fechaHoraInicia + ", fechaHoraFinaliza=" + fechaHoraFinaliza + ", observacion=" + observacion + ", estado=" + estado + ", fkdocente=" + fkdocente + '}';
    }
    
}
