package EstruturaRepetição_for;
import java.util.Scanner;

public class ContagemAteValor {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int contador;

            System.err.print("Enter a positive integer: ");
            int numero = scanner.nextInt();
            System.out.print("Contagem: ");

            for (contador = 1; contador<=numero; contador++){
                System.out.print(contador + " ");
            }
            System.out.print("Acabou!");
        }
    }
}