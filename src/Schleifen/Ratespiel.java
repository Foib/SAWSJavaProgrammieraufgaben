package Schleifen;

import java.util.Scanner;

public class Ratespiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zufallszahl = (int) (Math.random()*100);
        int eingabe = 0;
        int versuche = 0;

        System.out.println("Rate die Zahl zwischen 0 und 100!");

        do {
            System.out.println("Geben Sie eine Zahl ein:");

            eingabe = scanner.nextInt();

            if (zufallszahl < eingabe) {
                System.out.println("Die zahl ist kleiner!");
            }else if (zufallszahl > eingabe) {
                System.out.println("Die zahl ist größer!");
            }

            versuche++;
        }while (eingabe != zufallszahl);

        System.out.println("Gesuchte Zahl gefunden. Anzahl Versuche: " + versuche);
    }
}
