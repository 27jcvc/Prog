package vista;

public class Vista {

    public static void dadesOrdenades(String[][] arrayBi){
        int col = arrayBi.length - 1;
        int files = arrayBi[0].length;

        for (int i = 0; i < files; i++) {
            System.out.printf("%12s: %s%n", arrayBi[0][i], arrayBi[1][i]);

        }

        for (int i = 0; i < arrayBi[0].length; i++) {
            System.out.printf("%12s: %s%n", arrayBi[0][i], arrayBi[col][i]);
        }
    }
}
