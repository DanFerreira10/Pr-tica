package Treinamento.teste;

public class Main {
    
    public static void main(String[] args) {
        double dinheiro = 100;

        Cliente danilo = new Cliente();
        danilo.setNome("Danilo");
        Conta cc = new Conta(danilo);

        Loja dgeek = new Loja();
        dgeek.setRazao("D-Geek");
        Conta cl = new Conta(dgeek);

        cc.depositar(dinheiro);
        cc.transferir(40, cl);

       System.out.println(cc.getCliente().getNome());
       System.out.println(cc.getSaldo());

       System.out.println(" ");

       System.out.println(cl.getLoja().getRazao());
       System.out.println(cl.getSaldo());
        

       
    }

}
