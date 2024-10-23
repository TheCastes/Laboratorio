
public class multiplo {
    public static void main(String[] args) {
        String argomento1 = args[0];
        String argomento2 = args[1];
        int numero1 = Integer.valueOf(argomento1);
        int numero2 = Integer.valueOf(argomento2);
        if (numero1%numero2 == 0) {
            System.out.print(numero1+" è multiplo di "+numero2);
        }
        else {
            System.out.println(numero1+" non è multiplo di "+numero2);
        }
    }
    
}