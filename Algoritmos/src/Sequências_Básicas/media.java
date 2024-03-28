package Sequências_Básicas;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a value: ");
            int n1 = scanner.nextInt();
            System.out.println("Enter another value: ");
            int n2 = scanner.nextInt();

            int media = (n1+n2)/2;

            System.out.println("The average between " + n1 + " and " + n2 + " is the same " + media);
        }
    }
    
}
