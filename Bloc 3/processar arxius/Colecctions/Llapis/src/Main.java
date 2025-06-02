import model.*;
import model.objects.Llapis;

import java.util.*;

public class Main {
    static Scanner scan = null;
    public static void main(String[] args) {
        try{
            String opcio = "";
            do {
                opcio = scan.nextLine();
                switch (opcio){
                    case "1":
//                        HashSet
//                        Set<String> nombres = new HashSet<>();
//                        nombres.add("Ana");
//                        nombres.add("Luis");
//                        nombres.add("Ana");  // No se añade otra vez
//                        System.out.println(nombres); // [Ana, Luis]

                        break;
                    case "2":
//                       HashSet
//                        Set<String> hashSet = new HashSet<>();
//                        hashSet.add("Banana");
//                        hashSet.add("Manzana");
//                        hashSet.add("Pera");
//                        System.out.println(hashSet); // Orden impredecible
                        break;
                    case "3":
//                        HashMap
//                        Map<String, Integer> edades = new HashMap<>();
//
//                        edades.put("Ana", 25);
//                        edades.put("Luis", 30);
//                        edades.put("Ana", 28);  // Sobrescribe el valor anterior
//
//                        System.out.println(edades.get("Ana"));  // 28
                        break;
                    case "0":
                        break;
                }

            }while(!opcio.equals("0"));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }finally {
            if(scan != null) scan.close();
        }
    }

    public static void menuEstructura(){
        try{
            String opcio = "";
            do {
                opcio = scan.nextLine();
                switch (opcio){
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "0":
                        break;
                }

            }while(!opcio.equals("0"));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }finally {
            if(scan != null) scan.close();
        }
    }
}
