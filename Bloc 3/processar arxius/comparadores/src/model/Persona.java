package model;

import java.util.Comparator;

public class Persona implements Comparable<Persona> {

    public static Comparator<Persona> comparadorPorNomYCognom;
    public static Comparator<Persona> comparePerNom;
    public static Comparator<Persona> comparadorPorEdat;
    public static Comparator<Persona> comparePerEdat;

    String nom;
    String cognom;
    public int edat;

    public Persona(String cognom, int edat, String nom) {
        this.cognom = cognom;
        this.edat = edat;
        this.nom = nom;
    }


    @Override
    public int compareTo(Persona o) {
        return 0;
    }

    public int comparePerNom(Persona o) {
        return this.nom.compareTo(o.nom);
    }

    public static Comparator<Persona> comparatorPorNom =
            (p1, p2) -> p1.nom.compareTo(p2.nom);

    public int comparePnomCognom(Persona n, Persona c) {
        if (this.nom.equals(n.nom)){
            return this.cognom.compareTo(c.cognom);
        }
        return this.nom.compareTo(n.nom);
    }

    /**
     * Solo si son enteros
     * @param e
     * @return
     */
    public int comparePerEdat(Persona e) {
        return this.edat - e.edat;
    }
    @Override
    public String toString() {
        return nom + " " + cognom + " (" + edat + " años)";
    }

}
