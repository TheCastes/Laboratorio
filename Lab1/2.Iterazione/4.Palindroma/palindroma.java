/**
 * palindroma
 */
public class palindroma {
    public static void main(String[] args) {
        String parola = args[0];
        int lettere = parola.length();
        boolean palindroma = true;
        for (int i = 0;i<lettere;i++) {
            if (parola.charAt(i) != parola.charAt(lettere-1-i)) {
                palindroma = false;
                break;
            }
        }
        if (palindroma == true){
            System.out.println("Palindroma");
        }
        else {
            System.out.println("Non palindroma");
        }
    }
}