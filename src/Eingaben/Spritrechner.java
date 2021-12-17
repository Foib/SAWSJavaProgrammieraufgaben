package Eingaben;

import java.util.Scanner;

public class Spritrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float kilometer = 0.0f;
        float kraftstoff = 0.0f;
        float durchschnitt = 0.0f;

        System.out.print("Geben Sie die gefahrenen Kilometer ein: ");
        kilometer = scanner.nextFloat();

        System.out.print("Geben Sie die Menge des verbrauchten Kraftstoffs ein (Liter): ");
        kraftstoff = scanner.nextFloat();

        durchschnitt = (kraftstoff / kilometer) * 100;
        System.out.println("Der Durchschnittsverbrauch auf 100 km ist " + durchschnitt + " Liter");
    }
}
