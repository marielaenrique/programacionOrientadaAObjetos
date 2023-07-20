import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable {
    private Double descuento;
    private List<Comprable> comprables;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprables = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable) {
        comprables.add(comprable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Comprable comprable : comprables) {
            precioTotal += comprable.calcularPrecio();
        }
        Double precioFinal = precioTotal - (descuento * precioTotal);
        return precioFinal;
    }
}