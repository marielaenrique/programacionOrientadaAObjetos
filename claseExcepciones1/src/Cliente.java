public class Cliente {
    private String nombre;
    private String apellido;
    private String documento;
    private Double saldoEnCuenta;
    private Double limite;

    public Cliente(String nombre, String apellido, String documento, Double saldoEnCuenta, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.saldoEnCuenta = saldoEnCuenta;
        this.limite = limite;
    }

    public Double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public Double getLimite() {
        return limite;
    }

    public void comprar(Double importe) throws ClienteException {
        if (importe > this.limite) {
            throw new ClienteException("El importe supera el limite disponible");
        }
        this.saldoEnCuenta -= importe;
    }

    public void saldarDeuda(Double importe) throws ClienteException {
        if (this.saldoEnCuenta >= 0.0) {
            throw new ClienteException("No hay deuda");
        }
        this.saldoEnCuenta += importe;
    }
}