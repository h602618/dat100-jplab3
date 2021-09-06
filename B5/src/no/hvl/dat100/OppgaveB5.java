package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int poeng = 0;
            do {
                poeng = Integer.parseInt(showInputDialog("Poengsum(" + i + ")"));
                if (poeng > 100 || poeng < 0) {
                    System.out.println("Ugyldig poengsum");
                }
            } while (poeng > 100 || poeng < 0);
            // løkke som kjører helt til verdien er gyldig

            char karakter = 'F'; // standard karakter er 'F'
            if (poeng >= 40 && poeng <= 49) {
                karakter = 'E';
            } else if (poeng >= 50 && poeng <= 59) {
                karakter = 'D';
            } else if (poeng >= 60 && poeng <= 79) {
                karakter = 'C';
            } else if (poeng >= 80 && poeng <= 89) {
                karakter = 'B';
            } else if (poeng >= 90 && poeng <= 100) {
                karakter = 'A';
            }

            showMessageDialog(null, "Karakter(" + i + "): " + karakter);
        }
    }
}