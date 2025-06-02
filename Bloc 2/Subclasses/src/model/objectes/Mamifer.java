package model.objectes;

public class Mamifer extends Animal{

    private String tipusPel;
    private String moviment;

    public Mamifer(String nom, int pes, String tipusPel, String moviment) {
        super(nom, pes);
        this.tipusPel = tipusPel;
        this.moviment = moviment;
    }

    @Override
    public void moure() {
        System.out.println(moviment);
    }

    @Override
    public String toString() {
        return super.toString() + "\n TipusPel: " + tipusPel;
    }
}
