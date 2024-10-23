/**
 * Clone
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Clone {

    public static void main(String[] args) {
        String nome = args[0];
        ArrayList<String> dna = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci i cromosomi, uno per riga (terminare con CTRL+D):");
        while(s.hasNextLine()) {
            dna.add(s.nextLine());
        }
        Sheep p1 = null;
        try {
             p1 = new Sheep(nome, dna);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Ho creato " + p1);
        Sheep p2 = p1.clone();
        System.out.println("Ho creato un clone di "+ p2);
        if (p1.equals(p2)) {
            System.out.println("le due pecore sono uguali");
        } else {
            System.out.println("Le due pecore sono diverse");
        }
        Scanner s2 = new Scanner(System.in);
        System.out.println("Inserisci il cromosoma da modificare ed il nuovo codice:");
        
        int i = s2.nextInt();
        String c = s2.next();
        s.close();
        s2.close();
        try {
            p2.replaceChromosome(i, c);
            System.out.println("Ho modificato "+ p2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        if (p1.equals(p2)) {
            System.out.println("le due pecore sono uguali");
        } else {
            System.out.println("Le due pecore sono diverse");
        }
    }
}