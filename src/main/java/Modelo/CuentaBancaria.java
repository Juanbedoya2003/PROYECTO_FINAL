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
public class CuentaBancaria {
    private int idcuentabancaria;
    private String  institucionfinanciera;
    private String  tipocuenta;
    private String numerocuenta;

    public CuentaBancaria(int idcuentabancaria, String institucionfinanciera, String tipocuenta, String numerocuenta) {
        this.idcuentabancaria = idcuentabancaria;
        this.institucionfinanciera = institucionfinanciera;
        this.tipocuenta = tipocuenta;
        this.numerocuenta = numerocuenta;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public int getIdcuentabancaria() {
        return idcuentabancaria;
    }

    public void setIdcuentabancaria(int idcuentabancaria) {
        this.idcuentabancaria = idcuentabancaria;
    }

    public String getInstitucionfinanciera() {
        return institucionfinanciera;
    }

    public void setInstitucionfinanciera(String institucionfinanciera) {
        this.institucionfinanciera = institucionfinanciera;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }
    
}
