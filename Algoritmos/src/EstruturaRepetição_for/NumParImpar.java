package EstruturaRepetição_for;
import java.util.Scanner;

public class NumParImpar {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int contador;
            int numPar = 0;
            int numImpar = 0;

            for (contador = 1;contador <= 6;contador++){
                System.out.println("Enter a number:");
                int numero = scanner.nextInt();

                if(numero%2==0) {
                   numPar += 1 ;
                } else{
                numImpar +=1;}
            }
            System.out.println("Even Numbers: " + numPar);
            System.out.println("Odd Numbers: " + numImpar);
        }

    }    
}
