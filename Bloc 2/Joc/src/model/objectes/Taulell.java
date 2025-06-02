package model.objectes;

import model.*;

/**
 * Classe per gestionar l'àrea de joc.
 */
public class Taulell {

    private static char[][] taulell; // Caselles amb l'àrea de joc
    private static int columnes; // Nombre de files que té l'àrea de joc
    private static int files;  // Nombre de columnes que té l'àrea de joc

    /**
     * Constructor per inicialitzar els atributs de l'àrea de joc.
     * @param columnes
     * @param files
     */
    public Taulell(int files, int columnes) {
        this.columnes = columnes;
        this.files = files;
        this.taulell = new char[files][columnes];
    }


    public static void init(Pocio p, Jugador jug, Enemic[] enemics){

        jug.setCoord(Model.posicioAleatoria());
        p.setCoord(Model.posicioAleatoria());

//        inicializar array
        for(int i = 0; i < files; ++i){
            for (int j = 0; j < columnes; ++j){
                taulell[i][j] = '-';
            }
        }

        //  Enemics
        for (int i = 0; i < enemics.length; i++) {
            enemics[i] = new Enemic('l', Model.posicioAleatoria());
            enemics[i].setEnergia(1);
            enemics[i].setVelocitat(1);

            taulell[enemics[i].getCoord().getFiles()][enemics[i].getCoord().getColumna()] = '&';

//            System.out.print("enemicsss: " + eF + " " + eC);

        }

//        model.objectes.Jugador
        int fJugador = jug.getCoord().getFiles();
        int cJugador = jug.getCoord().getColumna();

//        Pocions
        int fPocio = p.getCoord().getFiles();
        int cPocio = p.getCoord().getColumna();



        taulell[fPocio][cPocio] = '8';
        taulell[fJugador][cJugador] = '*';


    }

    /**
     * Dibuixa l'àrea de joc
     */
    public static void dibu(){
        String missatge = "";
        int contador = 0;

        for(int i = 0; i < files; ++i){
            for (int j = 0; j < columnes; ++j){
                missatge += taulell[i][j];
                missatge += "   ";

                contador++;
                if ((contador % files) == 0) {
                    missatge += "\n";  // Cada 20 elementos, salto de línea
                }
                //                missatge += ((missatge.length() % 21) == 0) ? "\n" : "";
            }
        }
        System.out.println(missatge);
    }

    public static void setTaulell(char[][] taulell) {
//            model.objectes.Taulell.taulell[getFiles()][getColumnes()] = taulell;
        Taulell.taulell = taulell;
    }


    public static int getColumnes() {
        return columnes;
    }

    public static char[][] getTaulell() {
        return taulell;
    }

    public static int getFiles() {
        return files;
    }

}




//    public static void mostraBosc(char[][] _Array_){
//        int files = _Array_.length;
//        int columnes = _Array_[0].length;
//        String missatge = "";
//        int contador = 0;
//
//        for(int i = 0; i < files; ++i){
//            for (int j = 0; j < columnes; ++j){
//                missatge += _Array_[i][j];
//                missatge += "   ";
//
//                contador++;
//                if ((contador % 20) == 0) {
//                    missatge += "\n";  // Cada 20 elementos, salto de línea
//                }
//                //                missatge += ((missatge.length() % 21) == 0) ? "\n" : "";
//            }
//        }
//        System.out.println(missatge);
//    }
//}
