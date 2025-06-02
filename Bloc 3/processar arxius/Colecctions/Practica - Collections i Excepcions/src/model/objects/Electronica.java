package model.objects;

public class Electronica extends Producte{
    int diesGarantia;


    public Electronica(String nom, int preu, String codiDeBarres, int diesGarantia) {
        super(nom, preu, codiDeBarres);
        this.diesGarantia = (int) (preu + preu*(diesGarantia/365)*0.1);
    }
}
