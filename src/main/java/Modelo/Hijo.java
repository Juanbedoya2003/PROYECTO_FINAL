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
public class Hijo {
     private int idhijo;
    private String hijocedula;
   private String hijoapellidos;
   private String hijonombre;
   private String hijofechaNacimiento;
   private String hijoescolaridad;

    public Hijo(int idhijo, String hijocedula, String hijoapellidos, String hijonombre, String hijofechaNacimiento, String hijoescolaridad) {
        this.idhijo = idhijo;
        this.hijocedula = hijocedula;
        this.hijoapellidos = hijoapellidos;
        this.hijonombre = hijonombre;
        this.hijofechaNacimiento = hijofechaNacimiento;
        this.hijoescolaridad = hijoescolaridad;
    }

    public int getIdhijo() {
        return idhijo;
    }

    public void setIdhijo(int idhijo) {
        this.idhijo = idhijo;
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

    public String getHijonombre() {
        return hijonombre;
    }

    public void setHijonombre(String hijonombre) {
        this.hijonombre = hijonombre;
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

   
}

    