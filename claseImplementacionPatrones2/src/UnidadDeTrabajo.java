import java.util.ArrayList;
import java.util.List;

public class UnidadDeTrabajo {
    private List<Unidad> unidadList;

    public UnidadDeTrabajo() {
        unidadList = new ArrayList<>();
    }

    public void agregarUnidad(String codigo) {
        try {
            unidadList.add(UnidadFactory.getInstance().crearUnidad(codigo));
        }
        catch (UnidadFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarComponentes() {
        for (Unidad unidad : unidadList) {
            System.out.println(unidad);
        }
    }
}