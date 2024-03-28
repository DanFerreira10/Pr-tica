package EstruturaRepetição_for;
import java.util.Scanner;

public class CriandoContagem {
    public static void main(String[] args) {
        int contador;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first value: ");
            int inicio = scanner.nextInt();
            System.out.print("Enter the final value: ");
            int ultimo = scanner.nextInt();
            System.out.print("Enter the increment: ");
            int intervalo = scanner.nextInt();

           if (ultimo>inicio) {
                for (contador = inicio; contador <= ultimo ; contador += intervalo){
                System.out.print(contador + " ");
                }
            } else {
                for (contador = inicio; contador >= ultimo ; contador -= intervalo){
                    System.out.print(contador + " ");
                }
            }
            System.out.print("Acabou!");
        }   
    }
    
}
