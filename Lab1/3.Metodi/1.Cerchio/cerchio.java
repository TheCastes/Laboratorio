/**
 * cerchio
 */

public class cerchio {
    public static void main(String[] args) {
        double raggio = Double.parseDouble(args[0]);
        double area = CalcolaArea(raggio);
        double circonferenza = CalcolaCirconferenza(raggio);
        System.out.println("Area del cerchio: "+area);
        System.out.println("Circonferenza del cerchio "+circonferenza);
    }
    public static double CalcolaArea(double raggio) {
            double area = raggio*raggio*Math.PI;
        return area;
    }
    public static double CalcolaCirconferenza(double raggio) {
            double circonferenza = 2*raggio*Math.PI;
        return circonferenza;
    }
    
}