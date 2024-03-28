package Condições_Compostas;
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the line segments");

            System.out.println("A:");
            int a = scanner.nextInt();
            System.out.println("B:");
            int b = scanner.nextInt();
            System.out.println("C:");
            int c = scanner.nextInt();

            if (a<b+c & b<c+a & c<a+b) {
                if(a==b & b==c & c==a) {
                    System.out.println("It's a triangle equilateral");
                } else if (a!=b & b!=c & c!=a) {
                    System.out.println("It's a triangle scalene");
                }else {
                    System.out.println("It's a triangle isosceles");
                }
            }else
            System.out.println("It's not a triangle");
        }
    }
    
}
