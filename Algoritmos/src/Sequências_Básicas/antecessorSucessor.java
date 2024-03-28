package Sequências_Básicas;
import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a value: ");
            int numero = scanner.nextInt();

            int sucessor = numero +1;
            int antecessor = numero -1;

            System.out.println("The sucessor of " + numero + " is " + sucessor);
            System.out.println("The predecessor of " + numero + " is " + antecessor);
        }
    }
}
