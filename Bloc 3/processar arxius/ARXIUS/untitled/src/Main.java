import vista.Vista;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String input;
    public static void main(String[] args) {
        do {
            Vista.mostraMenu();
            input = introText("");
            switch(input) {
                case "1":
                    File objecte = new File("./Proves/arxiu.txt"); // objecte de tipus File
                    mostrarInfoArxiuNoComprovat(objecte);
                    break;
                case "2":
                    mostrarInfoArxiuComprovat("./Proves");
                    break;
                case "3":
                    mostrarInfoArxiu("./Proves/arxiu.txt");
                    break;
                case "4":
                    mostrarDataFormatada("./Proves/arxiu.txt");
                    break;
                case "5":
                    break;
                case "0":
                    break;
            }
        }while(!input.equals("0"));
    }

    /**
     * Ex1
     * @param arxiu
     */
    public static void mostrarInfoArxiuNoComprovat(File arxiu){
        System.out.println("\nPath:       " + arxiu);
        System.out.println("Hidden:       " + arxiu.isHidden());
        System.out.println("Read:         " + arxiu.canRead());
        System.out.println("Write:        " + arxiu.canWrite());
        System.out.println("Execute:      " + arxiu.canExecute());
        System.out.println("File:         " + arxiu.isFile());
        System.out.println("Directory:    " + arxiu.isDirectory());
        System.out.println("Length:       " + arxiu.length());
        System.out.println("LastModified: " + arxiu.lastModified());
        Date d = new Date(arxiu.lastModified());
        System.out.println("LastModified: " + d.toString());
    }

    public static void mostrarInfoArxiuComprovat(String pRuta){
        Vista.mostrarRutaActual();
        File ruta = new File(pRuta);
        System.out.println("Exists:       " + (ruta.exists() ? "Si" : "No"));
        if (!ruta.exists()) return;
        if(ruta.isFile()) System.out.println("File:         " + ruta.isFile());
        else System.out.println("Directory:    " + ruta.isDirectory());
        System.out.println("Path:       " + ruta);
        System.out.println("Hidden:       " + ruta.isHidden());
        System.out.println("Read:         " + ruta.canRead());
        System.out.println("Write:        " + ruta.canWrite());
        System.out.println("Execute:      " + ruta.canExecute());
        System.out.println("Length:       " + ruta.length());
        System.out.println("LastModified: " + ruta.lastModified());
        Date d = new Date(ruta.lastModified());
        System.out.println("LastModified: " + d.toString());
    }

    public static void mostrarInfoArxiu(String pRuta){
        Vista.mostrarRutaActual();
        File ruta = new File(pRuta);
        String atributs = "";

        System.out.println("Exists:       " + (ruta.exists() ? "Si" : "No"));
        if (!ruta.exists()) return;
        atributs += (ruta.isDirectory()) ?  "D" : "-";
        atributs += (ruta.isHidden()) ?     "H" : "-";
        atributs += (ruta.canRead()) ?      "R" : "-";
        atributs += (ruta.canWrite()) ?     "W" : "-";
        atributs += (ruta.canExecute()) ?   "X" : "-";
        System.out.println("Attribs:      " + atributs);
        System.out.println("Path:         " + ruta);
        System.out.println("Length:       " + ruta.length());
        System.out.println("LastModified: " + ruta.lastModified());
    }

    public static void mostrarDataFormatada(String pRuta){
        Vista.mostrarRutaActual();
        File ruta = new File(pRuta);

        System.out.println("Exists:       " + (ruta.exists() ? "Si" : "No"));
        if (!ruta.exists()) return;

        System.out.println("Path:         " + ruta);
        System.out.println("Length:       " + ruta.length());

        Date d = new Date(ruta.lastModified());
        int day = d.getDate();
        int month = d.getMonth() + 1;  // se le suma 1 porque "0" representa january
        int year = d.getYear() + 1900; // se le suma "1900" porque getyear retorna el "año - 1900"

        int hours = d.getHours();
        int minutes = d.getMinutes();

//        System.out.println("Date:         " + day + "/" + ((month < 10) ? "0" + month : month) + "/" + year + " " + hours + ":" + minutes);
        System.out.printf("Date:         %02d/%02d/%d %02d:%02d%n", day, month, year, hours, minutes);
        // todo: ver si se puede hacer con RegEx
        System.out.println("LastModified: " + d.toString());
    }

    public static String introText(String m){
        System.out.println(m);
        return scan.nextLine();
    }
}