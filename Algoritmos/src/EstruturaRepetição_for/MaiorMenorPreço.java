package EstruturaRepetição_for;
import java.util.Random;

public class MaiorMenorPreço {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int maior = 0;
        int menor = Integer.MAX_VALUE;
    
        for (int contador = 1; contador <=8; contador++) {
            int precos = rand.nextInt(100);
            System.out.print(precos + " ");

            if (precos >maior) {
                maior = precos;
            }

            if (precos<menor) {
                menor = precos;
                
            }
        }
        System.out.println("");
        System.out.println("The largest number is " + maior + " and the smallest number is " + menor);

    }
}
