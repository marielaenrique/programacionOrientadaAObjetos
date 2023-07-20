public class EmpleadoContratado extends Empleado {
    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(Integer dias) {
        Double importeTotal = importePorHora * 8 * dias;
        return importeTotal - (importeTotal * retencionImpuesto);
    }
}