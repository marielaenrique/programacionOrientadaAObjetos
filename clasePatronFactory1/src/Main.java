public class Main {
    public static void main(String[] args) {
        ProductoFactory productoFactory = ProductoFactory.getInstance();
        Almacen almacen = new Almacen();
        almacen.agregarProducto(productoFactory.crearProducto("CAJA10X10"));
        almacen.agregarProducto(productoFactory.crearProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(productoFactory.crearProducto("PELOTATENIS"));
        System.out.println(almacen.calcularEspacioNecesario());
    }
}