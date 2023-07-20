public class HabilidadFactory {
    public static final String CODIGO_SALTAR = "Saltar";
    public static final String CODIGO_DISPARAR = "Disparar";
    public static final String CODIGO_DISPARO_AL_SALTAR = "Disparo-al-saltar";
    private static HabilidadFactory instance;

    private HabilidadFactory() {

    }

    public static HabilidadFactory getInstance() {
        if (instance == null) {
            instance = new HabilidadFactory();
        }
        return instance;
    }

    public Habilidad crearHabilidad(String codigo) throws HabilidadFactoryException {
        switch (codigo) {
            case CODIGO_SALTAR:
                return new HabilidadSimple("Saltar", "Habilidad simple", 7.5);
            case CODIGO_DISPARAR:
                return new HabilidadSimple("Disparar", "Habilidad simple", 10.0);
            case CODIGO_DISPARO_AL_SALTAR:
                HabilidadCombinada habilidadCombinada = new HabilidadCombinada("Disparo al saltar", "Habilidad Combinada", 3);
                habilidadCombinada.agregarHabilidad(crearHabilidad(CODIGO_SALTAR));
                habilidadCombinada.agregarHabilidad(crearHabilidad(CODIGO_DISPARAR));
                return habilidadCombinada;
        }
        throw new HabilidadFactoryException("El codigo " + codigo + " no es valido");
    }
}