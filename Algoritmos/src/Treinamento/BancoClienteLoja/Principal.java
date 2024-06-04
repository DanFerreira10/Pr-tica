package Treinamento.BancoClienteLoja;

public class Principal {
    
    public static void main(String[] args) {
        
        Identificacao cliente1 = new Cliente();
        cliente1.setNome("Danilo");
        Identificacao loja2 = new Loja();
        loja2.setNome("D-Geek");

        Conta cc = new Cliente();
        Conta cl = new Loja();

        cc.depositar(100);
        cc.transferir(50, cl);

        cc.mostrarsaldo();
        cl.mostrarsaldo();
        
    }
}
