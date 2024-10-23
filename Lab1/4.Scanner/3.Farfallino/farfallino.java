import java.util.ArrayList;
import java.util.Scanner;
/**
 * farfallino
 */
public class farfallino {
    public static void main(String[] args) {
        System.out.println("Inserisci un testo su più righe (termina con CTRL+D):");
        ArrayList<String> lista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            lista.add(linea);
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(farfallino(lista.get(i)));
        }
        
    }
    public static boolean isVocale(char c) {
        Character ch = c;
            if (ch.equals('A')) {
                System.out.println("sì");
                return true;
            }
        System.out.println("no");
        return false;
    }
    public static String farfallino(String s) {
        String ns = s;
       for (int i = 0; i < s.length(); i++) {
            if(isVocale(s.charAt(i)) == true) {
                if (Character.isLowerCase(s.charAt(i)) == true) {
                     ns= s.substring(0,i+1)+"f"+s.substring(i);
                     System.out.println(ns);
                } else {
                     ns = s.substring(0,i+1)+"F"+s.substring(i);
                     System.out.println(ns);
                }
            }
       }
       s = ns;
       return s;
    }

}