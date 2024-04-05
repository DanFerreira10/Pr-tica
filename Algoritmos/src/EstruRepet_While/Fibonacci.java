package EstruRepet_While;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        int contador = 1;

        while (contador <=10) {
            System.out.print(n1 +" ");

            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            contador++;
        }
    }
    
}
