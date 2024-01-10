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
public class InclusionLaboral {
    private int idinclusionlaboral;
    private String incmigrante;
    private String incnacionalidad;
    private String incembarazo;
    private int  incmesesembarazo;
    private String inclicencia;
    private String incporcentaje;

    public InclusionLaboral(int idinclusionlaboral, String incmigrante, String incnacionalidad, String incembarazo, int incmesesembarazo, String inclicencia, String incporcentaje) {
        this.idinclusionlaboral = idinclusionlaboral;
        this.incmigrante = incmigrante;
        this.incnacionalidad = incnacionalidad;
        this.incembarazo = incembarazo;
        this.incmesesembarazo = incmesesembarazo;
        this.inclicencia = inclicencia;
        this.incporcentaje = incporcentaje;
    }

    public String getIncporcentaje() {
        return incporcentaje;
    }

    public void setIncporcentaje(String incporcentaje) {
        this.incporcentaje = incporcentaje;
    }

    public int getIdinclusionlaboral() {
        return idinclusionlaboral;
    }

    public void setIdinclusionlaboral(int idinclusionlaboral) {
        this.idinclusionlaboral = idinclusionlaboral;
    }

    public String getIncmigrante() {
        return incmigrante;
    }

    public void setIncmigrante(String incmigrante) {
        this.incmigrante = incmigrante;
    }

    public String getIncnacionalidad() {
        return incnacionalidad;
    }

    public void setIncnacionalidad(String incnacionalidad) {
        this.incnacionalidad = incnacionalidad;
    }

    public String getIncembarazo() {
        return incembarazo;
    }

    public void setIncembarazo(String incembarazo) {
        this.incembarazo = incembarazo;
    }

    public int getIncmesesembarazo() {
        return incmesesembarazo;
    }

    public void setIncmesesembarazo(int incmesesembarazo) {
        this.incmesesembarazo = incmesesembarazo;
    }

    public String getInclicencia() {
        return inclicencia;
    }

    public void setInclicencia(String inclicencia) {
        this.inclicencia = inclicencia;
    }
    
}
