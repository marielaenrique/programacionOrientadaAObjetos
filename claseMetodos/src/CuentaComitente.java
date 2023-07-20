public class CuentaComitente extends Cuenta {
    private String clave;
    public CuentaComitente(Double saldo, String clave) {
        super(saldo);
        this.clave = clave;
    }
    @Override
    public void extraer(Double monto) {
        if (super.informarSaldo()/2 >= monto) {
            super.setSaldo(super.informarSaldo() - monto);
            System.out.println("Se extrajo " + monto);
        }
        else {
            System.out.println("Ingrese la clave");
        }
    }
    public void extraer(Double monto, String clave) {
        if (this.clave != clave) {
            System.out.println("Clave incorrecta");
        }
        else {
            if (super.informarSaldo() >= monto) {
                super.setSaldo(super.informarSaldo() - monto);
                System.out.println("Se extrajo " + monto);
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
    }
    @Override
    public void depositar(Double monto) {
        super.depositar(monto * 0.99);
    }
}