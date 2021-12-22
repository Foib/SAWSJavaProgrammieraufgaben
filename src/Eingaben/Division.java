package Eingaben;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        //Scanner Objekt wird erstellt
        Scanner scanner = new Scanner(System.in);

        //Floating-Point Variablen werden Deklariert und mit 0.0f initialisiert
        float zahl1 = 0.0f;
        float zahl2 = 0.0f;
        float ergebnis = 0.0f;

        //Es wird nach der ersten Zahl gefragt und "zahl1" zum input vom Scanner gesetzt
        System.out.print("Geben Sie die erste Zahl ein: ");
        zahl1 = scanner.nextFloat();

        //Das gleiche passiert mit der zweiten Zahl
        System.out.print("Geben Sie die zweite Zahl ein: ");
        zahl2 = scanner.nextFloat();

        //Das Ergebnis der Division wird berechnet, in "ergebnis" gespeichert und dann in der Konsole ausgegeben
        ergebnis = zahl1 / zahl2;
        System.out.println("Quotient: " + ergebnis);
    }
}
