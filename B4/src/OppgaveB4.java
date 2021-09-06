import static javax.swing.JOptionPane.*;

public class OppgaveB4 {
    public static void main(String[] args) {
        // trinn0: 0-184800 >> 0%
        // trinn1: 184801-260100 >> 1.7%
        // trinn2: 260101-651250 >> 4.0%
        // trinn3: 651251-1021550 >> 13.0%
        // trinn4: 1021551-INF >> 16.2%

        int brutto = Integer.parseInt(showInputDialog("Brutto"));

        double tSats = 0.00;
        if (brutto >= 1021550) {
            tSats = 16.2;
        } else if (brutto > 651250 && brutto < 1021550) {
            tSats = 13.2;
        } else if (brutto > 260100 && brutto < 651250) {
            tSats = 4.0;
        } else if (brutto > 184800 && brutto < 260100) {
            tSats = 1.7;
        }
        // else ikke nødvendig
        // fordi standard verdi blir brukt om ingen andre if-setninger matcher

        // prosent til desimal
        tSats = tSats / 100;

        // antall kroner i skatt
        double tSkatt = brutto * tSats;

        System.out.println("Trinnskatt=" + tSkatt + "kr");
    }
}