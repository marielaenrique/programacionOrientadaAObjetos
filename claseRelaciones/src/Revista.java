public class Revista {
    private String nombre;
    private String codigo;
    private String periodicidad;

    public Revista(String nombre, String codigo, String periodicidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.periodicidad = periodicidad;
    }

    public void nombrarAutorArticulo(Articulo articulo) {
        System.out.println("Esta revista tiene un articulo de " + articulo.getAutor());
    }

    public String getNombre() {
        return nombre;
    }
}