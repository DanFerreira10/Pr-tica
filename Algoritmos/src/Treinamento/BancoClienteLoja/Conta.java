package Treinamento.BancoClienteLoja;

public abstract class Conta implements Iconta {
    
    private double saldo;
    private Cliente cliente;
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        
    }

    public void mostrarsaldo() {
        System.err.println(getSaldo());
    }

    
}
