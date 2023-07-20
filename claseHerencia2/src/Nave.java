public class Nave extends Objeto{
    private Double velocidad;
    private Integer vida;

    public Nave(Integer posx, Integer posy, char direccion, Double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 3;
    }

    public Integer getVida() {
        return vida;
    }

    public void girar(char direccion) {
        super.setDireccion(direccion);
    }

    public void restarVida(Integer vidaPerdida) {
        this.vida -= vidaPerdida;
    }

    @Override
    public void irA(Integer posx, Integer posy, char direccion) {
        if (super.getDireccion() != direccion) {
            girar(direccion);
        }
        super.irA(posx, posy, direccion);
    }

    @Override
    public String toString() {
        return "Vidas restantes: " + vida;
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
        else if (!(obj instanceof Nave)) {
            return false;
        }
        else {
            Nave nave = (Nave)obj;
            if (this.velocidad.equals(nave.velocidad)) {
                return true;
            }
        }
        return false;
    }
}