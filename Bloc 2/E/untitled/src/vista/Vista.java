package vista;

import model.objectes.Habitatge;

import java.util.ArrayList;

public class Vista {

    // Mostrar les dades dels habitatges que se li passin en una llista
    public static void mostrarHabitatges(ArrayList<Habitatge> a) {
        for(Habitatge e : a){
            System.out.println(e);
        }
    }

    // Mostrar el missatge que se li passi en un string
    public static void mostrarMissatge(String missatge) {
        System.out.println(missatge);
    }

}
