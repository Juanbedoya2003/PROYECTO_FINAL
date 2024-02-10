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
public class Hijo {

    private int id;
    private String hijocedula;
    private String hijoapellidos;
    private String hijonombres;
    private String hijofechaNacimiento;
    private String hijoescolaridad;
    private int fkdocente;
    
    public Hijo(){
    }

    public Hijo(int id, String hijocedula, String hijoapellidos, String hijonombres, String hijofechaNacimiento, String hijoescolaridad, int fkdocente) {
        this.id = id;
        this.hijocedula = hijocedula;
        this.hijoapellidos = hijoapellidos;
        this.hijonombres = hijonombres;
        this.hijofechaNacimiento = hijofechaNacimiento;
        this.hijoescolaridad = hijoescolaridad;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHijocedula() {
        return hijocedula;
    }

    public void setHijocedula(String hijocedula) {
        this.hijocedula = hijocedula;
    }

    public String getHijoapellidos() {
        return hijoapellidos;
    }

    public void setHijoapellidos(String hijoapellidos) {
        this.hijoapellidos = hijoapellidos;
    }

    public String getHijonombres() {
        return hijonombres;
    }

    public void setHijonombres(String hijonombres) {
        this.hijonombres = hijonombres;
    }

    public String getHijofechaNacimiento() {
        return hijofechaNacimiento;
    }

    public void setHijofechaNacimiento(String hijofechaNacimiento) {
        this.hijofechaNacimiento = hijofechaNacimiento;
    }

    public String getHijoescolaridad() {
        return hijoescolaridad;
    }

    public void setHijoescolaridad(String hijoescolaridad) {
        this.hijoescolaridad = hijoescolaridad;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Hijo{" + "id=" + id + ", hijocedula=" + hijocedula + ", hijoapellidos=" + hijoapellidos + ", hijonombres=" + hijonombres + ", hijofechaNacimiento=" + hijofechaNacimiento + ", hijoescolaridad=" + hijoescolaridad + ", fkdocente=" + fkdocente + '}';
    }
    
}
