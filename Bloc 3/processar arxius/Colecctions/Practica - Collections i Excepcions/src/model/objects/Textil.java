package model.objects;

public class Textil extends Producte{
    String compTextil;


    public Textil(String nom, int preu, String codiDeBarres, String compTextil) {
        super(nom, preu, codiDeBarres);
        this.compTextil = compTextil;
    }
}
