public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Hola");
        EmpleadoFactory.getInstance();

        empresa.agregarEmpleados(EmpleadoFactory.CLAVE_RELACION_DEPENDENCIA);
        empresa.agregarEmpleados("hola");
        empresa.agregarEmpleados("chau");
        empresa.agregarEmpleados(EmpleadoFactory.CLAVE_CONTRATADO);

        System.out.println(empresa.calcularSueldosTotal(10));
    }
}