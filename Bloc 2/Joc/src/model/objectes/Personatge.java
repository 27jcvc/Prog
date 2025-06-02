package model.objectes;

public abstract class Personatge extends Element implements Moviment {



    private int velocitat; // Velocitat a la que es mourà el personatge
    private int energia; // Temps que li queda fins que s'acabi l'efecte de la poció màgica
    /**
     * Constructor per inicialitzar els atributs de l'element.
     *
     * @param nom
     * @param c
     */
    public Personatge(char nom, Cordenades c) { // int velocitat
        super(nom, c);
//        this.velocitat = velocitat;
    }

    @Override
    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void mouD() {
        setCoord(new Cordenades(getCoord().getFiles() + 1, getCoord().getColumna()));
    }

    @Override
    public void mouU() {
        setCoord(new Cordenades(getCoord().getFiles() - 1, getCoord().getColumna()));
    }

    @Override
    public void mouL() {
        setCoord(new Cordenades(getCoord().getFiles() , getCoord().getColumna() - 1));

    }

    @Override
    public void mouR() {
        setCoord(new Cordenades(getCoord().getFiles(), getCoord().getColumna() + 1));
    }

    @Override
    public String toString() {
        return "model.objectes.Personatge: " +
                "nom: " + super.getNom() + " " + super.toString();
    }
}
