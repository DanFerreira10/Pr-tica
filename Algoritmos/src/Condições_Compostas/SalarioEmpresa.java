package Condições_Compostas;
import java.util.Scanner;

public class SalarioEmpresa {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the value: ");
            double salario = scanner.nextDouble();
            System.out.println("How many years have you been with the company: ");
            double ano = scanner.nextDouble();

            if (ano < 3) {
                salario += salario*3/100;
                System.out.println("increase of 3%: " + salario);
            }else if (ano >= 3 && ano<10) {
                salario += salario*12.5/100;
                System.out.println("increase of 12.5%: " + salario);
            }else
                salario += salario *20/100;
                System.out.println("Increase of 20%: " + salario); 
            

        }

        }
    }
    

