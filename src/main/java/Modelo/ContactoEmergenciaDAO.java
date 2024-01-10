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
public class ContactoEmergenciaDAO {
    String Apellidos;
    String Nombres;
    String  telefonoDomicilio;
    String telefonoCelular;

    public ContactoEmergenciaDAO(String Apellidos, String Nombres, String telefonoDomicilio, String telefonoCelular) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.telefonoDomicilio = telefonoDomicilio;
        this.telefonoCelular = telefonoCelular;
    }
    
}
