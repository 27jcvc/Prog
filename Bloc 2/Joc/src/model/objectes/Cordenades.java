package model.objectes;

import java.util.Random;

public class Cordenades {
    private int columna;
    private int files;

    /**
     * Constructor per defecte: inicialitza fila i columna amb el valor 0.
     */
    public Cordenades() {
        this.columna = 0;
        this.files = 0;
    }

    /** Inicialitza fila i columna amb els valors dels paràmetres.
     * @param fila Coordenada vertical de l'element
     * @param columna Coordenada horitzontal de l'element
     */
    public Cordenades(int fila, int columna){
        this.columna = columna;
        this.files = fila;
    }

    /**
     * Inicialitza la fila i columna de forma aleatòria entre els límits indicats.
     * @param minF Valor mínim de la fila
     * @param maxF Valor màxim de la fila
     * @param minC Valor mínim de la columna
     * @param maxC Valor màxim de la columna
     */
    public Cordenades(int minF, int maxF, int minC, int maxC){
        //        int nombreRandom = (int)(Math.random() * 101);
        Random rand = new Random();
        this.files = rand.nextInt((maxF - minF) + 1) + minF;
        this.columna = rand.nextInt((maxC - minC) + 1) + minC;

    }

    public int getColumna() {
        return columna;
    }

    public int getFiles() {
        return files;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "model.objectes.Cordenades{" +
                "columna=" + columna +
                ", files=" + files +
                '}';
    }
}
