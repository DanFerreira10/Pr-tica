package Condições_Básicas;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the line segments");

            System.out.println("A:");
            int a = scanner.nextInt();
            System.out.println("B:");
            int b = scanner.nextInt();
            System.out.println("C:");
            int c = scanner.nextInt();

            if (a<b+c & b<c+a & c<a+b)
            System.out.println("It's a triangle");
            else
            System.out.println("It's not a triangle");
        }
    }
    
}
