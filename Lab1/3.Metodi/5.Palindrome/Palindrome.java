/**
 * Palindrome
 */
import java.util.ArrayList;
public class Palindrome {

    public static void main(String[] args) {
        String parola = args[0];
        ArrayList<String> lista = new ArrayList<String>();
        lista = elenco(parola);
        System.out.println(lista);
    }

    private static boolean isPalindroma(String s) {
        for (int i = 0;i<s.length();i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> elenco(String s) {
        ArrayList<String> elenco = new ArrayList<String>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length(); j > 1; j--) {
                    String nuovaStringa = s.substring(i,j);
                    if (isPalindroma(nuovaStringa) == true && nuovaStringa.length() >= 2) {
                        elenco.add(nuovaStringa);
                    }
                    if (nuovaStringa.length() <= 2) {
                        break;
                    }
                }
                
            }
        return elenco;
        }
       
}
