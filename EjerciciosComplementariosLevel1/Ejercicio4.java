import javax.swing.JOptionPane;

public class Ejercicio4 {
    
    public static void main(String[] args){
        int numero;
        long factorial=1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        for (int i=1;i<=numero;i++) {
            factorial *= i;

            System.out.println("el factorial de "+numero+" es: "+factorial);
        }
}
}
