import model.Model;
import model.objectes.Persona;
import vista.Vista;

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

            // comença a iterar sobre el reader
            ArrayList<Persona> dades = Model.retornarPersones(rutaArxiu, reader);
            Vista.mostrarArrayListP(dades);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) writer.close();
            if (reader != null) reader.close();
        }

    }



}