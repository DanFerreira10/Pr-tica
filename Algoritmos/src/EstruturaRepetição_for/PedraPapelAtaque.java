package EstruturaRepetição_for;
import java.util.Scanner;

public class PedraPapelAtaque {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            scanner.nextLine();
            String jogador1, jogador2;

            for (int i =1; i<=N; i++) {

                jogador1 = scanner.nextLine();

                jogador2 = scanner.nextLine();

                if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
                else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
                else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
                else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
                else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
                else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
                else System.out.println("Sem ganhador");
            }

        }
    }
}
