package EstruturaRepetição_for;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();

		System.out.println("O terceiro nome da lista é: " + nomes[2]);
		System.out.println("O sétimo nome da lista é: " + nomes[6]);
		System.out.println("O nono nome da lista é: " + nomes[8]);
		}
	}
}