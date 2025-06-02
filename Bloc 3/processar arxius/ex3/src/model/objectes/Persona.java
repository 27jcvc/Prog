package model.objectes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
    String nom;
    String dataNaixement;
    String alçada;
    int edat;

    public Persona(String nom, String dataNaixement, String alçada) {
        this.nom = nom;
        this.dataNaixement = dataNaixement;
        edat = Integer.parseInt(dataNaixement.substring(dataNaixement.length()-4,dataNaixement.length())) - LocalDate.now().getYear();
        this.alçada = alçada;

    }


    @Override
    public String toString() {
        return  nom + '\n' +
                "DataNaixement: " + dataNaixement + '\n'+
                "Edat: " + Math.abs(edat) + "\n" +
                "Alçada: " + alçada;
    }

//    Michael Jordan
//    Data de naixement: 17/02/1963
//    Edat aproximada: 59 anys
//    Altura: 1.98 metres
}



