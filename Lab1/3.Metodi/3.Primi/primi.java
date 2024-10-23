/**
 * primi
 */
public class primi {

    public static void main(String[] args) {
        int soglia = Integer.valueOf(args[0]);
        if (soglia <= 0) {
            System.out.println("La soglia inserita non è positiva");
        } else {
            for (int i = 1; i <= soglia; i++) {
                if (primo(i) == true) {
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
    }
    public static boolean primo(int n) {
        for (int i = 1; i <= n/2; i++) {
            if (n%i == 0 && i != 1 && i != n) {
                return false;
            } 
        }
        return true;
    }
}
