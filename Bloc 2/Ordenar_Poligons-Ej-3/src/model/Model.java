package model;

import model.objectes.*;

import java.util.Arrays;

public class Model {
    private static Poligon[] array = new Poligon[10];

    public static void organitzarArr(){
//        setArray(Arrays.sort(getArray()));
        Arrays.sort(getArray());
    }

    public static Poligon[] getArray() {
        return array;
    }

    public void setArray(Poligon[] array) {
        this.array = array;
    }


}
