import java.util.Date;

public class Ensayo {
    private int idEnsayo;
    private String codJefe;
    private Date fecha;
    private int idPRoducto;
    private int idCalidad;

    /// metodo contructor


    public Ensayo(int idEnsayo, String codJefe, Date fecha, int idPRoducto, int idCalidad) {
        this.idEnsayo = idEnsayo;
        this.codJefe = codJefe;
        this.fecha = fecha;
        this.idPRoducto = idPRoducto;
        this.idCalidad = idCalidad;
    }


    // meodo

    public int getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(int idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public String getCodJefe() {
        return codJefe;
    }

    public void setCodJefe(String codJefe) {
        this.codJefe = codJefe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdPRoducto() {
        return idPRoducto;
    }

    public void setIdPRoducto(int idPRoducto) {
        this.idPRoducto = idPRoducto;
    }

    public int getIdCalidad() {
        return idCalidad;
    }

    public void setIdCalidad(int idCalidad) {
        this.idCalidad = idCalidad;
    }
}
