/**
 * garibaldi
 */
import java.util.ArrayList;
import java.util.Scanner;
public class garibaldi {
    public static void main(String[] args) {
        System.out.println("Inserisci un testo su più righe (termina con riga vuota):");
        ArrayList<String> lista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            lista.add(linea);
        }
        scan.close();
        ArrayList<String> nuovalista = gurubuldu(lista);
        System.out.println("Risultato trasformazione:");
        for (int i = 0; i < nuovalista.size(); i++) {
            System.out.println(nuovalista.get(i));            
        }
    }
    public static ArrayList<String> gurubuldu(ArrayList<String> lista) {
        ArrayList<String> nuovalista = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {
            String buffer = lista.get(i).replaceAll("[aeio]","u");
            nuovalista.add(buffer);
        }
        return nuovalista;
    }
}