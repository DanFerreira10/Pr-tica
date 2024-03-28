package Sequências_Básicas;
import java.util.Scanner;

public class TintaParede {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Enter the height(M): ");
            double altura = scanner.nextDouble();
            System.out.println("Enter the width(M): ");
            double largura = scanner.nextDouble();
            
            double metro2 = (altura * largura);
            double litroTinta = metro2/2;

            System.out.println("To paint the area of " + metro2 + "M², will need " + litroTinta + " liters of paint");

        }
    }
    
}
