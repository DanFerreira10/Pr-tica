package Estruturas_excepcionais;

public class VerificarCpf {
    
    public static void main(String[] args) {
        try{
            String cpfVerificado = formatarcpf("00012345688");
            System.out.println(cpfVerificado);
        }
        catch (CpfTeste e){
            System.out.println("CPF inválido");
        }
    }

    static String formatarcpf(String cpf) throws CpfTeste {
        if (cpf.length() != 11)
            throw new CpfTeste();
        return cpf;    
    }

}
