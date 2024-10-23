/**
 * tabellina
 */
public class tabellina {
    public static void main(String[] args) {
        int numero = Integer.valueOf(args[0]);
        for (int i = 1; i<=10;i++) {
            System.out.print(i+" x "+numero+" = "+numero*i+"\n");
        }
    }
    
}