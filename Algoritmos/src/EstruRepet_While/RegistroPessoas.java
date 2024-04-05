package EstruRepet_While;
import java.util.Scanner;

public class RegistroPessoas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double somaaltura=0;
            double altmedia=0;
            int maisnoventa = 0;
            int magao =0;
            int grandao=0;
            int contador = 1;

            while (contador <= 4) {
                System.out.println(contador + "º Pessoa");

                System.out.print("How tall are you: ");
                double altura = scanner.nextDouble();
                somaaltura = somaaltura + altura;

                System.out.println("What is your height: ");
                double peso = scanner.nextDouble();

                if (altura > 1.90 & peso > 100) {
                    grandao = grandao +1;
                    maisnoventa++;}
                else if (peso <50 & altura <1.60) {
                    magao++;}
                else if (peso > 90) {
                    maisnoventa++;}
                    contador++;
            }
            altmedia = somaaltura/4;
            System.out.println("group height average: " + altmedia);
            System.out.println("They weigh more than 90 kilos: " + maisnoventa);
            System.out.println("weigh less than 50 kg and are less than 1.60 m tall: " + magao);
            System.out.println("They weigh more than 100kg and measure more than 1.90m: " + grandao);
        }
    }
    
}
