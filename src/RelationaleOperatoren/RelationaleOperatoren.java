package RelationaleOperatoren;

import java.util.Scanner;

public class RelationaleOperatoren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.print("Geben Sie einen Wert für a ein: ");
        a = scanner.nextInt();

        System.out.print("Geben Sie einen Wert für b ein: ");
        b = scanner.nextInt();

        System.out.println("\nErgebnisse der relationalen Funktionen:\n");

        System.out.println(a + " == " + b  + ": " + (a == b));
        System.out.println(a + " <  " + b  + ": " + (a < b));
        System.out.println(a + " <= " + b  + ": " + (a <= b));
        System.out.println(a + " >  " + b  + ": " + (a > b));
        System.out.println(a + " >= " + b  + ": " + (a >= b));
        System.out.println(a + " != " + b  + ": " + (a != b));
    }
}
