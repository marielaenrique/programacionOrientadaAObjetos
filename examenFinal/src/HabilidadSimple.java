public class HabilidadSimple extends Habilidad {
    private Double puntaje;

    public HabilidadSimple(String nombre, String descripcion, Double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    @Override
    public Double calcularPuntaje() {
        if (this.getNombre().equals("Disparar")) {
            return puntaje + (puntaje * 0.1);
        }
        return puntaje;
    }
}