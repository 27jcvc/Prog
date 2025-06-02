package model.objectes;

/**
 * Interfície que determina els moviments que poden fer els personatges.
 * Les classes que implementin aquesta interfície han d'implementar aquests mètodes.
 */
public interface Moviment {
    void mouD();
    void mouU();
    void mouR();
    void mouL();
    void setVelocitat(int velocitat);
}
