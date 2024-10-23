/**
 * SvolgiCalcolo
 */
import java.util.Scanner;
public class SvolgiCalcolo {

    public static void main(String[] args) {
        CalcolatriceConMemoria calc = new CalcolatriceConMemoria();
        if (args[0] != null) {
            double decimale = Double.valueOf(args[0]);
            calc = new CalcolatriceConMemoria(decimale);
        }
        System.out.println("Calcolatrice inizializzata, valore: "+ calc.getMem());
        System.out.println("Inserisci <operatore> <operando>. es: + 3");
        System.out.println("Per terminare inserire il carattere '='.");
        Scanner s = new Scanner(System.in);
        String[] param = null;
        while (s.hasNext()) {
            param = s.nextLine().split(" ");
            if (param[0].equals("=")) {
                break;
            } else {
                calc.operate(param[0].charAt(0),Double.parseDouble(param[1]));
                System.out.println("valore in memoria: "+calc.getMem());
            }

        }
        s.close();
        System.out.println("Il risultato finale è "+calc.getMem());
    }
}