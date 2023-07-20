public class SocioHabilitado extends Socio{
    private Double costoPileta;
    private Boolean habilitado;

    public SocioHabilitado(String numeroSocio, String nombre, Double cuotaMensual, String actividad,
                           Double costoPileta) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = true;
    }

    @Override
    public Double calcularCostoMensual() {
        return super.calcularCostoMensual() + costoPileta;
    }

    public void usoPileta() {
        System.out.println("Uso la pileta");
    }
}