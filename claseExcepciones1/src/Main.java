public class Main {
    public static void main(String[] args) throws ClienteException {
        Cliente cliente1 = new Cliente("Pepe", "Juan", "1234", 100.0, 100.0);
        cliente1.comprar(101.0);
        cliente1.saldarDeuda(200.0);
    }
}