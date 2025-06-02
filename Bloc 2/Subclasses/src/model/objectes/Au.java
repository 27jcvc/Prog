package model.objectes;

public class Au extends Animal{

    private double envergaduraAlas;
    private String moviment;

    public Au(String nom, int pes, double envergaduraAlas, String moviment) {
        super(nom, pes);
        this.envergaduraAlas = envergaduraAlas;
        this.moviment = moviment;
    }

//    public void moure(){
//        super.moure();
//        System.out.println("Estic volant");
//    }

    @Override
    public void moure() {
        System.out.println(moviment);
    }

    @Override
    public String toString() {
        return super.toString() + "\n EnvergaduraAlas: " + envergaduraAlas + "cm";
    }
}
