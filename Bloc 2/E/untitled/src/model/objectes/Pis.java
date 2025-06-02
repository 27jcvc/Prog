package model.objectes;

public class Pis extends Habitatge{
    // Dades específiques d'un pis
    private int planta;
    private boolean ascensor;

    public Pis(String propietari,String adressa, float preu, int planta, boolean ascensor) throws Exception{
        super(propietari, adressa, preu);
        this.planta = planta;
        this.ascensor = ascensor;
        if(planta > 1 && (!ascensor)) throw new Exception("Un pis es molt amunt i no tè ascensor");
    }


    //    Directament desde pis comprovar
//    el constructor puede lanzar una excepcion
    // Constructor



    // Retorna les dades d'un habitatge més la p lanta i si té ascensor (Sí/No)

    @Override
    public String toString() {
        String tA = (ascensor) ? "Si" : "No";
        return  super.toString() +
                "  Planta: " + planta + "\n" +
                "  Ascensor: " + tA + "\n";
    }
}
