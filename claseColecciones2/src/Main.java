public class Main {
    public static void main(String[] args) {

        Contenedor contenedor1 = new Contenedor(1111, "Desconocida", true);
        Contenedor contenedor2 = new Contenedor(2222, "Argentina", true);
        Contenedor contenedor3 = new Contenedor(3333, "Chile", false);
        Contenedor contenedor4 = new Contenedor(4444, "Desconocida", false);

        Puerto puerto1 = new Puerto();

        puerto1.agregarContenedor(contenedor2);
        puerto1.agregarContenedor(contenedor3);
        puerto1.agregarContenedor(contenedor4);
        puerto1.agregarContenedor(contenedor1);
        puerto1.mostrarContenedores();
        puerto1.mostrarContenedoresOrdenados();
        System.out.println(puerto1.cantidadPeligrososDesconocida());
    }
}