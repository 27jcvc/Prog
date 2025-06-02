package model;

import model.objectes.Cordenades;
import model.objectes.Taulell;

public class Model {
    private static final char[][] bosc = new char[20][20];


    /**
     *  funcio per verificar moviment retorna -1 si no el troba
     * @param m moviment
     * @return
     */
    public static boolean verificarMoviment(String m){

    if(!m.isEmpty()){
        return "WASD".indexOf(m.charAt(0)) != -1;
    }
    return false;
}

    public static Cordenades posicioAleatoria(){
        return new Cordenades(1, 18, 1, 18);
    }


    public static char[][] getBosc() {
        return bosc;
    }

//    public static char[][] apareixAsterisc(char[][] _Array_){
//        int files = _Array_.length;
//        int columnes = _Array_[0].length;
//
//       _Array_[files/2][columnes/2] = gal;
//        _Array_[files/2][n] = gal;
//
//        return _Array_;
//    }


//    TODO: Crear comprovarBosc para ver si el objeto esta dentro de el campo de juego
//    public static <object> void comprovarBosc(C){
//        if(objecte){

//        }
//    }
    

//    public static void iniTaulell(Taulell a){
//
//        Taullell b = Joc.getbosc;
//
//        for(int i = 0; i < files; ++i){
//            for (int j = 0; j < columnes; ++j){
//                bosc[i][j] = '-';
//            }
//        }
//    }


}

