public class Seguidor implements Observador {
    private String nombre;
    private String apellido;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void actualizar(Usuario usuario) {
        System.out.println(nombre + " fue notificado de la foto subida por " + usuario.getNombre());
    }
}