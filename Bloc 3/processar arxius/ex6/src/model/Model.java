package model;

import java.io.PrintStream;
import java.util.*;

public class Model {

    public static void llistes(PrintStream writer){
        final List<String> mMatricula =  new ArrayList<>();
        final List<Float> mImport = new ArrayList<>();
        final List<String> mControlador = new ArrayList<>();
        final List<String> mDescripcio = new ArrayList<>();

        Collections.addAll(mMatricula,"1234ABC", "5678DEF", "4321FED", "8765CBA", "1029ASD", "4321FED", "1029ASD", "1234ABC", "6939JKL", "2513XYZ");
        Collections.addAll(mImport, 30.5f, 50.8f, 60f, 40f, 30.5f, 60f, 35f, 46.3f, 29.9f, 99.99f);
        Collections.addAll(mControlador, "Pau Gasoil", "Mireia del Monte", "Andres Lasiesta", "Mireia del Monte", "Andres Lasiesta", "Andres Lasiesta", "Mireia del Monte", "Pau Gasoil", "Andres Lasiesta", "Mireia del Monte");
        Collections.addAll(mDescripcio, "Mal aparcat", "No ha passat la ITV", "Bloqueja un vado permanent", "Sense ticket", "Ticket caducat", "No m’agrada el color", "Ocupa doble espai", "Ocupa plaça de minusvàlid", "Pujat sobre la vorera", "Aparcat en diagonal!");

        float total = 0;

        for (int i = 0; i < mMatricula.size(); i++) {
            total += mImport.get(i);
            double descompte = mImport.get(i) - (mImport.get(i) * 0.20);

            /// %s String
            /// %n Salt de linia
            /// %.2f 2 caracters d'un float
            /// %% Posar simbolo de porcentaje
            writer.println("-".repeat(60));
            writer.printf( "Operari: %s%n", mControlador.get(i));
            writer.printf( "Matricula: %s-%s%n", mMatricula.get(i).substring(0,4), mMatricula.get(i).substring(4));
            writer.printf( "Import: %.2f%n", mImport.get(i));
            writer.printf( "* Import amb dte (20%%): %.2f%n", descompte);
            writer.printf( "Infraccio: %s%n", mDescripcio.get(i));
            writer.printf( "(*) Es descomptarà un 20%% si es paga abans de 30 dies.%n");


//            System.out.println( "Operari: " + mControlador.get(i) + '\n' +
//                                "Matricula: " + mMatricula.get(i) + '\n'+
//                                "Import: " + mImport.get(i) + '\n'+
//                                "* Import amb dte (20%): " + descompte + '\n' +
//                                "Infraccio: " + mDescripcio.get(i) + '\n' +
//                                "(*) Es descomptarà un 20% si es paga abans de 30 dies." + '\n');
        }
        writer.println("-".repeat(60));
        writer.printf("Total import multes: %.2f\n", total);
        writer.println("-".repeat(60));
    }

    private static float getTotal() {
        float total = 0;
        return total;
    }
}
