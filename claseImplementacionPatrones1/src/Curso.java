public class Curso extends OfertaAcademica {
    private Double cargaHorariaMensual;
    private Double mesesDeDuracion;
    private Double valorHora;

    public Curso(String nombre, String descripcion, Double cargaHorariaMensual, Double mesesDeDuracion, Double valorHora) {
        super(nombre, descripcion);
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.mesesDeDuracion = mesesDeDuracion;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcularPrecio() {
        return cargaHorariaMensual * mesesDeDuracion * valorHora;
    }
}