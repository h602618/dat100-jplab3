package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {
    public static void main(String[] args) {
        // LES INN HELTALL (n)
        int n = Integer.parseInt(showInputDialog("Heltall?"));
        if (n > 0) {
            // n er et logvlig tall!

            // BEREGN n-FAKULTET
            int startNummer = n;
            int sum = 1; // settes til 1 istedet for 0, fordi multiplikasjon med '0', er '0'
            do {
                sum *= startNummer;
                startNummer--;
            } while (startNummer > 0);

            // SKRIV UT n-FAKULTET
            showMessageDialog(null, n + "! = " + sum);
        } else {
            // jeg kunne her brukt en løkke, men oppgaven sier ikke noe om det
            // ...så derform bruker jeg if-else og sender tilbakemelding til brukeren
            showMessageDialog(null, "'n' må være større enn 0");
        }

    }
}