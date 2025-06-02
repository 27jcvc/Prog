package model.objectes;

public class Jugador extends Personatge {


    /**
     * Constructor per inicialitzar els atributs de l'element.
     *
     * @param nom
     * @param c
     */
    public Jugador(char nom, Cordenades c) {
        super(nom, c);
    }

    public void prenPocio(){

    }

    @Override
    public String toString() {
        return "model.objectes.Jugador: " + super.toString();
    }
}
