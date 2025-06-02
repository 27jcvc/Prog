package model.objectes;

public class Enemic extends Personatge implements Moviment {

    /**
     * Constructor per inicialitzar els atributs de l'element.
     *
     * @param nom
     * @param c
     */
    public Enemic(char nom, Cordenades c) {
        super(nom, c);
    }

    @Override
    public void mouD() {
        super.mouD();
    }

    @Override
    public void mouU() {
        super.mouU();
    }

    @Override
    public void mouL() {
        super.mouL();
    }

    @Override
    public void mouR() {
        super.mouR();
    }

    @Override
    public void setVelocitat(int velocitat) {
        super.setVelocitat(velocitat);
    }
}
