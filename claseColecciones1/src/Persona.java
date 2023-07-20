import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private List<Cuenta> cuentas = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public Boolean esMayorEdad() {
        return edad > 60;
    }

    public void incorporarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void mostrarCuentas() {
        for (Cuenta cuenta: cuentas) {
            System.out.println(cuenta.getSaldo());
        }
    }

    public void mostrarCuentaPorNumero() {
        cuentas.sort(null);
        mostrarCuentas();
    }

    public Double getSaldoTotal() {
        Double total = 0.0;
        for (Cuenta cuenta: cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }
}