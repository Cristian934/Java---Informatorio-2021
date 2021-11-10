import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite dos numeros: ");
        
        int num1, num2, multiplicacion;
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        multiplicacion = num1 * num2;
        entrada.close();
        System.out.println(multiplicacion);
    }
    
}
