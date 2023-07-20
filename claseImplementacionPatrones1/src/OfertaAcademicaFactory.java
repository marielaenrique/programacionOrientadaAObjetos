public class OfertaAcademicaFactory {
    public static final String FRONT_END = "FRONTEND";
    public static final String BACK_END = "BACKEND";
    public static final String FULL_STACK = "FULLSTACK";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory() {

    }

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null) {
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException {
        switch (codigo) {
            case FRONT_END:
                return new Curso("Front End", "Curso", 16.0, 2.0, 1000.0);
            case BACK_END:
                return new Curso("Back End", "Curso", 20.0, 2.0, 900.0);
            case FULL_STACK:
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("Full Stack", "Programa Intensivo", 0.20);
                programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica(FRONT_END));
                programaIntensivo.agregarOfertaAcademica(crearOfertaAcademica(BACK_END));
                return programaIntensivo;
        }
        throw new OfertaAcademicaFactoryException("El codigo " + codigo + " no es valido");
    }
}