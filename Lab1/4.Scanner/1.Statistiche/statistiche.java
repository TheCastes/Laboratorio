/**
 * statistiche
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class statistiche {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        int numlinee = 0;
        System.out.println("Inserisci un testo su più righe (termina con Ctrl+D)");
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            numlinee++;
            String linea = s.nextLine();
            lista = listaparole(lista, linea);
           // System.out.println(lista);
           // System.out.println(numlinee);
        }
        s.close();
        int numparole = lista.size();
        ArrayList<Integer>listalen = listalen(lista);
     //   System.out.println(listalen);
        double lunmedia = lunmedia(listalen);
        System.out.println("Statistiche:");
        stampaFormattata(numlinee, numparole, lunmedia);
    }
    public static ArrayList<String> listaparole(ArrayList<String> list, String s) { 
        String[] arrlista = s.split(" ");
        list.addAll(Arrays.asList(arrlista));
        return list;
    }
    public static void stampaFormattata(int numlinee, int numparole, double lunmedia) {
         System.out.println("Numero linee: "+numlinee+"\nNumero parole: "+numparole+"\nLunghezza media: "+lunmedia);
    }
    public static ArrayList<Integer> listalen(ArrayList<String> lista) {
        ArrayList<Integer> numchar = new ArrayList<Integer>();
        for (int i = 0; i < lista.size(); i++) {
            String buffer = lista.get(i);
            numchar.add(buffer.length());
        }
        return numchar;
    }
    public static double lunmedia(ArrayList<Integer> numchar) {
        double buffer = 0;
        for (int i = 0; i < numchar.size(); i++) {
            buffer+=numchar.get(i);
        }
       // System.out.println(buffer);
       // System.out.println(numchar.size());
        double lunmedia = buffer/numchar.size();
        double roundedmedia = Math.round(lunmedia*100.0)/100.0;
       // System.out.println(lunmedia);
       //System.out.println(roundedmedia);
        return roundedmedia;

    }
}
