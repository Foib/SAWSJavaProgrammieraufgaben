package Eingaben;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float zahl1 = 0.0f;
        float zahl2 = 0.0f;
        float ergebnis = 0.0f;

        System.out.print("Geben Sie die erste Zahl ein: ");
        zahl1 = scanner.nextFloat();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        zahl2 = scanner.nextFloat();

        ergebnis = zahl1 / zahl2;
        System.out.println("Quotient: " + ergebnis);
    }
}
