public class Contenedor implements Comparable<Contenedor>{
    private Integer numero;
    private String procedencia;
    private Boolean tieneMaterialesPeligrosos;

    public Contenedor(Integer numero, String procedencia, Boolean tieneMaterialesPeligrosos) {
        this.numero = numero;
        this.procedencia = procedencia;
        this.tieneMaterialesPeligrosos = tieneMaterialesPeligrosos;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public Boolean getTieneMaterialesPeligrosos() {
        return tieneMaterialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.numero > contenedor.numero) {
            return 1;
        }
        else if (this.numero < contenedor.numero) {
            return -1;
        }
        return 0;
    }
}