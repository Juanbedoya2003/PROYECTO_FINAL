/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDTO;

public class Conyuge {

    private int id;
    private String cedula;
    private String apellidos;
    private String nombres;
    private String tiporelacion;
    private int fkdocente;

    public Conyuge(int id, String cedula, String apellidos, String nombres, String tiporelacion, int fkdocente) {
        this.id = id;
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tiporelacion = tiporelacion;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTiporelacion() {
        return tiporelacion;
    }

    public void setTiporelacion(String tiporelacion) {
        this.tiporelacion = tiporelacion;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Conyuge{" + "id=" + id + ", cedula=" + cedula + ", apellidos=" + apellidos + ", nombres=" + nombres + ", tiporelacion=" + tiporelacion + ", fkdocente=" + fkdocente + '}';
    }
    
    
}