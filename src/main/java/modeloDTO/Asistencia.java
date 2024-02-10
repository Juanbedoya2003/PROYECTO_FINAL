
package modeloDTO;

public class Asistencia {

    private int id;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private String horasTrabajadas;
    private String observacion;
    private String estado;
    private int fkdocente;
    
    public Asistencia(){
    }

    public Asistencia(int id, String fecha, String horaEntrada, String horaSalida, String horasTrabajadas, String observacion, String estado, int fkdocente) {
        this.id = id;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.horasTrabajadas = horasTrabajadas;
        this.observacion = observacion;
        this.estado = estado;
        this.fkdocente = fkdocente;
    }

    public String getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(String horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFkdocente() {
        return fkdocente;
    }

    public void setFkdocente(int fkdocente) {
        this.fkdocente = fkdocente;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "id=" + id + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", horasTrabajadas=" + horasTrabajadas + ", observacion=" + observacion + ", estado=" + estado + ", fkdocente=" + fkdocente + '}';
    }
    
   
    
}
