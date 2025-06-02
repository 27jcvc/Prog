public class Producte {

    String nom;
    String desc;
    float preu;

    public Producte(String nom, String desc, float preu) {
        this.nom = nom;
        this.preu = preu;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Producte: " +
                "\n Nom: " + nom + "\n"+
                  " Descripcio: " + desc + "\n"+
                  " Preu: " + preu;
    }
}
