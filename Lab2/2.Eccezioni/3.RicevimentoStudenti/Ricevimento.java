/**
 * Ricevimento
 */
public class Ricevimento {
//OVERVIEW: Classe statica per gestire un'agenda appuntamenti (String[]) di 6 elementi
    public static void prenota(String[] agenda, int ora, String nome) throws NullPointerException, AlreadyBookedException, TimeBusyException, IllegalArgumentException {
    //MODIFIES: agenda
    //EFFECTS: Inserisce nome in agenda all'indice ora-13
    //         se agenda null lancia NullPointerException
    //         se agenda ha !=6 elementi lancia IllegalArgumentException
    //         se ora < 13 o > 18 lancia IllegalArgumentException
    //         se nome null o vuoto lancia IllegalArgumentException
    //         se orario occupato lancia TimeBusyException
    //         se nome già prenotato in altro orario lancia AlreadyBookedException
        if (agenda == null) {
            throw new NullPointerException("agenda null");
        }
        if (agenda.length != 6) {
            throw new ParameterException("agenda ha != 6 elementi");
        }
        if (ora < 13 || ora > 18) {
            throw new IllegalArgumentException("ora < di 13 o > di 18");
        }
        if (nome == null || nome.equals("")) {
             throw new IllegalArgumentException("nome null o vuoto");
        }
        if (agenda[ora-13] != null) {
            throw new TimeBusyException("orario occupato");
        }
        if (contains(agenda, nome)) {
            throw new AlreadyBookedException("studente già prenotato");
        }
        agenda[ora-13] = nome;
    }

    private static boolean contains(String[] agenda, String nome) {
    //REQUIRES: agenda non nulla e con 6 elementi non vuoti
    //EFFECTS: restituisce true se nome è in agenda, false altrimenti
        for (String s : agenda) {
            if (nome.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static int[] orariDisponibili(String[] agenda) throws NullPointerException, IllegalArgumentException {
    //EFFECTS: Restituisce un array di interi con gli orari disponibili dell'agenda
    //         se agenda null lancia NullPointerException
    //         se agenda ha !=6 elementi lancia IllegalArgumentException
        if (agenda == null) {
            throw new NullPointerException("agenda null");
        }
        if (agenda.length != 6) {
            throw new IllegalArgumentException("agenda ha != 6 elementi");
        }
         int counter = 0;
         for (String s : agenda) {
            if (s == null)
              counter++;
         }
        int[] orari = new int[counter];
        for (int i = 0, j = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                orari[j++] = i+13; 
                
            }
        }
         return orari;
    }
    
}