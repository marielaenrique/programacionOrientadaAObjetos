public class Edicion {
    private Integer numero;
    private String fecha;
    private Double precio;

    public Edicion(Integer numero, String fecha, Double precio) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
    }

    public void nombrarRevistaArticulo(Revista revista, Articulo articulo) {
        System.out.println("Esta edicion es de la revista " + revista.getNombre() + " y tiene el articulo " + articulo.getTitulo());
    }
}