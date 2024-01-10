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
public class ContactoEmergencia {
    
    private int idcontactoemergencia;
    private String contactoapellidos;
    private String contactonombres;
    private String  contactotelefonodomicilio;
    private String contactotelefonocelular;

    public ContactoEmergencia(int idcontactoemergencia, String contactoapellidos, String contactonombres, String contactotelefonodomicilio, String contactotelefonocelular) {
        this.idcontactoemergencia = idcontactoemergencia;
        this.contactoapellidos = contactoapellidos;
        this.contactonombres = contactonombres;
        this.contactotelefonodomicilio = contactotelefonodomicilio;
        this.contactotelefonocelular = contactotelefonocelular;
    }

    public int getIdcontactoemergencia() {
        return idcontactoemergencia;
    }

    public void setIdcontactoemergencia(int idcontactoemergencia) {
        this.idcontactoemergencia = idcontactoemergencia;
    }

    public String getContactoapellidos() {
        return contactoapellidos;
    }

    public void setContactoapellidos(String contactoapellidos) {
        this.contactoapellidos = contactoapellidos;
    }

    public String getContactonombres() {
        return contactonombres;
    }

    public void setContactonombres(String contactonombres) {
        this.contactonombres = contactonombres;
    }

    public String getContactotelefonodomicilio() {
        return contactotelefonodomicilio;
    }

    public void setContactotelefonodomicilio(String contactotelefonodomicilio) {
        this.contactotelefonodomicilio = contactotelefonodomicilio;
    }

    public String getContactotelefonocelular() {
        return contactotelefonocelular;
    }

    public void setContactotelefonocelular(String contactotelefonocelular) {
        this.contactotelefonocelular = contactotelefonocelular;
    }
    
}
