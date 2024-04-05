package EstruRepet_While;
import java.util.Scanner;

public class SalarioHomemMulher {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String resposta;
            double salariohomem=0;
            double salariomulher=0;
            do {
                System.out.println("You are male or female:(M/F) ");
                String sexo = scanner.nextLine();
                System.out.println("What is your salary: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                if (sexo.equalsIgnoreCase("M")) {
                    salariohomem += salario;}
                else {
                    salariomulher += salario;}
                
                System.out.println("Do you wish to continue ?(Y/N)");    
                resposta = scanner.nextLine();    
            }
            while (!resposta.equalsIgnoreCase("N"));
            System.out.println("The sum of men's wages: " + salariohomem);
            System.out.println("The sum of women's salaries: " + salariomulher);
        }
    }
}
