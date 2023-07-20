import java.util.ArrayList;
import java.util.List;

public class UnidadCombinada extends Unidad {
    private Double coeficienteGlobal;
    private Double montoMaterial;
    private List<Unidad> unidadList;

    public UnidadCombinada(String nombre, String descripcion, Double coeficienteGlobal, Double montoMaterial) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.montoMaterial = montoMaterial;
        unidadList = new ArrayList<>();
    }

    public void agregarUnidad(Unidad unidad) {
        unidadList.add(unidad);
    }

    @Override
    public Double calcularMonto() {
        Double montoTotal = montoMaterial;
        for (Unidad unidad : unidadList) {
            montoTotal += unidad.calcularMonto();
        }
        return montoTotal * coeficienteGlobal;
    }
}