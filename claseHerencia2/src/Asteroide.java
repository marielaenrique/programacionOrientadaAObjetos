public class Asteroide extends Objeto{
    private Integer lesion;

    public Asteroide(Integer posx, Integer posy, char direccion, Integer lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public String toString() {
        return "Cantidad de lesiones: " + lesion;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if (!(obj instanceof Asteroide)) {
            return false;
        }
        else {
            Asteroide asteroide = (Asteroide)obj;
            if (this.lesion.equals(asteroide.lesion)) {
                return true;
            }
        }
        return false;
    }
}