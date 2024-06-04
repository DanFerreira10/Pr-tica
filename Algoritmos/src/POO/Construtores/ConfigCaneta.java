package POO.Construtores;

public class ConfigCaneta {
    
    private String cor;
    private String modelo;
    private boolean tampa;
    private float ponta;

    public ConfigCaneta (String cor, String modelo, float ponta) {
        this.cor = cor;
        this.modelo = modelo;
        this.tampada();
        this.ponta = ponta;
    }

    public void tampada() {
        this.tampa = true;
    }
    public void destampada() {
        this.tampa = false;
    }

    public void cstatus() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tampa: " + this.tampa);
        System.out.println("Ponta: " + this.ponta);
    }
}
