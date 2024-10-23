/**
 * mesi
 */
public class mesi {
     public static void main(String[] args) {
        String mese = args[0];
        switch(mese) {
            case "gennaio":
            case "marzo":
            case "maggio":
            case "luglio":
            case "agosto":
            case "ottobre":
            case "dicembre":
                System.out.print("il numero di giorni di "+mese+" è 31");
               break;
            case "aprile":
            case "giugno":
            case "settembre":
            case "novembre":
                System.out.print("il numero di giorni di "+mese+" è 30");
                break;
            case "febbraio":
                System.out.print("il numero di giorni di "+mese+" è 28");
                break;
            default:
                System.out.println("Il nome del mese non è corretto.");
                break;
        }
    }

}