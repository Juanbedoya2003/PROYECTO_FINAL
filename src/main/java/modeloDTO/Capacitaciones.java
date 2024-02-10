/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDTO;

public class Capacitaciones {

    private int id;
    private String nombre;
    private String tipo;
    private String auspiciante;
    private int duracion;
    private String aprobadoDesaprobado;
    private String pais;
    private String institucionaprueba;
    private String fechahorainicio;
    private String fechahorafin;
    private int fkdocente;
    
    public Capacitaciones(){
    }

    public Capacitaciones(int id, String nombre, String tipo, String auspiciante, int duracion, String aprobadoDesaprobado, String pais, String institucionaprueba, String fechahorainicio, String fechahorafin, int fkdocente) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.auspiciante = auspiciante;
        this.duracion = duracion;
        this.aprobadoDesaprobado = aprobadoDesaprobado;
        this.pais = pais;
        this.institucionaprueba = institucionaprueba;
        this.fechahorainicio = fechahorainicio;
        this.fechahorafin = fechahorafin;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAuspiciante() {
        return auspiciante;
    }

    public void setAuspiciante(String auspiciante) {
        this.auspiciante = auspiciante;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAprobadoDesaprobado() {
        return aprobadoDesaprobado;
    }

    public void setAprobadoDesaprobado(String aprobadoDesaprobado) {
        this.aprobadoDesaprobado = aprobadoDesaprobado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getInstitucionaprueba() {
        return institucionaprueba;
    }

    public void setInstitucionaprueba(String institucionaprueba) {
        this.institucionaprueba = institucionaprueba;
    }

    public String getFechahorainicio() {
        return fechahorainicio;
    }

    public void setFechahorainicio(String fechahorainicio) {
        this.fechahorainicio = fechahorainicio;
    }

    public String getFechahorafin() {
        return fechahorafin;
    }

    public void setFechahorafin(String fechahorafin) {
        this.fechahorafin = fechahorafin;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Capacitaciones{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", auspiciante=" + auspiciante + ", duracion=" + duracion + ", aprobadoDesaprobado=" + aprobadoDesaprobado + ", pais=" + pais + ", institucionaprueba=" + institucionaprueba + ", fechahorainicio=" + fechahorainicio + ", fechahorafin=" + fechahorafin + ", fkdocente=" + fkdocente + '}';
    }

}
