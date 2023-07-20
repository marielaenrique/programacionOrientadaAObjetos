import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Puerto {
    private List<Contenedor> lista = new ArrayList<>();

    public void agregarContenedor(Contenedor contenedor) {
        lista.add(contenedor);
    }

    public void mostrarContenedores() {
        for (Contenedor contenedor : lista) {
            System.out.println("Contenedor " + contenedor.getNumero() + " Procedencia: " + contenedor.getProcedencia());
        }
    }

    public void mostrarContenedoresOrdenados() {
        lista.sort(null);
        mostrarContenedores();
    }

    public Integer cantidadPeligrososDesconocida() {
        Integer contador = 0;
        for (Contenedor contenedor : lista) {
            if (contenedor.getProcedencia().equals("Desconocida") && contenedor.getTieneMaterialesPeligrosos()) {
                contador += 1;
            }
        }
        return contador;
    }
}