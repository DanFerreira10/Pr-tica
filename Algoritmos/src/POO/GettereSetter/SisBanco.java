package POO.GettereSetter;
import java.util.Scanner;

public class SisBanco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int escolha;
            double dinheiro;
            String continuar;

            ConfigSisBanco valor = new ConfigSisBanco();
            valor.getSaldo();
            

            do {
            System.out.println("--- TERMINAL BANCO ---");
            System.out.println("O que você deseja fazer:");
            System.out.println("[1] Consultar Saldo");
            System.out.println("[2] Depositar Dinheiro");
            System.out.println("[3] Sacar Dinheiro");
            escolha = scanner.nextInt();

            if(escolha == 1) {
                System.out.println(valor.getSaldo());
            }
            else if (escolha == 2) {
                System.out.println("Qual valor você deseja depositar ?");
                dinheiro = scanner.nextDouble();
                valor.depositar(dinheiro);
            }else {
                System.out.println("Qual valor você deseja sacar ?");
                dinheiro = scanner.nextDouble();
                valor.sacar(dinheiro);
            }

            scanner.nextLine();
            System.out.println("Deseja continuar ? (Y/N)");
            continuar = scanner.nextLine();
            
            
            } while (!continuar.equalsIgnoreCase("N"));
        }    
    }
}
