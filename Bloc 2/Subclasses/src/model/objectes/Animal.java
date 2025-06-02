package model.objectes;

public abstract class Animal {
    private String nom;
    private int pes;

    public Animal(String nom, int pes) {
        this.nom = nom.trim();
        this.pes = pes;
    }

    public abstract void moure();

    @Override
    public String toString() {
        return "---------------------------------\n" +
                " Nom: " + nom + "\n Pes: " + pes;
    }


    public String getNom() {
        return nom;
    }
}
