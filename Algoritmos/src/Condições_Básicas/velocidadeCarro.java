package Condições_Básicas;
import java.util.Scanner;

public class velocidadeCarro {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Recorded speed: ");
           int velocidade = scanner.nextInt();

            //if (velocidade > 70)
                //System.out.println("You were fined");
            //else 
           // System.out.println("Anything");
            
             String resultado = velocidade >70 ? "You were fined" : "Anything";
            System.out.println(resultado);
        }
    }
    
}
