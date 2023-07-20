import java.util.Date;

public class Main {
    public static void main(String[] args) throws PacienteException {
        Paciente paciente1 = new Paciente("Pepe", "Juan", "1234", 2022);
        System.out.println(paciente1.getAnioInternacion());
        System.out.println(paciente1.getAnioAlta());
        paciente1.darAlta(2021);
        System.out.println(paciente1.getAnioAlta());
    }
}