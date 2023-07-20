import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Comprable> comprables;

    public Carrito() {
        comprables = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable) {
        comprables.add(comprable);
    }

    public Double calcularTotalCompra() {
        Double total = 0.0;
        for (Comprable comprable : comprables) {
            total += comprable.calcularPrecio();
        }
        return total;
    }
}