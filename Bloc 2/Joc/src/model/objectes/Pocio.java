package model.objectes;

public class Pocio extends Element{


    private char nom;
    private Cordenades c;


    /**
     * Constructor per inicialitzar els atributs de la poció.
     * @param nom
     */
    public Pocio(char nom, Cordenades c) {
        super(nom, c);
    }
}
