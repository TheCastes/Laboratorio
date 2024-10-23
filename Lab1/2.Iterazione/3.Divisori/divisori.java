/**
 * divisori
 */
public class divisori {

    public static void main(String[] args) {
        String argomento1 = args[0];
        int valore = Integer.valueOf(argomento1);
        System.out.print("Divisori di "+valore+": ");
        for (int i = 1; i<=valore/2 + 1;i++) {
            if (valore%i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
    }
}