import java.io.Serializable;

public class Revista implements Producto{
    private String ISSN;
    private String nombre;
    private int edicion;
    private double precio;
    private String periodicidad;

    public Revista() {
    }

    public Revista(String ISSN, String nombre, int edicion, double precio, String periodicidad) {
        this.ISSN = ISSN;
        this.nombre = nombre;
        this.edicion = edicion;
        this.precio = precio;
        this.periodicidad = periodicidad;
    }

    public String getISSN() {
        return ISSN;
    }
    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdicion() {
        return edicion;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getPeriodicidad() {
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "[Revista] ISSN: " + ISSN + " Nombre: " + nombre + " Edicion: " + edicion + " Precio: " + precio + " Periodicidad: " + periodicidad ;
    }

}
