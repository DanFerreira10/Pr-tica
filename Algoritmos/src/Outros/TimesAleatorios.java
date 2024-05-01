package Outros;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimesAleatorios {
    public static void main(String[] args) {
        // Lista de nomes
        List<String> nomes = Arrays.asList("Danilo", "Andrinny", "Lucas", "Edson", "Sthepyson", "Jailson", "Matheus", "Savio");

        // Embaralhar a lista
        Collections.shuffle(nomes);

        // Dividir a lista em dois times
        List <String> time1 = nomes.subList(0, nomes.size()/2);
        List <String> time2 = nomes.subList(nomes.size()/2, nomes.size());

        // Imprimir os times
        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
    }
}