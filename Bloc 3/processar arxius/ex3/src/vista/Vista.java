package vista;

import model.objectes.Persona;

import java.util.ArrayList;

public class Vista {

    public static void mostrarArrayListP(ArrayList<Persona> dades){
        for (Persona e : dades) {
            System.out.println("----------------------------");
            System.out.println(e);
        }
        System.out.println("----------------------------");
    }
}
