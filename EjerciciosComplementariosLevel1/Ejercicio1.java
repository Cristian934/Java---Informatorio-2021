import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        String cadena;

        System.out.println("Ingrese su nombre: ");
        cadena = entrada.nextLine();

        System.out.println("Hola " + cadena);
    }
}