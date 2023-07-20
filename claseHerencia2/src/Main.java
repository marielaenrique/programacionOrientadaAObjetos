public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave(2, 2, 'N', 2.0);
        Nave nave2 = new Nave(2, 2, 'N', 4.0);
        System.out.println(nave1.toString());
        System.out.println(nave1.hashCode());
        System.out.println(nave1.getVida());
        nave1.restarVida(1);
        System.out.println(nave1.getVida());
        System.out.println(nave1.equals(nave2));
        System.out.println(nave1.getPosx());
        System.out.println(nave1.getPosy());
        System.out.println(nave1.getDireccion());
        nave1.irA(3, 3, 'S');
        System.out.println(nave1.getPosx());
        System.out.println(nave1.getPosy());
        System.out.println(nave1.getDireccion());

        Asteroide asteroide1 = new Asteroide(4, 4, 'S', 3);
        Asteroide asteroide2 = new Asteroide(4, 4, 'S', 2);
        System.out.println(asteroide1.getPosx());
        System.out.println(asteroide1.getPosy());
        System.out.println(asteroide1.getDireccion());
        asteroide1.irA(5, 5, 'N');
        System.out.println(asteroide1.getPosx());
        System.out.println(asteroide1.getPosy());
        System.out.println(asteroide1.getDireccion());
        System.out.println(asteroide1.toString());
        System.out.println(asteroide1.hashCode());
        System.out.println(asteroide1.equals(asteroide2));
    }
}