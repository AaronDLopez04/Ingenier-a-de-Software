public class Configuracion {

    // Instancia única del Singleton
    private static Configuracion instancia;

    private String resolucion;
    private int volumen;
    private String idioma;

    private Configuracion() {
        this.resolucion = "1920x1080";
        this.volumen = 50;
        this.idioma = "Español";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    // Getters y Setters
    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void mostrarConfiguracion() {
        System.out.println("Configuración actual:");
        System.out.println("Resolución: " + resolucion);
        System.out.println("Volumen: " + volumen);
        System.out.println("Idioma: " + idioma);
        System.out.println("------------------------");
    }
}
