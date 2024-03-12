package Sequências_Básicas;
import java.util.Scanner;
public class apresentar {
    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("What's your name? ");
            String nome = scanner.nextLine();
            
            System.out.println("Hi " + nome + " nice to meet you!");
        }
    }
}
