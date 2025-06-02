package vista;

import java.io.File;
import java.io.IOException;

public class Vista {

    public static void mostraMenu(){
        System.out.print(   "---------------------------------------------------------------------------------\n" +
                            "1. Mostrar informació detallada d'un arxiu o carpeta (no comprovat si existeix)\n" +
                            "2. Mostrar la informació d'un arxiu o carpeta passant-li la ruta en un String.\n" +
                            "3. Mostrar atributs (DHRWX)\n" +
                            "4. DD/MM/AAAA HH:MM\n" +
                            "5. \n" +
                            "0. Sortir\n" +
                            "---------------------------------------------------------------------------------\n");
    }



    /**
     * Aquesta funcio serveix per a comprovar la ruta abosulta a on trobem
     *  ("Si no trobem la ubicacio del arxiu podem utilitzarla per a comprovar on estem")
     */
    public static void mostrarRutaActual(){
        File f = new File(".");
        try {
            System.out.println(f.getCanonicalPath());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
