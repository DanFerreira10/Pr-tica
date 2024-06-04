package POO.Enums;

public class Estados {
    public static void main(String[] args) {
        for (ConfigEstados e : ConfigEstados.values()) {
            System.out.println(e.getIbge() + "-" + e.getSigla() + " - " + e.getNomeMaiusculo());
        }

        ConfigEstados eb = ConfigEstados.CEARA;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
