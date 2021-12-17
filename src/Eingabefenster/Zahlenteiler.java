package Eingabefenster;

import javax.swing.*;

public class Zahlenteiler {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog(null, "Geben Sie eine ganze Zahl größer 0 ein", "Teilbarkeit", JOptionPane.PLAIN_MESSAGE);

        if (eingabe != null) {
            int zahl = Integer.parseInt(eingabe);

            if (zahl > 0) {
                String ausgabe = "";

                for (int i = 1; i <= zahl; i++) {
                    if (zahl % i == 0) {
                        ausgabe += i + " ";
                    }
                }

                JOptionPane.showMessageDialog(null, ausgabe, "Teiler der Zahl " + eingabe, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}