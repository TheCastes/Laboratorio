/**
 * sommaIntervallo
 */
public class sommaIntervallo {

    public static void main(String[] args) {
        String argomento1 = args[0];
        String argomento2 = args[1];
        int numero1 = Integer.valueOf(argomento1);
        int numero2 = Integer.valueOf(argomento2);
        int somma = 0;
        for (int i = numero1+1;i < numero2;i++ ) {
            if (i%2 == 0) {
                somma = somma+i;
            }
        }
        System.out.print("Somma = "+somma);
    }
}