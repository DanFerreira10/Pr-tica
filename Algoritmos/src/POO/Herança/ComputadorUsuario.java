package POO.Herança;

public class ComputadorUsuario {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("MSN");
        System.out.println("");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("");
        System.out.println("FACEBOOK");
        System.out.println("");
        FacebookMessenger face = new FacebookMessenger();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println("");
        System.out.println("TELEGRAM");
        System.out.println("");
        Telegram tel = new Telegram();
        tel.enviarMensagem();
        tel.receberMensagem();
    }
}
