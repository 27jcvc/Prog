package model.objectes;

public class Reptil extends Animal{

    private String tipusEscates;
    private String moviment;

    public Reptil(String nom, int pes, String tipusEscates, String moviment) {
        super(nom, pes);
        this.tipusEscates = tipusEscates;
        this.moviment = moviment;
    }

    @Override
    public void moure() {
        System.out.println(moviment);
    }

    @Override
    public String toString() {
        return super.toString() + "\n TipusEscates: " + tipusEscates;
    }
}
