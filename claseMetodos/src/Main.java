public class Main {
    public static void main(String[] args) {
        CajaAhorro cajaAhorro = new CajaAhorro(200.0, 2.0);
        System.out.println(cajaAhorro.informarSaldo());
        cajaAhorro.depositar(200.0);
        System.out.println(cajaAhorro.informarSaldo());
        cajaAhorro.cobrarInteres();
        cajaAhorro.extraer(400.0);
        cajaAhorro.extraer(1.0);

        CuentaCorriente cuentaCorriente = new CuentaCorriente(200.0, 100.0);
        System.out.println(cuentaCorriente.informarSaldo());
        cuentaCorriente.depositar(100.0);
        System.out.println(cuentaCorriente.informarSaldo());
        cuentaCorriente.extraer(400.0);
        cuentaCorriente.extraer(1.0);

        Cuenta cuentaComitente = new CuentaComitente(100.0, "1234");
        System.out.println(cuentaComitente.informarSaldo());
        cuentaComitente.depositar(100.0);
        System.out.println(cuentaComitente.informarSaldo());
        cuentaComitente.extraer(151.0);
        ((CuentaComitente)cuentaComitente).extraer(200.0, "1234");
    }
}