import java.util.Date;
public class Paciente {
    private String nombre;
    private String apellido;
    private String documento;
    private Integer anioActual;
    private Integer anioInternacion;
    private Integer anioAlta;

    public Paciente(String nombre, String apellido, String documento, Integer anioInternacion) throws PacienteException {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioActual = 2022;
        if (anioInternacion <= anioActual) {
            this.anioInternacion = anioInternacion;
        }
        else {
            throw new PacienteException("No se puede");
        }
        this.anioAlta = null;
    }

    public Integer getAnioInternacion() {
        return anioInternacion;
    }

    public Integer getAnioAlta() {
        return anioAlta;
    }

    public void darAlta(Integer anioAlta) throws PacienteException{
        if (anioAlta < anioInternacion) {
            throw new PacienteException("No se puede, fecha de alta incorrecta");
        }
        else {
            this.anioAlta = anioAlta;
        }
    }
}