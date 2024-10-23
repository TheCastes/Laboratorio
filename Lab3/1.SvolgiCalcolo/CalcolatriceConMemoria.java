/**
 * CalcolatriceConMemoria
 */
import java.util.InputMismatchException;

public class CalcolatriceConMemoria {
    //OVERVIEW: conserva uno stato di memoria ed applica al risultato in memoria operazioni 
    //          algebriche base con un secondo operando dato con parametro
//parametri
private double mem = 0;
///costruttori
    public CalcolatriceConMemoria() {
        //MODIFIES: this
        //EFFECTS: inizializza la calcolatrice impostando lo stato di memoria iniziale a 0
        this.mem = 0;
    }
    public CalcolatriceConMemoria(double mem) {
        //MODIFIES: this
        //EFFECTS: inizializza la calcolatrice impostando lo stato di memoria iniziale a mem
        this.mem = mem;
    }
//metodi
    public double getMem() {
        //EFFECTS: restituisce il valore correntemente in memoria
        return mem;
    }
    public double add(double op2) {
        //MODIFIES mem
        //EFFECTS: esegue la somma tra mem ed op2, restituendo in mem il valore dell'operazione
        mem += op2;
        return mem;
    }
    public double sub(double op2) {
        //MODIFIES mem
        //EFFECTS: esegue la differenza tra mem ed op2, restituendo in mem il valore dell'operazione
        mem -= op2;
        return mem;
    }
    public double mul(double op2) {
        //MODIFIES mem
        //EFFECTS: esegue il prodotto tra mem ed op2, restituendo in mem il valore dell'operazione
        mem *= op2;
        return mem;
    }
    public double div(double op2) throws DivideByZeroException {
        //MODIFIES mem
        //EFFECTS: esegue la divisione tra mem ed op2, restituendo in mem il valore dell'operazione
        //         se op2 = 0 throws DivideByZeroException
        if (op2 == 0) {
            throw new DivideByZeroException("Divisione per 0, impossibile");
        }
        mem = mem/op2;
        return mem;
    }
    public double operate(char operator, double op2) throws InputMismatchException {
        //MODIFIES mem
        //EFFECTS: esegue chiamando i metodi opportuni le operazioni di tipo operator, restituendo in mem il valore dell'operazione
        //         se operator != [+-*/] throws InputMismatchException
        switch(operator) {
            case '+': {
                add(op2);
                break;
            }
            case '-': {
                sub(op2);
                break;
            }
            case '*': {
                mul(op2);
                break;
            }
            case '/': {
                try {
                    div(op2);
                } catch (DivideByZeroException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default: {
                try {
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
        return mem;
    }


}