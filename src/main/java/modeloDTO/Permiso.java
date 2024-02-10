/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDTO;


/**
 *
 * @author Juan Bedoya
 */
public class Permiso {
    private int id;
    private String motivo;
    private String fechaInicio;
    private String fechaFin;
    private int diasSolicitados;
    private int horasSolicitadas;
    private String horaInicio;
    private String horaFin;
    private Double cantidadDescontar;
    private String observacion;
    private String estado;
    private int fkdocente;

    public Permiso(int id, String motivo, String fechaInicio, String fechaFin, int diasSolicitados, int horasSolicitadas, String horaInicio, String horaFin, Double cantidadDescontar, String observacion, String estado, int fkdocente) {
        this.id = id;
        this.motivo = motivo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.diasSolicitados = diasSolicitados;
        this.horasSolicitadas = horasSolicitadas;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.cantidadDescontar = cantidadDescontar;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDiasSolicitados() {
        return diasSolicitados;
    }

    public void setDiasSolicitados(int diasSolicitados) {
        this.diasSolicitados = diasSolicitados;
    }

    public int getHorasSolicitadas() {
        return horasSolicitadas;
    }

    public void setHorasSolicitadas(int horasSolicitadas) {
        this.horasSolicitadas = horasSolicitadas;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Double getCantidadDescontar() {
        return cantidadDescontar;
    }

    public void setCantidadDescontar(Double cantidadDescontar) {
        this.cantidadDescontar = cantidadDescontar;
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
        return "Permiso{" + "id=" + id + ", motivo=" + motivo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", diasSolicitados=" + diasSolicitados + ", horasSolicitadas=" + horasSolicitadas + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", cantidadDescontar=" + cantidadDescontar + ", observacion=" + observacion + ", estado=" + estado + ", fkdocente=" + fkdocente + '}';
    }

  

}
