import org.w3c.dom.ls.LSOutput;
public class CajaAhorro extends Cuenta{
    private Double tasaInteres;
    public CajaAhorro(Double saldo, Double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }
    public void cobrarInteres() {
        System.out.println((super.informarSaldo() * tasaInteres) / 100);
    }
    @Override
    public void extraer(Double monto) {
        if (super.informarSaldo() >= monto) {
            super.setSaldo(super.informarSaldo() - monto);
            System.out.println("Se extrajo " + monto);
        }
        else {
            System.out.println("Fondos insuficientes");
        }
    }
}