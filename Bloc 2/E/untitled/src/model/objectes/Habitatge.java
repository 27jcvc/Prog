package model.objectes;

public abstract class Habitatge {
    // Dades genèriques d'un habitatge
    private String propietari;
    private String adressa;
    private float preu;

    // Constructor

    public Habitatge(String propietari, String adressa, float preu) {
        this.propietari = propietari;
        this.adressa = adressa;
        this.preu = preu;
    }

    // Retorna 'true' si aquest habitatge té el propietari i l'adreça que se li passin
    public boolean equals(String propietari, String Adressa) {
        if(getPropietari().equals(propietari) && getAdressa().equals(Adressa))
            return true;
        return false;
    }

    // Retorna el propietari, l'adreça i el preu de l'habitatge

    @Override
    public String toString() {
        return  "  Propietari: " + propietari + "\n" +
                "  Adressa: " + adressa + "\n" +
                "  Preu: " + preu +"\n";
    }

    public String getAdressa() {
        return adressa;
    }

    public String getPropietari() {
        return propietari;
    }
}
