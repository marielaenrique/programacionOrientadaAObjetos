public class Cuenta implements Comparable<Cuenta> {
    private Integer numeroCuenta;
    private Double saldo;

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        if (this.numeroCuenta > ((Cuenta)o).numeroCuenta) {
            return 1;
        }
        else if (this.numeroCuenta < ((Cuenta)o).numeroCuenta)
        {
            return -1;
        }
        else {
            return 0;
        }
    }
}