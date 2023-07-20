public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "Manuel");
        Seguidor seguidor1 = new Seguidor("Pablo", "Mario");
        Seguidor seguidor2 = new Seguidor("Pedro", "Mario");
        usuario.agregarSeguidor(seguidor1);
        usuario.agregarSeguidor(seguidor2);
        usuario.subirFoto();
        usuario.eliminarFoto();
        usuario.eliminarSeguidor(seguidor2);
        usuario.subirFoto();
    }
}