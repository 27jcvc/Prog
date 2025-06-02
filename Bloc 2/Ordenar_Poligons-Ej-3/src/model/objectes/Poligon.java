package model.objectes;

public abstract class Poligon implements Comparable{
    private String nom;
    private int area;
    private int perimetre;

    public abstract void calcularArea();
    public abstract void calcularPerimetre();
    public static void calcularHipotenusa(){

    }


    public Poligon(String nom) {
        this.nom = nom;
    }

    public int getArea() {
        return area;
    }

    public int getPerimetre() {
        return perimetre;
    }

    @Override
    public String toString() {
        return "Poligon:" +
                " area: " + area +
                " nom: " + nom + " perimetre: " + perimetre;
    }
}
