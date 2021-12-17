package Schleifen;

import java.util.Scanner;

public class Produktberechnung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int faktor1 = 0;
        int faktor2 = 0;
        int produkt = 0;
        boolean negativ = false;

        System.out.println("Geben Sie den ersten Faktor ein:");
        faktor1 = scanner.nextInt();

        System.out.println("Geben Sie den zweiten Faktor ein:");
        faktor2 = scanner.nextInt();

        if (Math.signum(faktor1) != Math.signum(faktor2)) {
            negativ = true;
        }

        System.out.println("Faktor_1: " + faktor1);
        System.out.println("Faktor_2: " + faktor2);

        faktor1 = Math.abs(faktor1);
        faktor2 = Math.abs(faktor2);

        for (int i = 0; i < faktor1; i++) {
            if (negativ) {
                produkt -= faktor2;
            }else {
                produkt += faktor2;
            }
        }

        System.out.println("Produkt: " + produkt);
    }
}
