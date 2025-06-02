import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        try{



//            File ruta = new File("./Arxius/");

//            f1("./Arxius/Graduats.tsv", "./");
//            f1("./Arxius/NotesFinals.tsv", "./");

            System.out.println("El jar no ejecuta porque son funciones no me di cuenta de hacer un do while con todos los ejercicios");
//            TODO: todas las funciones se encuentran en el "Model"
//            TODO: Me falta todo basicamente, tengo hecho de todo un poco...

//            File rutad1 = new File("./ArxiusOriginals");
//            String d1 = "./ArxiusOriginals";
//            File f1 = new File("Graduats.tsv");
//
//            String d2 = "./ArxiusExamen";
//            File f2 = new File("NotesFinals.tsv");
//
////        crearDirectory("./", "ArxiusOriginals");
//        crearDirectory("./", "ArxiusExamen");

//            f3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void veurePos(File ruta) throws IOException {
        System.out.printf(ruta.getCanonicalPath());
    }

}