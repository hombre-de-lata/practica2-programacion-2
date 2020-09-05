import java.util.Date;
import java.util.List;

public class Calidad {

    private int idCalidad;
    private Date fechaVencimiento;
    private String eficiencia;
    private String tipo;
    private Date fechaInicio;
    private List<Laboratorio> laboratorios;

    // metodo contrucot


    public Calidad(int idCalidad, Date fechaVencimiento, String eficiencia, String tipo, Date fechaInicio, List<Laboratorio> laboratorios) {
        this.idCalidad = idCalidad;
        this.fechaVencimiento = fechaVencimiento;
        this.eficiencia = eficiencia;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.laboratorios = laboratorios;
    }


    /// metoedo


    public int getIdCalidad() {
        return idCalidad;
    }

    public void setIdCalidad(int idCalidad) {
        this.idCalidad = idCalidad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public List<Laboratorio> getLaboratorios() {
        return laboratorios;
    }

    public void setLaboratorios(List<Laboratorio> laboratorios) {
        this.laboratorios = laboratorios;
    }
}
