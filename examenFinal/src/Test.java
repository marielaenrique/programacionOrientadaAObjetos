public class Test {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        personaje.agregarHabilidad(HabilidadFactory.CODIGO_SALTAR);
        personaje.agregarHabilidad(HabilidadFactory.CODIGO_DISPARAR);
        personaje.agregarHabilidad(HabilidadFactory.CODIGO_DISPARO_AL_SALTAR);
        personaje.mostrarHabilidad();
    }
}