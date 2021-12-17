package Selektion;

import java.util.Scanner;

public class Elektrofirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float VERSANDKOSTEN_100 = 5.5f;
        final float VERSANDKOSTEN_200 = 3.0f;

        float auftragssumme = 0.0f;
        float rechnungsbetrag = 0.0f;

        System.out.print("Geben Sie die Auftragssumme ein: ");
        auftragssumme = scanner.nextFloat();

        rechnungsbetrag = auftragssumme;
        if (auftragssumme < 100.0f) {
            rechnungsbetrag += VERSANDKOSTEN_100;
        }else if (auftragssumme < 200.0f) {
            rechnungsbetrag += VERSANDKOSTEN_200;
        }

        System.out.println("\nBerechnung des Rechnungsbetrags");
        System.out.printf("Auftragssumme: %.2f Euro\n", auftragssumme);
        System.out.printf("Rechnungsbetrag: %.2f Euro\n", rechnungsbetrag);
    }
}
