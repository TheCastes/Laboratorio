/**
 * RicevimentoStudenti
 */
import java.util.Scanner;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] agenda = new String[6];
        while(Ricevimento.orariDisponibili(agenda).length > 0) {
            System.out.println("Puoi prenotare un appuntamento alle "+Arrays.toString(Ricevimento.orariDisponibili(agenda)));
            System.out.println("Qual è il tuo nome?");
            String nome = s.next();
            System.out.println("A che ora vorresti l'appuntamento?");
            int ora = s.nextInt();
            try {
                Ricevimento.prenota(agenda, ora, nome);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            } catch (TimeBusyException e) {
                System.out.println(e.getMessage());   
            } catch (AlreadyBookedException e) {
                System.out.println(e.getMessage());
            } catch (ParameterException e) {
                    System.out.println(e.getMessage());
                    System.exit(1);
            } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
            }
        }
        s.close();
        System.out.println("Fissati tutti gli appuntamenti");
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("Alle "+(i+13)+" è fissato l'appuntamento di "+agenda[i]);
        }
    }
}