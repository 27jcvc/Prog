package model;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Model {

    /**
     * Mediante una ruta origen de tipo string detecta si existe o no
     * despues copia el fichero a la carpeta destino el fichero tiene que estar incluido en la ruta,
     * ya que pense que seria una buena praxis incluir todos los archivos del directorio pero no encontre la manera.
     * @param rutaOrigen
     * @param rutaDesti
     */
    public static void f1(String rutaOrigen, String rutaDesti){

        try {
            File origen = new File(rutaOrigen);
            File desti = new File(rutaDesti);
//            origen.getCanonicalPath();
            if(!origen.exists()) System.out.println("Carpetes origen no existeix");
            if(!desti.exists()) System.out.println("Carpetes destí no existeix");
            FileUtils.copyFileToDirectory(origen,desti);
            System.out.printf("%s%s%n", "Arxiu mogut correctament: ",origen);

        } catch (IOException e) {
            throw new RuntimeException("Error: No s'ha trobat la ruta");
        }
    }

    /**
     * Crea un directorio mediante la ruta y el nombre que le queremos dar
     * @param ruta
     * @param nom
     */
    public static void crearDirectory(String ruta, String nom){
        File d = new File(ruta, nom);
        try{
            d.mkdir();
            System.out.println("Directori creat correctament.");
        } catch (Exception e) {
            System.out.println("No s'ha pogut accedir a la ruta");
        }
    }


    /**
     * Me faltan bastantes cosas la verdad...
     *
     * @param rutaCarpeta
     * @throws Exception
     */
    public static void f2(File rutaCarpeta) throws Exception {
        if(!rutaCarpeta.exists()){
            throw new Exception("El directori no existeix");
        }

        File arxiuNou = new File("./.", "resum_carpetes.txt");

        PrintStream writer = null;
        try{
            writer = new PrintStream(arxiuNou);

            System.out.println(rutaCarpeta.getAbsoluteFile());

            if (rutaCarpeta.isFile()){
                String r = rutaCarpeta.getAbsolutePath();

                writer.println( "Nom: " +  rutaCarpeta.getName() +
                        "Extensio: " + r.substring(r.length() - 3, r.length()) +
                        "Mida: " + rutaCarpeta.getUsableSpace());

            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }finally {
            if (writer != null) writer.close();
        }


    }

    /**
     * tuve problemas a la hora de acceder a el array bidimensional y decidi pasar al siguiente ejercicio
     * lo mismo con los anteriores.
     * @throws FileNotFoundException
     */
    public static void f3() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Scanner reader = null;
        String any = "";
        System.out.println("Introdueix un any");
        do {
            any = scan.nextLine();

            String linia = "";

            File rutaArxiu = new File("./Arxius/Graduats.tsv");

            reader = new Scanner(rutaArxiu);
            while(reader.hasNext()){
                linia += reader.nextLine();
//            System.out.println(reader.nextLine());
            }
            int qtLinies = linia.length();

            String camps[][] = new String[qtLinies][];

            for (int i = 0; i < linia.length(); i++) {
                camps[i] = linia.split("\t");
            }

            for (int i = 0; i < camps.length; i++) {
                for (int j = 0; j < camps[0].length; j++) {
                    System.out.print(camps[i][j] + " ");
                }
            }

        }while(!any.equals("9999"));


    }

    /**
     * tuve problemas a la hora de acceder a el array bidimensional y decidi pasar al siguiente ejercicio
     * lo mismo con los anteriores.
     * @param rutaArxiu
     */
    public static void f4(File rutaArxiu){

        Scanner reader = null;
        PrintStream writer = null;

        try{
            writer = new PrintStream(rutaArxiu);
            reader = new Scanner(rutaArxiu);
            String linia = "";
            while(reader.hasNext()){

                linia += reader.nextLine();
//            System.out.println(reader.nextLine());
            }
            int qtLinies = linia.length();

            String camps[][] = new String[qtLinies][];

            for (int i = 0; i < linia.length(); i++) {
                camps[i] = linia.split("\t");
            }


        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if(reader != null) reader.close();
            if(writer != null) writer.close();
        }


    }
}
