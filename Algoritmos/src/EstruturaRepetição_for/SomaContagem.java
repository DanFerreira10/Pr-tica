package EstruturaRepetição_for;

public class SomaContagem {
    public static void main(String[] args) {
        int contador;
        int soma = 0;

        for(contador=6;contador<=100; contador +=2){
            System.out.print(contador + " ");
            soma += contador;
        }
        System.out.println("");
        System.out.println("The sum of the values is: " + soma);
             
        }
}
