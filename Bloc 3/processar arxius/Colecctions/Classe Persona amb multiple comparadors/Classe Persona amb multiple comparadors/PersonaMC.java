import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PersonaMC implements Comparable<PersonaMC> {
    private String nom;
    private int edat;

    public PersonaMC(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                '}';
    }

    @Override
    public int compareTo(PersonaMC o) {
        if(this.edat < o.getEdat()) return 1;
        else if(this.edat > o.getEdat()) return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (!(p instanceof PersonaMC)) return false;

        PersonaMC persona = (PersonaMC) p;

        return  getNom() == persona.getNom();
    }

    static final Comparator<PersonaMC> by_NOM =
            new Comparator<PersonaMC>() {
                @Override
                public int compare(PersonaMC o1, PersonaMC o2) {
                    return o1.getNom().length() - o2.getNom().length();
                }
            };
    static final Comparator<PersonaMC> by_EDAT =
            new Comparator<PersonaMC>() {
                @Override
                public int compare(PersonaMC o1, PersonaMC o2) {
                    return o1.getEdat() - o2.getEdat();
                }
            };
}
