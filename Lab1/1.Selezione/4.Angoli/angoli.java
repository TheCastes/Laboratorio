/**
 * angoli
 */
public class angoli {
    public static void main(String[] args) {
        String argomento1 = args[0];
        String argomento2 = args[1];
        int ampiezza1 = Integer.valueOf(argomento1);
        int ampiezza2 = Integer.valueOf(argomento2);
        if ((ampiezza1 + ampiezza2) > 180) {
            System.out.println("I due angoli non appartengono ad un triangolo");
        }
        else {
            int ampiezza3 = 180 - (ampiezza1+ampiezza2);
            System.out.print("Ampiezza terzo angolo = "+ampiezza3+"°\n");
        }
    }
}