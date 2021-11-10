import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int i=1, contador;

        System.out.print("Digite un numero: ");
        contador = entrada.nextInt();

        while(i<=contador) {
            System.out.println(i);
            i++;
        }

    }
}
