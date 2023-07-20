import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private Double bonificacion;
    private List<OfertaAcademica> ofertaList;

    public ProgramaIntensivo(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        ofertaList = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica) {
        ofertaList.add(ofertaAcademica);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertaList) {
            precioTotal += ofertaAcademica.calcularPrecio();
        }
        return precioTotal - (precioTotal * bonificacion);
    }
}