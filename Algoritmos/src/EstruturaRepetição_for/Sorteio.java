package EstruturaRepetição_for;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador;
        int acimaCinco =0;
        int divTres =0;

        for(contador=1;contador<=20;contador++) {
            int numeroAleat = rand.nextInt(10);
            System.out.print(numeroAleat + " ");

            if(numeroAleat>5 && numeroAleat%3==0){
                acimaCinco += 1;
                divTres += 1; 
            } else if(numeroAleat%3==0) {
                divTres += 1; 
            }else if (numeroAleat>5) {
                acimaCinco +=1;
            }
        }
        System.out.println("");
        System.out.println("Numbers above five: " + acimaCinco);
        System.out.println("Numbers divisible by three: " + divTres);
        
    }
    
}
