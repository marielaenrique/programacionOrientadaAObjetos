import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<>();
    }

    public void agregarEmpleados(String codigo) {
        try {
            empleadoList.add(EmpleadoFactory.getInstance().crearEmpleado(codigo));
        }
        catch (EmpleadoFactoryException e) {
            e.printStackTrace();
        }
    }

    public Double calcularSueldosTotal(Integer dias) {
        Double sueldoTotal = 0.0;
        for (Empleado empleado : empleadoList) {
            sueldoTotal += empleado.calcularSueldo(dias);
        }
        return sueldoTotal;
    }
}