import java.util.Locale;

public class ProductoFactory {
    public static Producto createProducto(String type, Object... args){
        return switch (type.toLowerCase()) {
            case "libro" -> new Libro((String) args[0], (String) args[1], (String) args[2], (String) args[3], (double) args[4], (int) args[5]);
            case "revista" -> new Revista((String) args[0], (String) args[1], (int) args[2], (double) args[3], (String) args[4]);
            case "periodico" -> new Periodico((int) args[0], (String) args[1], (String) args[2], (double) args[3]);
            default -> throw new IllegalArgumentException("Tipo de producto no reconocido.");
        };
    }
}
