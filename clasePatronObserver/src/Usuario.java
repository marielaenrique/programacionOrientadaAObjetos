import jdk.dynalink.linker.LinkerServices;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable {
    private String nombre;
    private String apellido;
    private Integer cantidadFotos;
    private List<Observador> observadorList;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cantidadFotos = 0;
        observadorList = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSeguidor(Observador observador) {
        observadorList.add(observador);
    }

    public void eliminarSeguidor(Observador observador) {
        observadorList.remove(observador);
    }

    public void subirFoto() {
        cantidadFotos++;
        System.out.println("Cantidad de fotos " + cantidadFotos);
        notificar();
    }

    public void eliminarFoto() {
        cantidadFotos--;
        System.out.println("Cantidad de fotos " + cantidadFotos);
    }

    @Override
    public void notificar() {
        for (Observador observador : observadorList) {
            observador.actualizar(this);
        }
    }
}