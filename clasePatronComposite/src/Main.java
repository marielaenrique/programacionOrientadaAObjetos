public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Producto hamburguesa = new Producto("Hamburguesa", 500.0);
        Producto gaseosa = new Producto("Gaseosa", 200.0);
        Producto papas = new Producto("Papas", 300.0);
        Combo combo1 = new Combo(0.1);

        System.out.println(hamburguesa.calcularPrecio());
        System.out.println(gaseosa.calcularPrecio());
        System.out.println(papas.calcularPrecio());

        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(gaseosa);
        System.out.println(combo1.calcularPrecio());

        carrito.agregarComprable(combo1);
        carrito.agregarComprable(papas);
        System.out.println(carrito.calcularTotalCompra());
    }
}