package EstruturaRepetição_for;

public class ForEach {
    public static void main(String[] args) {

        // Em arrays o indice inicia em zero
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // :(Dois pontos) = a cada interação de alunos,o aluno atual do indice atual vai
        // atualizar automaticamente essa variavel.
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
