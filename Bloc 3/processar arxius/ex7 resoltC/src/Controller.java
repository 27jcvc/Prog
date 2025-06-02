import model.Model;
import model.Model.*;
import vista.Vista;
import vista.Vista.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Controller {
    static Scanner reader = null;
    static PrintStream writer = null;

    public static void main(String[] args){
        File rutaArxiu = new File("./Arxius/arxiu.csv");

        try {
            introduirReader(rutaArxiu);



            String[] linies = new String[3];
            String[][] camps = new String[3][];
            for (int i = 0; i < linies.length; i++) {
                linies[i] = reader.nextLine();
                camps[i] = linies[i].split(";");
//                System.out.println(camps[i][5]);
            }

            //TODO: linia 1
            int posicion = 0;
            int notes = 0;
            int q = 1;
            int filesTotal = camps.length;

            for (int i = 1; i < camps[2].length; i++) {
                if (camps[1][i].matches("[1-9]")){
                    ++q;
                }else if (camps[1][i].equals("0")) {
                    // Asegúrate de que hay al menos 3 notas después del "0"
                    if (i + 3 < camps[1].length) {
                        int nota1 = Integer.parseInt(camps[1][i + 1]);
                        int nota2 = Integer.parseInt(camps[1][i + 2]);
                        int nota3 = Integer.parseInt(camps[1][i + 3]);
                        int media = (nota1 + nota2 + nota3) / 3;
                        if (q == filesTotal) break;


                        // Reemplaza el "0" con la media calculada
                        camps[1][i] = (nota1 < 5 || nota2 < 5 || nota3 < 5) ? "---" : Integer.toString(media);
                    }
                }



            }
            Vista.dadesOrdenades(camps);






                System.out.println(" ");







        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (writer != null) writer.close();
            if (reader != null) reader.close();
        }

    }
    public static void introduirReader(File rutaArxiu) throws FileNotFoundException {
        try {
            reader = new Scanner(rutaArxiu);
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("No s'ha trobat l'arxiu");
        }
    }
    public static int parseWithDefault(String number, int defaultVal) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }


//    String[] linies = new String[4];
//    String[] linia;
//            while(reader.hasNext()){
//        for (int i = 0; i < linies.length; i++) {
//            linies[i] = reader.nextLine(); // 4
//        }
//    }
//
//
//            for (String e : linies){
//        System.out.println(e);
//    }

}