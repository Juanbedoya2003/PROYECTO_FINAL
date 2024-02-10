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
public class ContactoEmergencia {
    
    private int id;
    private String contactoapellidos;
    private String contactonombres;
    private String  contactotelefonodomicilio;
    private String contactotelefonocelular;
    private int fkdocente;
    
    
    public ContactoEmergencia(){
    }

    public ContactoEmergencia(int id, String contactoapellidos, String contactonombres, String contactotelefonodomicilio, String contactotelefonocelular, int fkdocente) {
        this.id = id;
        this.contactoapellidos = contactoapellidos;
        this.contactonombres = contactonombres;
        this.contactotelefonodomicilio = contactotelefonodomicilio;
        this.contactotelefonocelular = contactotelefonocelular;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "ContactoEmergencia{" + "id=" + id + ", contactoapellidos=" + contactoapellidos + ", contactonombres=" + contactonombres + ", contactotelefonodomicilio=" + contactotelefonodomicilio + ", contactotelefonocelular=" + contactotelefonocelular + ", fkdocente=" + fkdocente + '}';
    }
    
    
    
}
