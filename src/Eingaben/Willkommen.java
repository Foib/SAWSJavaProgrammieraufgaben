package Eingaben;

import java.util.Scanner;

public class Willkommen {
    public static void main(String[] args) {
        //Ein Scanner Objekt wird erstellt welches aus "System.in" scannt
        Scanner scanner = new Scanner(System.in);

        //Die Variable "name" wird mit einem leeren String initialisiert
        String name = "";

        //Es wird nach dem Namen des Benutzers in der Konsole gefragt
        System.out.print("Geben Sie ihren Namen ein: ");

        //Variable "name" wird zu dem input aus der Konsole gesetzt
        name = scanner.nextLine();

        //Der Benutzer wird begrüßt
        System.out.print("Willkommen " + name + "!");
    }
}
