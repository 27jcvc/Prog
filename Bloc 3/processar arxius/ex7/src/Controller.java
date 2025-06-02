import model.Model;
import model.Model.*;
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

//            while(reader.hasNext()){
//
//            }


            String[] linies = new String[3];
            String[][] camps = new String[3][];
            for (int i = 0; i < linies.length; i++) {
                linies[i] = reader.nextLine();
                camps[i] = linies[i].split(";");
//                System.out.println(camps[i][5]);
            }



            for (int i = 0; i < camps[0].length; i++) {
                System.out.print(camps[0][i] + " ");
            }

            System.out.println(" ");






//            int posicion = 0;
//            int notes = 0;
//            int q = 0;
//
//            for (int i = 1; i < camps[1].length; i++) {
//                if (camps[1][i].matches("[1-9]")){
//                    ++q;
//                    System.out.print(" " + q + " ");
//                }else if (camps[1][i].equals("0")) {
//                    // Asegúrate de que hay al menos 3 notas después del "0"
//                    if (i + 3 < camps[1].length) {
//                        int nota1 = Integer.parseInt(camps[1][i + 1]);
//                        int nota2 = Integer.parseInt(camps[1][i + 2]);
//                        int nota3 = Integer.parseInt(camps[1][i + 3]);
//                        int media = (nota1 + nota2 + nota3) / 3;
//                        q= 0;
//                        // Reemplaza el "0" con la media calculada
//                        camps[1][i] = "nota: " + Integer.toString(media);
//                    }
//                }


            int notes = 0;
            int qt= 0;

            for (int i = 0; i < camps[1].length; i++) {
                int mitjana = 0;
                int posicioAntiga = 0;

                if (camps[1][i].equals("0")) {
                    int posicion = 1;
//                    mitjana = notes / qt;
                    camps[1][posicion] = "_";
                    qt = 0;
                    camps[1][i] = "asd";
                }
                if (camps[1][i].matches("[1-9]")) {
                    notes += Integer.parseInt(camps[1][i]);
                    qt++;
                }


                System.out.print (camps[1][i] + " ");
            }



// TODO: Linia 3
//            System.out.println("");
//            for (int i = 0; i < camps[2].length; i++) {
//                System.out.print(camps[2][i] + " ");
//            }





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