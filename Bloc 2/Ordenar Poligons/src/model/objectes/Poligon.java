package model.objectes;

public abstract class Poligon {

        private String nom;
//        TODO: preguntar al pere por el ej
        private int area;
        private int perimetre;


    public Poligon(String nom) {
        this.nom = nom;
//        this.area = area;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetre();
    public static void calcularHipotenusa(){

    }

    public int getArea() {
        return area;
    }

    public int getPerimetre() {
        return perimetre;
    }
}
