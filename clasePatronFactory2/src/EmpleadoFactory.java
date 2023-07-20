public class EmpleadoFactory {

    public static final String CLAVE_RELACION_DEPENDENCIA = "EMP-RD";
    public static final String CLAVE_CONTRATADO = "EMP-PH";
    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException {
        switch (codigo) {
            case CLAVE_RELACION_DEPENDENCIA:
                return new EmpleadoRelacionDependencia("Juan", "Luis", 1234, 1000.0);
            case CLAVE_CONTRATADO:
                return new EmpleadoContratado("Juan", "Manuel", 5678, 7.0, 0.14);
        }
        throw new EmpleadoFactoryException("El codigo " + codigo + " no es valido");
    }
}