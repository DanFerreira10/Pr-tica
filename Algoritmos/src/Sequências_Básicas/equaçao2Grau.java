package Sequências_Básicas;

import java.util.Scanner;

public class equaçao2Grau {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Considering the equation of 2° degree: ax²+bx+c=0");
            System.out.println("Value of A: ");
            double a = scanner.nextDouble();
            System.out.println("Value of B: ");
            double b = scanner.nextDouble();
            System.out.println("Value of C: ");
            double c = scanner.nextDouble();

            double delta = (b*b) - (4*a)*c;
            double raiz2 = Math.sqrt(delta);
            double x1 = (-b + raiz2) / 2*a;
            double x2 = (-b - raiz2) / 2*a;

            System.out.println("The delta value is " + delta + ",the value of x1 is " + x1 + " and the value of x2 is "+ x2);

        }
    }

}
