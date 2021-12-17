package Selektion;

import java.util.Scanner;

public class Nullvergleich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = 0;

        System.out.println("Nullvergleich");

        System.out.print("Zahl: ");
        zahl = scanner.nextInt();

        System.out.print("Die eingegebene Zahl ist ");

        if (zahl % 2 == 0) {
            System.out.print("gerade");
        }else {
            System.out.print("ungerade");
        }

        if (zahl < 0) {
            System.out.print(" und kleiner als 0.");
        }else if (zahl > 0) {
            System.out.print(" und größer als 0.");
        }else {
            System.out.print(" und gleich 0.");
        }
    }
}
