public abstract class Habilidad {
    private String nombre;
    private String descripcion;

    public Habilidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Double calcularPuntaje();

    @Override
    public String toString() {
        return "Habilidad: " + nombre + "\n" + "Puntaje: " + calcularPuntaje();
    }
}