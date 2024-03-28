package EstruturaRepetição_for;

public class ContagemNegativa {
    public static void main(String[] args) {
        for (int contagem = 12; contagem >=3; contagem-=2) {
            System.out.print(contagem + " ");
        }
        System.out.print("Acabou!");
    }
}