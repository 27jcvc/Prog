package model;

import model.objectes.*;

import java.util.ArrayList;

public class Model {

    private static ArrayList<Recurs> recursos = new ArrayList<>();

    public static ArrayList<Recurs> getRecursos() {
        return recursos;
    }

    public static void setRecursos(ArrayList<Recurs> recursos) {
        Model.recursos = recursos;
    }
}
