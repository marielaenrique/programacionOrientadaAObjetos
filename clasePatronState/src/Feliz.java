public class Feliz implements TamagochiState {
    @Override
    public TamagochiState comer() {
        return new Sediento();
    }

    @Override
    public TamagochiState beber() {
        return new Hambriento();
    }

    @Override
    public TamagochiState recibirMimos() {
        return this;
    }

    @Override
    public String toString() {
        return "Mi estado actual es feliz";
    }
}