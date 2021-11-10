import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String [] args) {
        Scanner entrada = new Scanner (System.in);
        int num1, num2,suma,resta,multiplicacion,division,modulo;
        System.out.println("digite dos numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        suma = num1+num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;

        entrada.close();

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        System.out.println(modulo);
    }
}
