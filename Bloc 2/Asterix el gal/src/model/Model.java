package model;

public class Model {
    private static final String[][] bosc = new String[20][20];

    static String gal = "*";

    public static void mostraBosc(String[][] _Array_){
        int files = _Array_.length;
        int columnes = _Array_[0].length;
        String missatge = "";
        int contador = 0;

        for(int i = 0; i < files; ++i){
            for (int j = 0; j < columnes; ++j){
                missatge += _Array_[i][j];
                missatge += "   ";

                contador++;
                if ((contador % 20) == 0) {
                    missatge += "\n";  // Cada 20 elementos, salto de línea
                }
                //                missatge += ((missatge.length() % 21) == 0) ? "\n" : "";
            }
        }
        System.out.println(missatge);
    }

    public static String[][] crearBosc(String[][] _Array_){
        int files = _Array_.length;
        int columnes = _Array_[0].length;

        for(int i = 0; i < files; ++i){
            for (int j = 0; j < columnes; ++j){
                _Array_[i][j] = "-";
            }
        }
        return _Array_;
    }

    public static String[][] getBosc() {
        return bosc;
    }

    public static String[][] apareixAsterisc(String[][] _Array_){
        int files = _Array_.length;
        int columnes = _Array_[0].length;

        _Array_[files/2][columnes/2] = gal;

        return _Array_;
    }
}
