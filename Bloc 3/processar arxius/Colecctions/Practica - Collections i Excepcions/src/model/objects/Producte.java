package model.objects;

public abstract class Producte  {
    String nom;
    int preu;
    String codiDeBarres;

    public Producte(String nom, int preu, String codiDeBarres) {
        this.nom = nom;
        this.preu = preu;
        this.codiDeBarres = codiDeBarres;
    }
}
