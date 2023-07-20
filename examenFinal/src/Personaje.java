import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private List<Habilidad> habilidadList;

    public Personaje() {
        habilidadList = new ArrayList<>();
    }

    public void agregarHabilidad(String codigo) {
        try {
            habilidadList.add(HabilidadFactory.getInstance().crearHabilidad(codigo));
        }
        catch (HabilidadFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarHabilidad() {
        for (Habilidad habilidad : habilidadList) {
            System.out.println(habilidad);
        }
    }
}