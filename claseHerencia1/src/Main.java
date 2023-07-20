public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("1","Juan", 200.0, "Escalada");
        System.out.println(socio1);
        System.out.println(socio1.calcularCostoMensual());

        SocioHabilitado socio2 = new SocioHabilitado("2", "Mari", 200.0, "SUP",
                100.0);
        System.out.println(socio2);
        System.out.println(socio2.calcularCostoMensual());
        socio2.usoPileta();

        Socio socio3 = new SocioHabilitado("3", "Pedro", 200.0, "Pileta",
                100.0);
        System.out.println(socio3);
        System.out.println(socio3.calcularCostoMensual());
        ((SocioHabilitado)socio3).usoPileta();
    }
}