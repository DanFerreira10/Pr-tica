package EstruturaRepetição_for;

public class ForEmArray {
    public static void main(String[] args) {
        
        //Em arrays o indice inicia em zero
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }    
}
