/**
 * fattoriale
 */
import java.util.ArrayList;

public class Fattoriale {
//OVERVIEW: legge da riga di comando un numero intero n e stampa a video tutti i numeri compresi tra 1 e n (estremi inclusi)

    public static void main(String[] args) {
        int numero = Integer.valueOf(args[0]);
        try {
            listaFattoriali(numero);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        ArrayList<Integer> listafattoriali = new ArrayList<Integer>();
        listafattoriali = listaFattoriali(numero);
        stampaFattoriali(listafattoriali);
    }
    public static int fattoriale(int n) throws IllegalArgumentException {
    //EFFECTS: dato un intero n restituisce il suo fattoriale
    int f = n;
    if (n < 0) {
        throw new IllegalArgumentException("Fattoriale < 0 non definito");
    }
    if (n == 1 || n == 0) {
         return 1;
    }
    while (f > 1) {
        f--;
        n = n*f;
    }
    return n;
    }

    public static ArrayList<Integer> listaFattoriali(int n) throws IllegalArgumentException {
    //EFFECTS: dato un intero n, restituisce una lista che contiene tutti i fattoriali da 1 a n
        ArrayList<Integer> fattoriali = new ArrayList<Integer>();
    if (n < 0) {
        throw new IllegalArgumentException("Fattoriale < 0 non definito");
    }
    if (n == 0) {
        fattoriali.add(1);
        return fattoriali;
    } else {
        for (int i = 0; i < n; i++) {
            fattoriali.add(fattoriale(i+1));
        }
        return fattoriali;
    }
    }
    public static void stampaFattoriali(ArrayList<Integer> lista) {
    //EFFECTS: stampa in standard output la lista dei fattoriali
        for (int i = 1; i < lista.size()+1; i++) {
            System.out.println(i+": "+lista.get(i-1));
        }
    }
}