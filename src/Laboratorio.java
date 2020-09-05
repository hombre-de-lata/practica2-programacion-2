import java.util.List;

public class Laboratorio {

    private int codCalidad;
    private String nombre;
    private String ciudad;
    private double direccion;
    private int telefono;
    private List<Calidad> calidads;

    //metodo contructor
    public Laboratorio(int codCalidad, String nombre, String ciudad, double direccion, int telefono, List<Calidad> calidads) {
        this.codCalidad = codCalidad;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.calidads = calidads;
    }
    // metodo


    public int getCodCalidad() {
        return codCalidad;
    }

    public void setCodCalidad(int codCalidad) {
        this.codCalidad = codCalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getDireccion() {
        return direccion;
    }

    public void setDireccion(double direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Calidad> getCalidads() {
        return calidads;
    }

    public void setCalidads(List<Calidad> calidads) {
        this.calidads = calidads;
    }
}
