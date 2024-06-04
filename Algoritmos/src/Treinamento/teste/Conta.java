package Treinamento.teste;

public class Conta {
    
    private double saldo;
    private Cliente cliente;
    private Loja loja;

    public void saldo() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo>=0) {
            this.saldo = saldo;
        }
        else
            System.out.println("Saldo negativo");
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar (double valor) {
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public Conta (Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public Conta (Loja loja) {
        this.loja = loja;
    }

    public Loja getLoja() {
        return loja;
    }
    

}
