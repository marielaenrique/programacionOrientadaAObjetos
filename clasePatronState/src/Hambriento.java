public class Hambriento implements TamagochiState {
    @Override
    public TamagochiState comer() {
        return new Feliz();
    }

    @Override
    public TamagochiState beber() {
        return new Triste();
    }

    @Override
    public TamagochiState recibirMimos() {
        return this;
    }

    @Override
    public String toString() {
        return "Mi estado actual es hambriento";
    }
}