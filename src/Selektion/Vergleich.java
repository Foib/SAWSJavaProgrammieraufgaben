package Selektion;

import java.util.Scanner;

public class Vergleich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl1 = 0;
        int zahl2 = 0;

        System.out.println("Vergleich");

        System.out.print("Zahl1: ");
        zahl1 = scanner.nextInt();

        System.out.print("Zahl2: ");
        zahl2 = scanner.nextInt();

        System.out.print("Größerer Wert: ");
        if (zahl1 >= zahl2) {
            System.out.println(zahl1);
        }else {
            System.out.println(zahl2);
        }
    }
}
