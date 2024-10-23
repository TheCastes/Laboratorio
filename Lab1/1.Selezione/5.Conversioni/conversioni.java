/**
 * conversioni
 */
public class conversioni {
public static void main(String[] args) {
    String argomento1 = args[0];
    String argomento2 = args[1];
    //String argomento3 = args[2];
    String argomento4 = args[3];
    int valore = Integer.valueOf(argomento1);
    double output;
    switch(argomento2) {
        case "minuti":
            valore = valore*60;
            break;
        case "ore":
            valore = valore*60*60;
            break;
        case "giorni":
            valore = valore*24*60*60;
            break;
        case "mesi":
            valore = valore*30*24*60*60;
            break;
        case "anni":
            valore = valore*365*30*24*60*60;
            break;
    }
    switch(argomento4) {
        case "minuti":
            output = valore/60;
            System.out.print(args[0]+" "+args[1]+" corrispondono a "+output+" "+args[3]+"\n");
            break;
        case "ore":
            output = (valore/60)/60;
            System.out.print(args[0]+" "+args[1]+" corrispondono a "+output+" "+args[3]+"\n");

            break;
        case "giorni":
            output = (((valore/24)/60)/60);
            System.out.print(args[0]+" "+args[1]+" corrispondono a "+output+" "+args[3]+"\n");

            break;
        case "mesi":
            output = ((((valore/30)/24)/60)/60);
            System.out.print(args[0]+" "+args[1]+" corrispondono a "+output+" "+args[3]+"\n");

            break;
        case "anni":
            output = (((((valore/365)/30)/24)/60)/60);
            System.out.print(args[0]+" "+args[1]+" corrispondono a "+output+" "+args[3]+"\n");

            break;
    }
}
    
}