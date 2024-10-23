
public class voto {
public static void main(String[] args) {
    String argomento1 =args[0];
    int voto = Integer.valueOf(argomento1);        
        if (voto < 0 || voto > 100) {
            System.out.println("Errore");
        }
        else if (voto < 60) {
            System.out.println("Insufficiente");
        }
        else if (voto < 70) {
            System.out.println("Sufficiente");
        }
        else if (voto < 80) {
            System.out.println("Buono");
        }
        else if (voto < 90) {
            System.out.println("Distinto");
        }
        else if (voto <= 100) {
            System.out.println("Ottimo");
        }
    }
}
    
