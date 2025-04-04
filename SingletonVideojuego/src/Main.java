public class Main {
    public static void main(String[] args) {
        // Obtener instancia única de Configuracion
        Configuracion config = Configuracion.getInstancia();

        // Mostrar configuración inicial
        config.mostrarConfiguracion();

        // Cambiar configuración desde Juego
        config.setVolumen(75);
        config.setIdioma("Inglés");

        System.out.println("Configuración modificada en Juego:");
        config.mostrarConfiguracion();

        // Llamar a Lobby
        Lobby lobby = new Lobby();
        lobby.iniciarLobby();

    }
}