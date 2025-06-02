package model.objectes;

/**
 * Classe per gestionar un element del joc.
 */
public abstract class Element {

    private Cordenades coord; // Posició on es troba l'element
    private char nom; // Lletra que defineix l'element.

    /**
     * Constructor per inicialitzar els atributs de l'element.
     * @param c
     * @param nom
     */
    public Element(char nom,
                   Cordenades c) {
        this.nom = nom;
        this.coord = c;
    }

    @Override
    public String toString() {
        return "model.objectes.Element{" +
                "nom=" + nom + super.toString() + " " + coord;
    }

    public void setCoord(Cordenades coord) {
        this.coord = coord;
    }

    public Cordenades getCoord() {
        return coord;
    }

    public char getNom() {
        return nom;
    }
}
