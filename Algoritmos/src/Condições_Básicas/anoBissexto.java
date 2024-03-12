package Condições_Básicas;
import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a year: ");
            int ano = scanner.nextInt();

            if ((ano%4==0 && ano%100!=0) || (ano % 400 == 0))
                System.out.println("It's a leap year");
            else
                System.out.println("It's not a leap year");    
        }
    }
    
}