package Sequências_Básicas;
import java.util.Scanner;
public class metrosRelativos {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the distance in meters: ");
            double metros = scanner.nextDouble();

            double km = metros/1000;
            double hm = metros/100;
            double dam = metros/10;
            double dm = metros*10;
            double cm = metros*100;
            double mm = metros*1000;

            System.out.println("The distance of " + metros + " Meters corresponds to:");
            System.out.println(km + "KM - Kilometer (Quilômetros)");
            System.out.println(hm + "HM - Hectometer (Hectômetros)");
            System.out.println(dam + "DAM - Decameter (Decâmetro)");
            System.out.println(dm + "DM - Decimeter (Decimetro)");
            System.out.println(cm + "CMM - Centimeter (Centímetro)");
            System.out.println(mm + "MM - Milimeter (Milimetro)");
        }
    }
    
}
