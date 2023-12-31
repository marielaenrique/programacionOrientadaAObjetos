public class ProductoFactory {
    private static ProductoFactory instance;
    private ProductoFactory() {
    }

    public static ProductoFactory getInstance() {
        if (instance == null) {
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto crearProducto(String codigo) {
        switch (codigo) {
            case "CAJA10X10":
                return new Caja(5.0, 10.0, 10.0, 10.0);
            case "PELOTAFUTBOL":
                return new Pelota(5.0, 11.0);
            case "PELOTATENIS":
                return new Pelota(2.0, 0.32);
        }
        return null;
    }
}