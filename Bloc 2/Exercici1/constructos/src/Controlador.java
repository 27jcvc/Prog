import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Controlador {
    public static Scanner scan = new Scanner(System.in);
    static String opcioInt = "";
    public static void main(String[] args) {
        do {
            try {
                Vista.mostrarMenu();
                opcioInt = scan.nextLine();
                switch (opcioInt) {
                    case "1":
                        menuPersona();
                        break;
                    case "2":
                        menuProductes();
                        break;
                    case "0":
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        Vista.mostrarMenu();
                }
            }catch (NumberFormatException e) {
                System.out.println("ERROR!:  Se esperaba un numero");
            }catch (Exception e) {
                System.out.println(e.getMessage()) ;
            }
        } while (!opcioInt.equals("0"));
    }


        static void menuPersona() throws Exception {
            Vista.mostrarMenuPersona();
            opcioInt = scan.nextLine();
            switch (opcioInt) {
                case "1": // Afegir Persones
                    String nom = introText("Introdueix el nom");
                    String edat = introText("Introdueix la edat");
                    Model.afegirPersona(nom, Integer.parseInt(edat));
                    break;
                case "2": // Modificar Persona
                    String nomSel = introText("Introdueix el nom");
                    String nomNou = introText("Introdueix el nou nom");
                    String edatNova = introText("Introdueix la edat nova");
                    Model.modificarPersona(nomSel, nomNou, Integer.parseInt(edatNova));
                    break;
                case "3": // Esborrar Persona
                    String nomE = introText("Introdueix el nom de la persona que vols esborrar");
                    Model.esborrarPersona(nomE);
                    break;
                case "4": // Mostrar Persones
                    Model.mostrarPersones();
                    break;
                case "5": // Filtrar Persones de 18 Anys
                    Model.filtrarAnys();
                    break;
                case "0": // Tornar
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }
        }

        static void menuProductes () throws Exception {
            Vista.mostrarMenuProductes();
            opcioInt = scan.nextLine();
            switch (opcioInt) {
                case "1":
                    System.out.println("Nom producte: ");
                    String nomProducte = scan.nextLine().trim();
                    System.out.println("Descripcio: ");
                    String descProducte = scan.nextLine().trim();
                    System.out.println("Preu: ");
                    String preuProducte = scan.nextLine().trim().replace(",", ".");
                    Model.afegirProducte(nomProducte, descProducte, Float.parseFloat(preuProducte));
                    break;
                case "2":
                Vista.menuModificarProducte();
                String cAm = introText("Introdueix el que vols modificar");
                String cMod = introText("Introdueix el nom del contingut");
                String cModificat = introText("Introdueix com el vols modificar:");
                Model.modificarProductes(cAm,cMod, cModificat);
                    break;
                case "3":
                    String nomProducteS = introText("Nom producte: ").trim();
                    String nomProducteMod = introText("Nom: ").trim();
                    String descProducteMod = introText("Descripcio: ").trim();
                    String preuProducteMod = introText("Preu: ").trim().replace(",", ".");
                    Model.sustituirProductes(nomProducteS,nomProducteMod,descProducteMod, Float.parseFloat(preuProducteMod));
                    break;
                case "4":
                    Model.llistarProductes();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }


//        TODO: IntroDades
        static String introText(String missatge){
            System.out.println(missatge);
            return scan.nextLine();
        }
    }





