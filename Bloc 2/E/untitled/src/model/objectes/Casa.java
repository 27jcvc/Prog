package model.objectes;

public class Casa extends Habitatge {
    // Dades específiques d'una casa
    private boolean jardi;

    //    TODO: Directament desde casa comprovar
    // Constructor
    public Casa(String propietari, String adressa, float preu, boolean jardi) throws Exception{
        super(propietari,adressa, preu);
        this.jardi = jardi;
        if(preu < 500000) throw new Exception("No es una casa de luxe");
    }



//    // Retorna les dades d'un habitatge més si té jardí (Sí/No)


    @Override
    public String toString() {
        String tJ = (jardi) ? "Si" : "No";
        return  super.toString() +
                "  Jardi: " + tJ + (jardi ? "SI" : "No") + "\n";
    }
}
