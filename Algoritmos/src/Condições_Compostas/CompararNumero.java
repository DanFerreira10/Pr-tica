package Condições_Compostas;
import java.util.Scanner;

public class CompararNumero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the 1st number: ");
            int n1 = scanner.nextInt();
            System.out.println("Enter the 2st number: ");
            int n2 = scanner.nextInt();

            if (n1>n2)
            System.out.println("The first number is bigger");
            else if (n2>n1)
            System.out.println("The second number is bigger");
            else 
            System.out.println("There is no greater value, both are equals");
        }
    }
    
}
