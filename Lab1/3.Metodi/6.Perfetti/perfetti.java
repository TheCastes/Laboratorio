/**
 * perfetti
 */
public class perfetti {

    public static void main(String[] args) {
        int numero = Integer.valueOf(args[0]);
        if (perfetto(numero)) {
            System.out.println(numero+" è perfetto");
        } else {
            System.out.println(numero+" non è perfetto");
        }
    }
    public static int sommaDivisoriPropri(int n) {
        int divisori = 0;
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                divisori = divisori+i;
            }
        }
        return divisori;
    }
    public static boolean perfetto(int n) {
        if (n == sommaDivisoriPropri(n) && n != 0) {
            return true;
        }
        return false;
    }
}