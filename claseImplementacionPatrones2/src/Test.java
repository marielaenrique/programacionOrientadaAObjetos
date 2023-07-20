public class Test {
    public static void main(String[] args) {
        UnidadDeTrabajo unidadDeTrabajo = new UnidadDeTrabajo();
        unidadDeTrabajo.agregarUnidad(UnidadFactory.CODIGO_MANTENIMIENTO);
        unidadDeTrabajo.agregarUnidad(UnidadFactory.CODIGO_LIMPIEZA);
        unidadDeTrabajo.agregarUnidad("HOLA");
        unidadDeTrabajo.agregarUnidad(UnidadFactory.CODIGO_SERVICIOS_GENERALES);
        unidadDeTrabajo.mostrarComponentes();
    }
}