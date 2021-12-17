package Eingaben;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl1 = 0;
        int zahl2 = 0;
        int ergebnis = 0;

        System.out.print("Geben Sie die erste Zahl ein: ");
        zahl1 = scanner.nextInt();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        zahl2 = scanner.nextInt();

        ergebnis = zahl1 + zahl2;
        System.out.println("Summe: " + ergebnis);
    }
}
