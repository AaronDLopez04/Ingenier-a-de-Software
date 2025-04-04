public class Lobby {
    public void iniciarLobby() {
        // Obtener la misma instancia del Singleton
        Configuracion config = Configuracion.getInstancia();

        System.out.println("Configuración recibida en Lobby:");
        config.mostrarConfiguracion();

        config.setResolucion("1280x720");

        System.out.println("Configuración modificada en Lobby:");
        config.mostrarConfiguracion();
    }
}

