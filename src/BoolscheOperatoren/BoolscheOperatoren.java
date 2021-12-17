package BoolscheOperatoren;

import java.util.Scanner;

public class BoolscheOperatoren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean a = false;
        Boolean b = false;

        System.out.print("Geben Sie einen Wert für a ein: ");
        a = scanner.nextInt() != 0;

        System.out.print("Geben Sie einen Wert für b ein: ");
        b = scanner.nextInt() != 0;

        System.out.println("\nErgebnisse der boolschen Funktionen:\n");

        System.out.println("Ergebnis UND: " + (a && b));
        System.out.println("Ergebnis ODER: " + (a || b));
        System.out.println("Ergebnis NICHT a: " + !a);
        System.out.println("Ergebnis NICHT-UND: " + !(a && b));
        System.out.println("Ergebnis NICHT-ODER: " + !(a || b));
        System.out.println("Ergebnis EXKLUSIV-ODER: " + (a ^ b));
        System.out.println("Ergebnis EXKLUSIV-ODER ohne OP: " + (a != b));
    }
}
