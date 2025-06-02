import model.Model;
import vista.*;

import java.util.Scanner;


public class Sapamercat {
    static Scanner scan = null;
    static String opcio = "";
    public static void main(String[] args) {

    try {
        do {
            scan = new Scanner(System.in);

            Vista.mostrarMenuPrincipal();
            opcio = scan.nextLine();
            switch (opcio){
                case "1":
//                    menuProductes(opcio, scan);
                    menuProductes();
//                    String nom = scanearLinia(scan,"Introdueix el nom: ");
//                    int preu = Integer.parseInt(scanearLinia(scan,"Introdueix el preu: "));
//                    String codiDeBarres = scanearLinia(scan,"Introdueix el codi de barres: ");
//                    String data = scanearLinia(scan,"Introdueix el codi de barres: ");



//                    Model.introduirProducteAlimentacion(nom, preu, codiDeBarres, data);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    if (!opcio.equals("0")) System.out.println("Opcion incorrecta");
            }



        }while (!opcio.equals("0"));
    } catch (Exception e) {
        throw new RuntimeException(e);
    }finally {
        if (scan != null) scan.close();
    }
    }


    public static void menuProductes(){
        Vista.mostrarMenuProducte();
        do {
            opcio = scan.nextLine();
            switch (opcio) {
                case "1":
//                String nom =
                    System.out.print("Introdueix el nom: ");
                    String nom = scan.next();
//                Model.introduirProducteAlimentacion();
                    break;
                case "2":
//                Model.introduirProducteTextil();
                    break;
                case "3":
//                Model.introduirProducteElectronica();
                    break;
                default:
                    if (!opcio.equals("0")) System.out.println("Opcion incorrecta");
                }
            }while (!opcio.equals("0"));

    }

    public static String scanearLinia(Scanner scan, String m){
        Vista.mostrarMissatge(m);
         return scan.nextLine();
    }
}