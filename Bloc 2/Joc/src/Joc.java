import model.Model;
import model.objectes.*;

import java.util.Scanner;


public class Joc {
    static final int COLUMNES = 20;
    static final int FILES = 20;

    private static Taulell bosc = new Taulell(FILES,COLUMNES);
    private static Jugador asterix = new Jugador('j', Model.posicioAleatoria());

    private static boolean fi;
    private static Enemic[] legionaris = new Enemic[6];
    private static Pocio pocio = new Pocio('p', Model.posicioAleatoria());
    static Scanner scan = new Scanner(System.in);
    static String moviment;

//   TODO: Controlador
    public static void main(String[] args) {
        bosc.init(pocio, asterix, legionaris);
        do {
            bosc.dibu();
            moviment = introText("  W  \n" + "A S D").toUpperCase();
            mouJugador();
            mouEnemics();
            if(capturat(asterix.getCoord())){
                bosc.dibu();
                System.out.print("Joc terminat \n");
                return;
            }
        }while(!moviment.equals("0"));
    }

/// Funciones
    static String introText(String missatge) {
        System.out.print(missatge + ": ");
        return scan.nextLine();
    }



    static boolean mouJugador(){
        //         TODO: Comprovar que el jugador no surti del camp de joc
        int files = asterix.getCoord().getFiles(); int col = asterix.getCoord().getColumna();
        char[][] t = bosc.getTaulell();

            if(Model.verificarMoviment(moviment)){
                t[files][col] = '-';
                moviment = String.valueOf(moviment.charAt(0));
            }


        switch (moviment){
            case "W":
                asterix.mouU();
                if(!comprovarUbi(asterix.getCoord())){
                    System.out.print("xd");
                    break;
                }
                files = asterix.getCoord().getFiles(); col = asterix.getCoord().getColumna();
                t[files][col] = '*';
                Taulell.setTaulell(t);
                break;
            case "S":
                asterix.mouD();
                if(!comprovarUbi(asterix.getCoord())){
                    System.out.print("xd");
                    break;
                }
                files = asterix.getCoord().getFiles(); col = asterix.getCoord().getColumna();
                t[files][col] = '*';
                Taulell.setTaulell(t);
                break;
            case "A":
                asterix.mouL();
                if(!comprovarUbi(asterix.getCoord())){
                    System.out.print("xd");
                    break;
                }
                files = asterix.getCoord().getFiles(); col = asterix.getCoord().getColumna();
                t[files][col] = '*';
                Taulell.setTaulell(t);
                break;
            case "D":
                asterix.mouR();
                if(!comprovarUbi(asterix.getCoord())){
                    System.out.print("xd");
                    break;
                }
                files = asterix.getCoord().getFiles(); col = asterix.getCoord().getColumna();
                t[files][col] = '*';
                Taulell.setTaulell(t);
                break;

        }

        return true;

    }

    static void mouEnemics(){
        char[][] t = bosc.getTaulell();
        Cordenades cJug = asterix.getCoord();

        for(Enemic l : legionaris){
            Cordenades cL = l.getCoord();
            Cordenades cJ = asterix.getCoord();

            int dF = Integer.compare(cJ.getFiles(), cL.getFiles());
            int dC = Integer.compare(cJ.getColumna(), cL.getColumna());

            int novaFila = cL.getFiles() + dF;
            int novaCol = cL.getColumna() + dC;

            t[cL.getFiles()][cL.getColumna()] = '-';
            t[novaFila][novaCol] = '&';
            l.setCoord(new Cordenades(novaFila, novaCol));

            System.out.print("c Legionari: " + l.getCoord() + "\n");
        }

        System.out.print("c model.objectes.Jugador: " + cJug + "\n");

        bosc.setTaulell(t);

    }

    public static boolean capturat(Cordenades cJug){
        for(Element e : legionaris){
            Element l = e;
            if(cJug.getFiles() == l.getCoord().getFiles() && cJug.getColumna() == l.getCoord().getColumna()){
                return true;
            }
        }
        return false;
    }

    //         TODO: Comprovar que el jugador no surti del camp de joc

    public static boolean comprovarUbi(Cordenades ubi){
        int minF = 1;               // valor minim de la fila
        int maxF = FILES - 1;       // valor maxim de las filas
        int minC = 1;               //valor minim de las columnas
        int maxC = COLUMNES - 1;    // valor maxim de las columnas

        int fActual = ubi.getFiles();
        int cActual = ubi.getColumna();
//                   if   (fActual < minF) return false;
//                else if (fActual >= maxF) return false;
//                else if (cActual <= minC) return false;
//                else if (cActual >= maxC) return false;

        if (fActual <= minF || fActual >= maxF) return false;
        if (cActual <= minC || cActual >= maxC) return false;

        return true;
    }



//    Getters y setters

    public static void setBosc(Taulell bosc) {
        Joc.bosc = bosc;
    }

    public static Taulell getBosc() {
        return bosc;
    }

}
