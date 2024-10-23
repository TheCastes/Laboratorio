/**
 * Sheep
 */
import java.util.ArrayList;

public class Sheep implements Cloneable {
//OVERVIEW: modella una pecora con nome e dna (serie di stringhe)

//attributes
    private String nome;
    private ArrayList<String> dna;
//costruttori
    public Sheep(String nome, ArrayList<String> dna) throws IllegalArgumentException {
    //MODIFIES: this
    //EFFECTS: inizializza this con nome e dna
    //         if nome null o vuoto throws IllegalArgumentException
    //         if dna null o vuoto throws IllegalArgumentException
    //         if dna contiene stringhe vuote o null throws IllegalArgumentException
        if (nome == null || nome.equals("")) {
            throw new IllegalArgumentException("nome null o vuoto");
        }
        if (dna == null || dna.isEmpty()) {
            throw new IllegalArgumentException("dna null o vuoto");
        }
        for (int i = 0; i < dna.size(); i++) {
            if (dna.get(i) == null || dna.get(i).equals("")) {
                throw new IllegalArgumentException("dna contiene stringhe vuote o null");
            }
        }
        this.nome = nome;
        this.dna =  new ArrayList<String>(dna);
    }
//metodi
    public String getChromosome(int i)  {
    //EFFECTS: restituisce cromosoma all'indice i
    //         se i fuori dal range di cromosomi lancia IllegalArgumentException
        if (i < 0 || i > this.size()) {
            throw new IllegalArgumentException("i < 0 o > size");
        }
        return dna.get(i);
    }
    public void replaceChromosome(int i, String c) {
    //MODIFIES: this
    //EFFECTS: sostituisce cromosoma all'indice i con c
    //         se c vuota o null lancia IllegalArgumentException
    //         se i fuori dal range di cromosomi lancia IllegalArgumentException
        if (i < 0 || i > this.size()) {
            throw new IllegalArgumentException("i < 0 o > size");
        }
        if (c == null || c.equals("")) {
            throw new IllegalArgumentException("c null o vuoto");
        }
        dna.set(i, c);
        
    }
    public String getNome() {
    //EFFECTS: restituisce nome
        return nome;
    }
    public int size() {
    //EFFECTS: restitusice il numero di cromosomi di this
        return dna.size();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Sheep)) {
            return false;
        }
        Sheep tmp = (Sheep)obj;
        if (!(tmp.nome.equals(this.nome))) {
            return false;
        }
        if (!(tmp.dna.equals(this.dna))) {
            return false;
        }
        return true;
    }
    @Override
    public Sheep clone() {
        Sheep s = new Sheep(this.nome, this.dna);
        return s;
    }
    @Override
    public String toString() {
        return "Sheep " + this.nome + "\n" + this.dna;
    }
}