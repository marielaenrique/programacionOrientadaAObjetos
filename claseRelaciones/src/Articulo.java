public class Articulo {
    private String titulo;
    private String tema;
    private String autor;
    private String fecha;

    public Articulo(String titulo, String tema, String autor, String fecha) {
        this.titulo = titulo;
        this.tema = tema;
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void decirTema() {
        System.out.println("El tema de este articulo es " + tema);
    }
}