public class Main {
    public static void main(String[] args) {
        Revista revista = new Revista("Hola", "1234", "Semanal");
        Edicion edicion = new Edicion(1, "2/2/2022", 10.00);
        Articulo articulo = new Articulo("Uno", "Dos", "Juan", "1/1/2022");

        revista.nombrarAutorArticulo(articulo);
        edicion.nombrarRevistaArticulo(revista, articulo);
        articulo.decirTema();
    }
}