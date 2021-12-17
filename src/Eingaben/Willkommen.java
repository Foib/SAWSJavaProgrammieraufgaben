package Eingaben;

import java.util.Scanner;

public class Willkommen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.print("Geben Sie ihren Namen ein: ");
        name = scanner.nextLine();
        System.out.print("Willkommen " + name + "!");
    }
}
