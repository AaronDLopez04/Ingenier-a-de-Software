public class Periodico implements Producto{
    private int id;
    private String nombre;
    private String fechaPublicacion;
    private double precio;

    public Periodico(){
    }

    public Periodico(int id, String nombre, String fechaPublicacion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "[Periódico] ID: " + id + " Nombre: " + nombre + " Fecha de Publicación: " + fechaPublicacion + " Precio: " + precio;
    }

}
