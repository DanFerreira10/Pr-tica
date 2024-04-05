package EstruRepet_While;
import java.util.Scanner;

public class PareNo111 {
    public static void main(String[] args) {
        try (Scanner scanner = new java.util.Scanner(System.in)) {
            int soma = 0;
            int numero;
            do {
                System.out.println("Digite um número: ");
                numero = scanner.nextInt();
                if (numero != 111) {
                soma += numero;
            }
            } while (numero != 111);
            System.out.println("A soma dos números digitados é: " + soma);
        }
    }
}
