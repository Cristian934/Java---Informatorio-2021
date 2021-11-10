import java.util.Scanner;

public class Ejercicio8{
    public static void main (String[] args){
        String cadena;
        System.out.println("Ingrese su nombre y apellido: ");
        Scanner entrada = new Scanner (System.in);
        cadena = entrada.nextLine();
        System.out.println(cadena);

        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println(edad);

        System.out.println("Ingrese su Direccion: ");
        String direccion = entrada.nextLine();
        System.out.println(direccion);

        System.out.println("Ingrese su Ciudad: ");
        String ciudad= entrada.nextLine();
        System.out.println(ciudad);


    }
}
