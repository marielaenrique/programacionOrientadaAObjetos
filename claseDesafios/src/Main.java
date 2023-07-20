import com.sun.tools.jconsole.JConsoleContext;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la cantidad de comida que come");
        Double cantidad = scanner.nextDouble();
        Integer paquetes = cuantosPaquetes(cantidad);
        if (paquetes == 1) {
            System.out.println(nombre + " necesita " + paquetes + " paquete");
        }
        else {
            System.out.println(nombre + " necesita " + paquetes + " paquetes");
        }

        System.out.println("Ingrese el nombre del primer jugador");
        String jugador1 = scanner.next();

        System.out.println("Ingrese el nombre del segundo jugador");
        String jugador2 = scanner.next();

        System.out.println(ganador());

        System.out.println("Ingrese un valor");
        Integer number = scanner.nextInt();

        Boolean band;
        Boolean a;
        Integer j = 0;
        Integer s = 2;
        Integer m;

        for (int i = 1; i <= number; i++) {
            a = false;
            while (!a) {
                m = 2;
                band = true;
                while (band && (m < s)) {
                    if (s % m == 0) {
                        band = false;
                    }
                    else {
                        m = m + 1;
                    }
                }
                if (band) {
                    j = j + 1;
                    System.out.println("El primo " + j + " es " + s);
                    a = true;
                }
                s = s + 1;
            }
        }

        System.out.println("Ingrese la cantidad de horas trabajadas");
        Integer horas = scanner.nextInt();

        System.out.println("El sueldo es de " + sueldo(horas));
    }
    public static Integer cuantosPaquetes(Double comidaRequerida) {
        Double contador = 0.0;
        Integer paquetes = 0;
        Scanner scanner = new Scanner(System.in);
        while (contador < comidaRequerida) {
            System.out.println("Ingrese el peso del paquete");
            Double peso = scanner.nextDouble();
            contador = contador + peso;
            paquetes++;
        }
        return paquetes;
    }
    public static Integer cualGana(String juego1, String juego2) {
        Integer contador = 0;
        if ((juego1.equals("piedra") && juego2.equals("tijera")) || (juego1.equals("tijera") && juego2.equals("papel"))
                || (juego1.equals("papel") && juego2.equals("piedra")) || (juego1.equals("spock") && juego2.equals("tijera"))
                || (juego1.equals("spock") && juego2.equals("piedra")) || (juego1.equals("papel") && juego2.equals("spock"))) {
            contador = 1;
        }
        else if ((juego2.equals("piedra") && juego1.equals("tijera")) || (juego2.equals("tijera") && juego1.equals("papel"))
                || (juego2.equals("papel") && juego1.equals("piedra")) || (juego2.equals("spock") && juego1.equals("tijera"))
                || (juego2.equals("spock") && juego1.equals("piedra")) || (juego2.equals("papel") && juego1.equals("spock"))) {
            contador = 2;
        }
        else {
            contador = 0;
        }
        return contador;
    }
    public static Integer ganador() {
        Scanner scanner = new Scanner(System.in);
        Integer contador = 0;
        Integer respuesta = 0;
        String jugada1;
        String jugada2;
        Integer puntos1 = 0;
        Integer puntos2 = 0;

        while (contador < 5) {
            System.out.println("Ingrese la primer jugada");
            jugada1 = scanner.next();
            if (jugada1.equals("*")) {
                contador = 5;
                System.out.println("Gracias por participar");
            }
            else {
                System.out.println("Ingrese la segunda jugada");
                jugada2 = scanner.next();
                respuesta = cualGana(jugada1, jugada2);

                if (respuesta == 1) {
                    puntos1 += 1;
                }
                else if (respuesta == 2) {
                    puntos2 += 1;
                }
            }
            if (puntos1 > puntos2) {
                respuesta = 1;
            }
            else if (puntos2 > puntos1) {
                respuesta = 2;
            }
            else if (puntos1.equals(puntos2)) {
                respuesta = 0;
            }
        }
        return respuesta;
    }
    public static Double sueldo(Integer horas) {
        Double respuesta;
        if (horas <= 40) {
            respuesta = horas * 875.0;
        }
        else {
            respuesta = (40 * 875) + ((horas - 40) * ((875 * 0.5) + 875));
        }
        return respuesta;
    }
}