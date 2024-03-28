package Sequências_Básicas;
import java.util.Scanner;

public class NomeSalario {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Employee name? ");
            String name = scanner.nextLine();
            
            System.out.println("Wage(U$): ");
            float wage = scanner.nextFloat();

            System.out.println("The employee " + name + " has a wage at U$" + wage + " in june");
        }
    }
    
}

