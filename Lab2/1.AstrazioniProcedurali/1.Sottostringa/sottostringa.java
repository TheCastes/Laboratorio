/**
 * sottostringa
 */
public class sottostringa {
    //OVERVIEW: Classe che verifica se una stringa parola è sotto stringa di un'altra stringa testo
    public static void main(String[] args) {
        //REQUIRES: due stringhe non nulle
        String testo = args[0];
        String parola = args[1];
        try {
        sottoStringa(testo, parola); 
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        if (sottoStringa(testo, parola) == true) {
            System.out.println(parola+" è sottostringa di "+testo);
        } else {
            System.out.println(parola+" non è sottostringa di "+testo);
        }
        
    }
    public static boolean sottoStringa(String testo, String parola) throws IllegalArgumentException {
    //EFFECTS: restituisce vero se parola è sottostringa di testo, falso altrimenti
    if (testo == null || parola == null) {
        throw new IllegalArgumentException("parametri mancanti");
    }
    String txt = testo.toLowerCase();
    String prl = parola.toLowerCase();
        if (txt.contains(prl)) {
            return true;
        }
        return false;
    }
}
