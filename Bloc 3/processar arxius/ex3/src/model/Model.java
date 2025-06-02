package model;

import model.objectes.Persona;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    public static String[] separarCamps(String l, String s){
        String[] contingut =  l.split(s);
        return contingut;
    }

    public static String llegirReader(File rutaArxiu, Scanner reader){
        String linia = "";
        String linies = "";

        while(reader.hasNext()){
            linia = reader.nextLine();
            linies += linia + "\n";
        }

        return linies;
    }

    public static ArrayList<Persona> retornarPersones(File rutaArxiu, Scanner reader) {
        ArrayList<Persona> persones = new ArrayList<>();
        String[] linies = llegirReader(rutaArxiu, reader).split("\n");

        for (int i = 0; i < linies.length; i++) {

            String[] linia;

            linia = separarCamps(linies[i], ";");

            String nom = linia[0]; // nom
            String dataNaixement = linia[1]; // data
            String alçada = linia[2];   // alçada

            persones.add(new Persona(nom, dataNaixement, alçada));
        }
        return persones;

    }
}

