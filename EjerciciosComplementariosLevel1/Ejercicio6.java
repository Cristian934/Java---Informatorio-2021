import java.util.Scanner;
public class Ejercicio6 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("\n Ingrese numero de Base: ");
        int base=sc.nextInt();
        System.out.println("\n Ingrese numero de exponente: ");
        int exponente=sc.nextInt();

        System.out.println("el resultado es: "+ potencia(base, exponente));
    }

        public static int potencia(int base, int exponente){
            if (exponente == 0) {
                return 1;
            } else {
                return base * potencia(base, exponente - 1);
                
            }
            }
        }

    
