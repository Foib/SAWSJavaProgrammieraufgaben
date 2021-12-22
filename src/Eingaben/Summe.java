package Eingaben;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        //Scanner Objekt wird erstellt
        Scanner scanner = new Scanner(System.in);

        //Integer Variablen werden Deklariert und mit 0 initialisiert
        int zahl1 = 0;
        int zahl2 = 0;
        int ergebnis = 0;

        //Es wird nach der ersten Zahl gefragt und "zahl1" zum input vom Scanner gesetzt
        System.out.print("Geben Sie die erste Zahl ein: ");
        zahl1 = scanner.nextInt();

        //Das gleiche passiert mit der zweiten Zahl
        System.out.print("Geben Sie die zweite Zahl ein: ");
        zahl2 = scanner.nextInt();

        //Die Summe wird berechnet, in "ergebnis" gespeichert und dann in der Konsole ausgegeben
        ergebnis = zahl1 + zahl2;
        System.out.println("Summe: " + ergebnis);
    }
}
