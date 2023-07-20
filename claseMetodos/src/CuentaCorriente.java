public class CuentaCorriente extends Cuenta{
    private Double montoGiroDescubierto;
    public CuentaCorriente(Double saldo, Double montoGiroDescubierto) {
        super(saldo);
        this.montoGiroDescubierto = montoGiroDescubierto;
    }
    @Override
    public void extraer(Double monto) {
        if (super.informarSaldo() >= monto) {
            super.setSaldo(super.informarSaldo() - monto);
            System.out.println("Se extrajo " + monto);
        }
        else if (super.informarSaldo() < monto && (super.informarSaldo() + montoGiroDescubierto) >= monto) {
            super.setSaldo(0.0);
            montoGiroDescubierto -= monto - super.informarSaldo();
            System.out.println("Se extrajo " + monto);
        }
        else {
            System.out.println("Fondos insuficientes");
        }
    }
}