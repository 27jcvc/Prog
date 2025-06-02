import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Controller {
    static Scanner reader = null;
    static PrintStream writer = null;
    public static void main(String[] args) {
        try {





        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            if(writer != null) writer.close();
            if(reader != null) reader.close();
        }

    }


    public static void ex1(){
//    File f = new File("Fitxers/arxiu.txt");
////    reader = new Scanner(f);
//    String linia = "";
//    String[] contingut;
//    String liniaActual;
//    String[] paraules = new String[20];
//    while(reader.hasNext()){
//        liniaActual = reader.nextLine();
//        if(liniaActual.contains("---")) break;
//
//        linia += liniaActual + "\s";
//    }
//
//    contingut = linia.split(" ");
////            for(String e : contingut){
////                System.out.println(e);
////            }
//
//    for(int i = 0; i < Integer.parseInt(contingut[0]); ++i){
//        paraules[i] = contingut[i+1];
//        if(paraules[i].length() > 5) System.out.println(paraules[i]);
    }
}




//            writer.print(0);
//            for (int i = 0; i < f.length(); ++i) {
////            writer.print(" " + i);
//
//             }