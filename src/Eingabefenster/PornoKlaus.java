package Eingabefenster;

import javax.swing.*;

public class PornoKlaus {
    public static void main(String[] args) {
        String titel = "";

        int eingabe = JOptionPane.showConfirmDialog(null, "10000 Euro an info@pornoklaus.com senden?", titel, JOptionPane.YES_NO_CANCEL_OPTION);

        if (eingabe == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Du hast nun Zugang zu allen Inhalten! Have Fun!", titel, JOptionPane.INFORMATION_MESSAGE);
        }else if (eingabe == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Du hast leider keinen Zugang zu 18+ Inhalten :(", titel, JOptionPane.INFORMATION_MESSAGE);
        }else if (eingabe == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Der Vorgang wurde abgebrochen", titel, JOptionPane.ERROR_MESSAGE);
        }
    }
}
