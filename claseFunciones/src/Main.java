import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cadena1 = "Juan";
        String cadena2 = "Pedro";
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales");
        }
        else {
            System.out.println("Las cadenas son diferentes");
        }
        Integer valor1 = 20;
        Integer valor2 = 20;
        int comparar;
        if (valor1.equals(valor2)) {
            System.out.println("Los valores son iguales");
        }
        else {
            comparar = valor1.compareTo(valor2);
            if (comparar > 0) {
                System.out.println(valor1 + " es mayor que " + valor2);
            }
            else {
                System.out.println(valor2 + " es mayor que " + valor1);
            }
        }
        Scanner scanner;
        scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();
        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);
        System.out.println("La inicial de tu nombre es " + inicialNombre + " y la inicial de tu apellido es " + inicialApellido);
        System.out.println(esDivisible(10, 3));

        System.out.println("Ingrese un valor");
        Integer num1 = scanner.nextInt();
        System.out.println(esPrimo(num1));

        System.out.println("Ingrese un primer valor");
        Integer numero1 = scanner.nextInt();
        System.out.println("Ingrese un segundo valor");
        Integer numero2 = scanner.nextInt();
        System.out.println("Ingrese un tercer valor");
        Integer numero3 = scanner.nextInt();
        System.out.println(mayor(numero1, numero2, numero3));

        System.out.println(sonDistintas("hola", "chau"));
    }
    public static boolean esDivisible(int n, int divisor) {
        return n % divisor == 0;
    }
    public static boolean esPrimo(int number) {
        int contador = 0;
        boolean resultado = true;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                contador++;
            }
        }
        if (contador > 2 || number <= 1) {
            resultado = false;
        }
        return resultado;
    }
    public static Integer mayor(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        else if (number2 > number1 && number2 > number3) {
            return  number2;
        }
        else {
            return number3;
        }
    }
    public static boolean sonDistintas(String palabra1, String palabra2) {
        return !palabra1.equals(palabra2);
    }
}