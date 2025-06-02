import model.Model;
import model.Model.*;
import vista.Vista.*;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Controller {
    static Scanner reader = null;
    static PrintStream writer = null;

    public static void main(String[] args) {
        File rutaArxiu = new File("./Arxius/arxiu.txt");
        try {
            reader = new Scanner(rutaArxiu);
            writer = new PrintStream(rutaArxiu);

            Model.llistes(writer);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) writer.close();
            if (reader != null) reader.close();
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