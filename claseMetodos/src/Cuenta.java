public abstract class Cuenta {
    private Double saldo;
    public Cuenta(Double saldo) {
        this.saldo = saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void depositar(Double monto) {
        this.saldo += monto;
    }
    public Double informarSaldo() {
        return saldo;
    }
    public abstract void extraer(Double monto);
}