package Selektion;

import java.util.Scanner;

public class Mehrfachselektion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe = 0;
        String ausgabe = "";

        do {
            System.out.println("Geben Sie die Nummer des Monats ein:");
            eingabe = scanner.nextInt();

            if (eingabe < 1 || eingabe > 12) {
                System.out.println("Das ist keine gültige Nummer!");
            }
        }while (eingabe < 1 || eingabe > 12);

        switch (eingabe) {
            case 1:
                ausgabe = "Januar";
                break;

            case 2:
                ausgabe = "Februar";
                break;

            case 3:
                ausgabe = "März";
                break;

            case 4:
                ausgabe = "April";
                break;

            case 5:
                ausgabe = "Mai";
                break;

            case 6:
                ausgabe = "Juni";
                break;

            case 7:
                ausgabe = "Juli";
                break;

            case 8:
                ausgabe = "August";
                break;

            case 9:
                ausgabe = "September";
                break;

            case 10:
                ausgabe = "Oktober";
                break;

            case 11:
                ausgabe = "November";
                break;

            case 12:
                ausgabe = "Dezember";
                break;
        }
        System.out.println(ausgabe);
    }
}
