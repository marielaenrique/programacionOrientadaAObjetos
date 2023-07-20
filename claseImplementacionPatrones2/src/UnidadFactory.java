public class UnidadFactory {
    public static final String CODIGO_MANTENIMIENTO = "MANTENIMIENTO";
    public static final String CODIGO_LIMPIEZA = "LIMPIEZA";
    public static final String CODIGO_SERVICIOS_GENERALES = "SERVICIOS GENERALES";
    private static UnidadFactory instance;

    private UnidadFactory() {

    }

    public static UnidadFactory getInstance() {
        if (instance == null) {
            instance = new UnidadFactory();
        }
        return instance;
    }

    public Unidad crearUnidad(String codigo) throws UnidadFactoryException {
        switch (codigo) {
            case CODIGO_MANTENIMIENTO:
                return new UnidadSimple("Mantenimiento", "Unidad Simple", 120000.0, 4);
            case CODIGO_LIMPIEZA:
                return new UnidadSimple("Limpieza", "Unidad Simple", 100000.0, 24);
            case CODIGO_SERVICIOS_GENERALES:
                UnidadCombinada unidadCombinada = new UnidadCombinada("Servicios Generales", "Unidad Combinada", 2.0, 10.0);
                unidadCombinada.agregarUnidad(crearUnidad(CODIGO_MANTENIMIENTO));
                unidadCombinada.agregarUnidad(crearUnidad(CODIGO_LIMPIEZA));
                return unidadCombinada;
        }
        throw new UnidadFactoryException("El codigo " + codigo + " es invalido");
    }
}