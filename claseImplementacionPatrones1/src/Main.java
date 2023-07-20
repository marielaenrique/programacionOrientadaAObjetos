public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto();
        instituto.agregarOfertaAcademica(OfertaAcademicaFactory.FRONT_END);
        instituto.agregarOfertaAcademica(OfertaAcademicaFactory.BACK_END);
        instituto.agregarOfertaAcademica("HOLA");
        instituto.agregarOfertaAcademica("FULL_STACK");
        instituto.agregarOfertaAcademica(OfertaAcademicaFactory.FULL_STACK);
        instituto.generarInforme();
    }
}