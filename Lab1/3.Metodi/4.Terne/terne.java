
public class terne {
    public static void main(String[] args) {
        int soglia = Integer.valueOf(args[0]);

        if (soglia<0) {
            System.out.println("Errore");
        }
        else {
         for (int i = 1; i<soglia;i++)
            for(int j=i;j<soglia;j++)
                for (int k=i+1;k<soglia;k++) {
                if (ternaPitagorica(i,j,k) == true) {
                    System.out.print("("+i+","+j+","+k+")\n");
                }
            }
        }
    }
    public static boolean ternaPitagorica(int a, int b, int c) {
        if (((a*a)+(b*b)) == c*c) {
            return true;
        }
        else {
        return false;
        }
    }

}