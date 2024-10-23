/**
 * parentesi
 * Quando legge una quadra aperta, cerca la prima quadra chiusa ed elimina sia
 * quella che l'aperta.
 * Se avanzano quadre alla fine non è bilanciata, se una quadra aperta è l'ultimo
 * carattere non è bilanciata
 */
public class parentesi {

    public static void main(String[] args) {
        String parentesi = args[0];
         if (((parentesi.length())%2 != 0) || (parentesi.charAt(0) == ']') || (parentesi.charAt(parentesi.length()-1) == '[')) {
            System.out.println("Non bilanciate");
        } else {
            while (parentesi.contains("[]")) {
                parentesi = parentesi.replace("[]", "");
                if (parentesi == "") {
                    System.out.println("Bilanciate");
                    return;
                }
            System.out.println("Non bilanciate");
            return;
            }
        }
        
    }
  
}