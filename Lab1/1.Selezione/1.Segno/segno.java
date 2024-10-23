
public class segno {
    public static void main(String[] args) {       
        String argomento1 = args[0];
        int numero = Integer.valueOf(argomento1);
        if (numero <= 0) {
            System.out.println(numero);
        } else {
            System.out.print("+"+numero+"\n");
        }
    }
}