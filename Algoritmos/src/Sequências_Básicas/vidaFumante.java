package Sequências_Básicas;
import java.util.Scanner;

public class vidaFumante {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("How many cigarettes do you smoke a day?");
            int cigarroDia = scanner.nextInt();
            System.out.println("How many years have you been smoking?");
            int cigarroAnos = scanner.nextInt();

            int vidaDia = cigarroDia*10;
            int vidaAno = cigarroAnos*365;
            int vidaPerdida = (vidaDia*vidaAno)/1440;

            System.out.println("You lost " + vidaPerdida + " days of your life");
        }
    }
}
