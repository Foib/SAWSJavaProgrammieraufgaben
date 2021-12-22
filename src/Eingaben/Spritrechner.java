package Eingaben;

import java.util.Scanner;

public class Spritrechner {
    public static void main(String[] args) {
        //Scanner Objekt wird erstellt
        Scanner scanner = new Scanner(System.in);

        //Floating-Point Variablen werden Deklariert und mit 0.0f initialisiert
        float kilometer = 0.0f;
        float kraftstoff = 0.0f;
        float durchschnitt = 0.0f;

        //Es wird nach den gefahrenen Kilometern gefragt und "kilometer" zum input vom Scanner gesetzt
        System.out.print("Geben Sie die gefahrenen Kilometer ein: ");
        kilometer = scanner.nextFloat();

        //Jetzt passiert das gleiche mit dem verbrauchten Kraftstoff
        System.out.print("Geben Sie die Menge des verbrauchten Kraftstoffs ein (Liter): ");
        kraftstoff = scanner.nextFloat();

        //Der Durchschnittliche verbrauch auf 100 Kilometern wird berechnet und ausgegeben
        durchschnitt = (kraftstoff / kilometer) * 100;
        System.out.println("Der Durchschnittsverbrauch auf 100 km ist " + durchschnitt + " Liter");
    }
}
