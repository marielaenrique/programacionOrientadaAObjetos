public class Objeto {
    private Integer posx;
    private Integer posy;
    private char direccion;

    public Objeto(Integer posx, Integer posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public char getDireccion() {
        return direccion;
    }

    public Integer getPosx() {
        return posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public void irA(Integer posx, Integer posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }
}