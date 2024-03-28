package EstruturaRepetição_for;

public class DivisiveisQuatro {
    public static void main(String[] args) {
        for (int contagem = 30; contagem >=1; contagem--) {
            if (contagem % 4 == 0) {
                System.out.print("[" + contagem + "] ");
            } else
            System.out.print(contagem + " ");
        }
        System.out.print("Acabou!");
    }
}
    

