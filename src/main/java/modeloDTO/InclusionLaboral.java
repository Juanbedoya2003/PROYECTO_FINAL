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
public class InclusionLaboral {

    private int id;
    private String migrante;
    private String nacionalidad;
    private String embarazo;
    private String mesesembarazo;
    private String licencia;
    private String porcentaje;
    private int fkdocente;
    
    
    public InclusionLaboral(){
    }

    public InclusionLaboral(int id, String migrante, String nacionalidad, String embarazo, String mesesembarazo, String licencia, String porcentaje, int fkdocente) {
        this.id = id;
        this.migrante = migrante;
        this.nacionalidad = nacionalidad;
        this.embarazo = embarazo;
        this.mesesembarazo = mesesembarazo;
        this.licencia = licencia;
        this.porcentaje = porcentaje;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMigrante() {
        return migrante;
    }

    public void setMigrante(String migrante) {
        this.migrante = migrante;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getMesesembarazo() {
        return mesesembarazo;
    }

    public void setMesesembarazo(String mesesembarazo) {
        this.mesesembarazo = mesesembarazo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "InclusionLaboral{" + "id=" + id + ", migrante=" + migrante + ", nacionalidad=" + nacionalidad + ", embarazo=" + embarazo + ", mesesembarazo=" + mesesembarazo + ", licencia=" + licencia + ", porcentaje=" + porcentaje + ", fkdocente=" + fkdocente + '}';
    }
 
}
