

import model.*;
import vista.*;

import java.io.File;

public class Controller {

    public static void main(String[] args){
//        File rutaArxiu = new File("./Brawlers/Brawlers.txt");

        try {
//            String linies = "";
//            String[] linia;
//            utilitzarReader(rutaArxiu);
//            while (reader.hasNext()){
//                linies += reader.nextLine();
//            }



//            linia = linies.split("\"");
//            TODO: Ex 6 ...............................................................
//            String[] paraules = linia[4].split(" ");
//
//            System.out.printf("%s%8s%d%n","Paraules totals: " , "- ", paraules.length);
//            System.out.println("Paraules amb majúscula: ");
//            for (String e : paraules){
//                if (e.matches("^[A-Z].*")){
//                    System.out.printf("%25s%s%n"," - ", e);
//                }
//            }
//            TODO: ----------------------------------------------
//            TODO: Ex 7 ...............................................................
//            String rutaA = Model.crearArxiu("./", "BrawlerInfo");
//            PrintStream writer = new PrintStream(rutaA);
//            writer.println(linia[1]);
//
//            String rutaB = Model.crearArxiu("./", "BrawlerResum");
//            PrintStream resum = new PrintStream(rutaB);
//
//            for (int i = 2; i < linia.length; i++) {
//                resum.printf("%s%n",linia[i]);
//            }

//            TODO: ----------------------------------------------
//            TODO: Ex 8 ...............................................................
//            String[] paraules = linies.split(" ");
//            int qt = 0;
//            String pos = "";
//            for (int i = 0; i < paraules.length; ++i){
//
//                if (paraules[i].equals("Super")){
//                    pos = String.valueOf(i);
//                    ++qt;
//                }
//            }
//            System.out.printf("%s%d%n", "Total vegades: ", qt);
//            System.out.printf("%s%s%n", "Linies: ", String.join(",", pos.split("")));


//            TODO: ----------------------------------------------
//            TODO: Ex 9 ...............................................................

//            File rutaArxiu = new File("./Brawlers/Rewards.csv");
//            String linies = "";
//
//
//            String[][] camps = Model.leerArxiu(rutaArxiu);
//
//            Model.mostrarArrayBi(camps);
////            Model.guardarDades(camps);

//            TODO: ----------------------------------------------
//            TODO: Ex 10 ...............................................................
//            Model.crearArxiu("./Brawlers/", "SpecialRewards.csv");
            File rutaArxiu = new File("./Brawlers/Rewards.csv");
            String[][] camps = Model.leerArxiu(rutaArxiu);

//            Model.mostrarArrayBi(camps);

            Model.guardarDades(camps);

//            TODO: ----------------------------------------------

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}