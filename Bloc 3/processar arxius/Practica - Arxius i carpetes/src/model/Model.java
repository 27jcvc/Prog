package model;

import org.apache.commons.io.FileUtils;
import vista.Vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Model {


//TODO: Directoris -----------------------------------------------------------------------
    public static void eliminarCarpeta(File ruta){
        try {
            FileUtils.deleteDirectory(ruta);
        } catch (IOException e) {
            throw new RuntimeException("No s'ha trobat la ruta del arxiu");
        }
    }
    public static void crearCarpetas(File ruta) throws Exception {
        if (!ruta.mkdirs()) throw new Exception("Error al crear els directoris");
    }
    public static void crearCarpeta(File ruta) throws Exception {
        if (!ruta.mkdir()) throw new Exception("Error al crear el directori");
    }

    public static void copiarCarpetas(File rutaAntiga, File rutaNova){
        try {
            FileUtils.copyDirectory(rutaAntiga,rutaNova);

        } catch (IOException e) {
            throw new RuntimeException("Error: No s'ha trobat la ruta");
        }
    }
// TODO...............................................................................

// TODO: Fitxers -------------------------------------------------------------------
    public static void crearFitxersDesdeCarpeta(File ruta, String[] fitxers){
        comprovarExistencia(ruta);

        for (String nomsFitxers : fitxers){
            nomsFitxers += (nomsFitxers.matches(".*\\.stats$")) ? "" : ".stats";
            File fitxer = new File(ruta, nomsFitxers);

            try {
                if (fitxer.createNewFile()) System.out.println("Fitxer "+ nomsFitxers +" creat correctament");
                else System.out.println("L'arxiu " + nomsFitxers + " ja existeix");
            } catch (IOException e) {
                System.out.println("Error al accedir a la ruta");
            }
        }
    }

    public static void mouRenombrarfitxer(File rutaFitxerOrigen, File rutaCarpetaDesti, String nom){
        comprovarExistencia(rutaFitxerOrigen);
        comprovarExistencia(rutaCarpetaDesti);

        nom += (nom.matches(".*\\.stats$")) ? "" : ".stats";

        File fitxer = new File(rutaCarpetaDesti, nom);
        try{
            FileUtils.moveFile(rutaFitxerOrigen, fitxer);
            System.out.println("Arxiu mogut correctament");
        } catch (IOException e) {
            throw new RuntimeException("Error al accedir a la ruta");
        }
    }
// TODO...............................................................................

// TODO: Altres -------------------------------------------------------------------
    public static void comprovarExistencia(File ruta){
        if (ruta.exists());
        try{
            ruta.getCanonicalPath();
        } catch (IOException e) {
            throw new RuntimeException("Error al accedir a la ruta");
        }
    }
    public static String crearArxiu(String rutaArxiu, String nomArxiu){
        File arxiu = new File(rutaArxiu, nomArxiu);
        try {
            if (arxiu.createNewFile()) System.out.println("Fitxer "+ nomArxiu +" creat correctament");
            else System.out.println("L'arxiu " + nomArxiu + " ja existeix");
        } catch (IOException e) {
            throw new RuntimeException("Hubo un problema al acceder a la ruta");
        }
        return rutaArxiu + "/" + nomArxiu;
    }
// TODO...............................................................................




    public static String[][] leerArxiu(File rutaArxiu) throws FileNotFoundException {
        Scanner reader = null;
//        PrintStream writer = null;

            reader = new Scanner(rutaArxiu);

            String linies = "";
            String[] linia;


            while (reader.hasNext()){
                linies += reader.nextLine() + "\n"; // gua
            }

            linia = linies.split("\n");
            int qtLinies = linia.length;

            String[][] camps = new String[qtLinies][];

            for (int i = 0; i < qtLinies; i++) {
                camps[i] = linia[i].split(";");
            }
            return camps;


//        } catch ( FileNotFoundException e) {
////                e.printStackTrace();              // per donar info al programador
//            System.out.println(e.getMessage()); // per donar info al usuari
//
    }


    //        try {
//            reader = new Scanner(rutaArxiu);
//        } catch (FileNotFoundException e) {
//            throw new FileNotFoundException("No s'ha trobat l'arxiu");
//        }
    public static void guardarDadesJugador(){
        String nomJugador;

    }

    public static void mostrarArrayBi(String[][] Array) {
// TODO: Falta mejorar la entrada de datos y comprovacion
        Scanner scan = null;

        try{
            scan = new Scanner(System.in);

            Vista.mostrarMissatge("Introdueix un nom");
            String nom;
            do {
                nom = scan.nextLine();

                if (nom.equals("")){
                    Vista.mostrarMissatge("Has d'introduir un nom.");
                };


                int files = Array.length;
                int columnes = Array[0].length;

                for (int i = 0; i < files; i++) {
                    if (Array[i][1].equals(nom)) {
                        System.out.println("");
                        for (int j = 0; j < columnes; j++) { // fila
                            System.out.printf("%30s:  %s%n", Array[0][j], Array[i][j]);
                        }
                    }
                }
            }while(nom.equals(""));

        } catch (RuntimeException e) {
            Vista.mostrarMissatge(e.getMessage());
        }finally {
            if(scan != null) scan.close();
        }
    }

    public static void guardarDades(String[][] array){

//        TODO: Faltan eliminar los ; de al final de cada linea
        String[] campsAbuscar = {"Player Name", "Special Coins Earned", "Legendary Brawlers Unlocked", "Wins in Special Modes"};

        File arxiu = new File("./Brawlers/SpecialRewards.csv");
        PrintStream writer = null;

        int files = array.length;
        int columnes = array[0].length;

        try{
            writer = new PrintStream(arxiu);

            for (int j = 0; j < columnes; j++) {
                if (array[0][j].equals(campsAbuscar[0]) || array[0][j].equals(campsAbuscar[1]) || array[0][j].equals(campsAbuscar[2]) || array[0][j].equals(campsAbuscar[3])){
                    writer.printf("%n");
                    for (int i = 0; i < files; i++) {
                        writer.printf("%s;",array[i][j]);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }finally {
            if (writer != null) writer.close();
        }

    }
}
