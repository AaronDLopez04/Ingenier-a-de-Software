public class Main {
    public static void main(String[] args) {
        Producto libro = ProductoFactory.createProducto("libro", "979-3-16-148410-0", "El Principito", "Un libro sobre un niño y un zorro", "Antonie de Saint-Exupéry", 15.99, 96);
        Producto revista = ProductoFactory.createProducto("revista", "1234-5678", "National Geograpfhic", 202, 9.99, "Mensual");
        Producto periodico = ProductoFactory.createProducto("periodico", 1, "El Universal", "2025-04-03", 2.50);

        libro.displayInfo();
        revista.displayInfo();
        periodico.displayInfo();
    }
}