public class UnidadSimple extends Unidad {
    private Double montoPorPersona;
    private Integer cantidadPersonas;

    public UnidadSimple(String nombre, String descripcion, Double montoPorPersona, Integer cantidadPersonas) {
        super(nombre, descripcion);
        this.montoPorPersona = montoPorPersona;
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public Double calcularMonto() {
        Double montoTotal = montoPorPersona * cantidadPersonas;
        if (cantidadPersonas > 10) {
            return montoTotal + (montoTotal * 0.2);
        }
        return montoTotal;
    }
}