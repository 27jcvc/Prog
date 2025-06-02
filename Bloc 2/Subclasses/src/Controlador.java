import model.Model;
import model.objectes.*;
import vista.Vista;

import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    static Scanner scan = new Scanner(System.in);
    static String opcio;
    public static void main(String[] args) {
        inicialitzarValors();

 try{
     do {
         Vista.menu();
         opcio = introText("");
         switch (opcio){
             case "1": // Mostrar Animales
                 Vista.mostrarNomAnimals(Model.getAnimals());
                 break;
             case "2": // Mostrar Animal Por Tipo
                 menuMostrarAnimalPorTipus();
                 break;
             case "3": // Mostrar Informacion De Animales
                 filtrarInformacionAnimales();
                 break;
             case "4": // Moure animals
                 moureAnimals();
                 break;
             case "0": // Sortir
                 break;
             default:
                 System.out.println("Opcion incorrecta");
         }
     }while(!opcio.equals("0"));

 }catch (Exception e) {
//     throw new Exception("error");
     System.out.println("Error");
 }



    }

    static void menuMostrarAnimalPorTipus(){
        Vista.menuTipusAnimal();
        opcio = introText("");
        switch (opcio){
            case "1": // Mostrar Peix
//                Vista.veureNomPerClasses(Model.getAnimals(), "Peix");
//                Vista.mostraAnimal(Model.getAnimals(), false);
                Vista.mostraAnimaloMoviment(Model.filtrarAnimals(Model.getAnimals(),"Peix"), false);
                break;
            case "2": // Mostrar Au
                Vista.mostrarNomAnimals(Model.filtrarAnimals(Model.getAnimals(),"Au"));
                break;
            case "3": // Mostrar Mamifer
                Vista.mostrarNomAnimals(Model.filtrarAnimals(Model.getAnimals(),"Mamifer"));
                break;
            case "4": // Mostrar Reptil
                Vista.mostrarNomAnimals(Model.filtrarAnimals(Model.getAnimals(),"Reptil"));
                break;
            case "5": // Prova
                Vista.mostraAnimaloMoviment(Model.filtrarAnimals(Model.getAnimals(), "Peix"), false);
                break;
            case "0": // Sortir
                opcio = "";
                break;
            default:
                System.out.println("Opcion incorrecta");
                menuMostrarAnimalPorTipus();
        }
    }

    static void filtrarInformacionAnimales(){
        Vista.menuTipusAnimal();
        opcio = introText("");
        switch (opcio){
            case "1": // Mostrar Peix
                Vista.mostrarInformacioAnimals(Model.getAnimals(), "Peix");
                break;
            case "2": // Mostrar Au
                Vista.mostrarInformacioAnimals(Model.getAnimals(), "Au");
                break;
            case "3": // Mostrar Mamifer
                Vista.mostrarInformacioAnimals(Model.getAnimals(), "Mamifer");
                break;
            case "4": // Mostrar Reptil
                Vista.mostrarInformacioAnimals(Model.getAnimals(), "Reptil");
                break;
            case "0": // Tornar
                opcio = "";
                break;
            default:
                System.out.println("Opcion incorrecta");
                filtrarInformacionAnimales();
        }
    }

    static void moureAnimals(){
        Vista.menuTipusAnimal();
        opcio = introText("");
        switch (opcio){
            case "1": // Moure Peix
                Vista.mostraAnimaloMoviment(Model.filtrarAnimals(Model.getAnimals(), "Peix"), true);
                break;
            case "2": // Moure Au
                Vista.mostraAnimaloMoviment(Model.filtrarAnimals(Model.getAnimals(), "Au"), true);
                break;
            case "3": // Moure Mamifer
                Vista.mostraAnimaloMoviment(Model.filtrarAnimals(Model.getAnimals(), "Mamifer"), true);
                break;
            case "4": // Moure Reptil
                Vista.mostraAnimaloMoviment(Model.filtrarAnimals(Model.getAnimals(), "Reptil"), true);
                break;
            case "0": // Tornar
                opcio = "";
                break;
            default:
                System.out.println("Opcion incorrecta");
                moureAnimals();
        }
    }




    static String introText(String missatge){
        System.out.println(missatge);
        return scan.nextLine();
    }

    static void inicialitzarValors() {
        ArrayList<Animal> animals = new ArrayList<>();

        // Peixos
        animals.add(new Peix("Sardina", 100, 30, "Estic nadant"));
        animals.add(new Peix("Atun", 200, 150, "Estic nadant"));
        animals.add(new Peix("Tiburón", 500, 300, "Estic nadant"));
        animals.add(new Peix("Ballena", 1500, 500, "Estic nadant")); // o usar Mamífer marino

        // Mamífers
        animals.add(new Mamifer("Lleó", 250, "curt i dens", "Estic corrent"));
        animals.add(new Mamifer("Elefant", 1200, "fi i escàs", "Estic corrent"));
        animals.add(new Mamifer("Delfí", 300, "sense pel", "Estic corrent")); // técnicamente no té pel visible

        // Aus
        animals.add(new Au("Colom", 2, 0.64, "Estic volant"));     // ~64 cm
        animals.add(new Au("Àguila", 6, 2.10, "Estic volant"));    // ~210 cm
        animals.add(new Au("Estruç", 150, 2.00, "Estic volant"));  // alas grandes aunque no vuelen

        // Rèptils
        animals.add(new Reptil("Serp", 10, "llises", "M'estic desplaçant"));
        animals.add(new Reptil("Iguana", 5, "rugoses", "M'estic desplaçant"));
        animals.add(new Reptil("Cocodril", 400, "dures i grans", "M'estic desplaçant"));

        Model.setAnimals(animals);
    }

}

