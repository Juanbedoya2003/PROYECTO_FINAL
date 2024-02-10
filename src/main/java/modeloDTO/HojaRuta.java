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
public class HojaRuta {

    private int id;
    private String fecha;
    private String horainicio;
    private String horafin;
    private Double horatotal;
    private String observacion;
    private String estado;
    private int fkdocente;

    public HojaRuta(int id, String fecha, String horainicio, String horafin, Double horatotal, String observacion, String estado, int fkdocente) {
        this.id = id;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.horatotal = horatotal;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public Double getHoratotal() {
        return horatotal;
    }

    public void setHoratotal(Double horatotal) {
        this.horatotal = horatotal;
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
        return "HojaRuta{" + "id=" + id + ", fecha=" + fecha + ", horainicio=" + horainicio + ", horafin=" + horafin + ", horatotal=" + horatotal + ", observacion=" + observacion + ", estado=" + estado + ", fkdocente=" + fkdocente + '}';
    }

   
}
