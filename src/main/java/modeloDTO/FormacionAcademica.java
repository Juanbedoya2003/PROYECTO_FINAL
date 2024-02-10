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
public class FormacionAcademica {
    private int id;
    private String institucioneducativa;
    private String nivelinstruccion;
    private String numerocertificado;
    private int aniosaprobados;
    private String areaconocimiento;
    private String egresadograduado;
    private String titulobtenido;
    private String paistitulo;
    private int fkdocente;
    
    public FormacionAcademica(){
    }

    public FormacionAcademica(int id, String institucioneducativa, String nivelinstruccion, String numerocertificado, int aniosaprobados, String areaconocimiento, String egresadograduado, String titulobtenido, String paistitulo, int fkdocente) {
        this.id = id;
        this.institucioneducativa = institucioneducativa;
        this.nivelinstruccion = nivelinstruccion;
        this.numerocertificado = numerocertificado;
        this.aniosaprobados = aniosaprobados;
        this.areaconocimiento = areaconocimiento;
        this.egresadograduado = egresadograduado;
        this.titulobtenido = titulobtenido;
        this.paistitulo = paistitulo;
        this.fkdocente = fkdocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucioneducativa() {
        return institucioneducativa;
    }

    public void setInstitucioneducativa(String institucioneducativa) {
        this.institucioneducativa = institucioneducativa;
    }

    public String getNivelinstruccion() {
        return nivelinstruccion;
    }

    public void setNivelinstruccion(String nivelinstruccion) {
        this.nivelinstruccion = nivelinstruccion;
    }

    public String getNumerocertificado() {
        return numerocertificado;
    }

    public void setNumerocertificado(String numerocertificado) {
        this.numerocertificado = numerocertificado;
    }

    public int getAniosaprobados() {
        return aniosaprobados;
    }

    public void setAniosaprobados(int aniosaprobados) {
        this.aniosaprobados = aniosaprobados;
    }

    public String getAreaconocimiento() {
        return areaconocimiento;
    }

    public void setAreaconocimiento(String areaconocimiento) {
        this.areaconocimiento = areaconocimiento;
    }

    public String getEgresadograduado() {
        return egresadograduado;
    }

    public void setEgresadograduado(String egresadograduado) {
        this.egresadograduado = egresadograduado;
    }

    public String getTitulobtenido() {
        return titulobtenido;
    }

    public void setTitulobtenido(String titulobtenido) {
        this.titulobtenido = titulobtenido;
    }

    public String getPaistitulo() {
        return paistitulo;
    }

    public void setPaistitulo(String paistitulo) {
        this.paistitulo = paistitulo;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "FormacionAcademica{" + "id=" + id + ", institucioneducativa=" + institucioneducativa + ", nivelinstruccion=" + nivelinstruccion + ", numerocertificado=" + numerocertificado + ", aniosaprobados=" + aniosaprobados + ", areaconocimiento=" + areaconocimiento + ", egresadograduado=" + egresadograduado + ", titulobtenido=" + titulobtenido + ", paistitulo=" + paistitulo + ", fkdocente=" + fkdocente + '}';
    }

}