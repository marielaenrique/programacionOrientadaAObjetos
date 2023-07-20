import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> ofertaList;

    public Instituto() {
        ofertaList = new ArrayList<>();
    }

    public void agregarOfertaAcademica(String codigo) {
        try {
            ofertaList.add(OfertaAcademicaFactory.getInstance().crearOfertaAcademica(codigo));
        }
        catch (OfertaAcademicaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void generarInforme() {
        for (OfertaAcademica ofertaAcademica : ofertaList) {
            System.out.println(ofertaAcademica);
        }
    }
}