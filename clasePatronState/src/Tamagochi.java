public class Tamagochi {
    private String nombre;
    private TamagochiState estadoActual;

    public Tamagochi(String nombre) {
        this.nombre = nombre;
        this.estadoActual = new Feliz();
    }

    public void darDeComer() {
        estadoActual = estadoActual.comer();
    }

    public void darDeBeber() {
        estadoActual = estadoActual.beber();
    }

    public void darMimos() {
        estadoActual = estadoActual.recibirMimos();
    }

    public void mostrarEstado() {
        System.out.println(estadoActual);
    }
}