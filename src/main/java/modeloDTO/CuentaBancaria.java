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
public class CuentaBancaria {

    private int id;
    private String institucionfinanciera;
    private String tipocuenta;
    private String numerocuenta;
    private int fkdocente;

    public CuentaBancaria(int id, String institucionfinanciera, String tipocuenta, String numerocuenta, int fkdocente) {
        this.id = id;
        this.institucionfinanciera = institucionfinanciera;
        this.tipocuenta = tipocuenta;
        this.numerocuenta = numerocuenta;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "id=" + id + ", institucionfinanciera=" + institucionfinanciera + ", tipocuenta=" + tipocuenta + ", numerocuenta=" + numerocuenta + ", fkdocente=" + fkdocente + '}';
    }
    
}
