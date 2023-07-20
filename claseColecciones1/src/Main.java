public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setNumeroCuenta(1111);
        cuenta1.setSaldo(200.0);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setNumeroCuenta(0000);
        cuenta2.setSaldo(100.0);

        System.out.println(cuenta1.compareTo(cuenta2));

        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setApellido("Alonso");
        persona1.setEdad(61);
        System.out.println(persona1.getNombreCompleto());
        System.out.println(persona1.esMayorEdad());

        persona1.incorporarCuenta(cuenta1);
        persona1.incorporarCuenta(cuenta2);
        persona1.mostrarCuentas();
        persona1.mostrarCuentaPorNumero();
        System.out.println(persona1.getSaldoTotal());
    }
}