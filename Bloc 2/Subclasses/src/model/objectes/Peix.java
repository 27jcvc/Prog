package model.objectes;

public class Peix extends Animal {

    private int profunditat;
    private String moviment;

    public Peix(String nom,int pes,int profunditat, String moviment){
        super(nom, pes);
        this.profunditat = profunditat;
        this.moviment = moviment;
    }

    @Override
    public void moure() {
        System.out.println(moviment);
    }


    public int getProfunditat() {
        return profunditat;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Profunditat: " + profunditat;
    }
}
