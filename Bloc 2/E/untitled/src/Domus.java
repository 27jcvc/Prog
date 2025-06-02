import model.*;
import vista.*;

public class Domus {

    // Funció principal: realitza diferents operacions amb els habitatges
    //  - afegir i esborrar cases i pisos
    //  - afegir i esborrar amb dades errònies
    //  - llistar tots els habitatges, només les cases, només els pisos
    static public void main(String[] args) {
    try{
        afegirCasa("Peter", "Pl. Catalunya, 25", 560000, false);
        afegirCasa("Peter", "Av. Tibidabo, 120", 630000, true);
        afegirCasa("Mary", "Pg. Bonanova, 34", 750000, true);
        afegirCasa("Mary", "C. Muntaner, 250", 810000, false);
        afegirPis("John", "Av. Diagonal, 81, 1r, 2a", 480000, 1, false);
        afegirPis("Betty", "Pl. Consell, 13, Àtic B", 399000, 5, true);

//        TODO: he comentado los errores porque he hecho un try catch para comprovar si hay errores;
        // PREU INCORRECTE
//        afegirCasa("Peter", "Av. Diagonal, 74", 300000, true);
        // PIS 2+ SENSE ASCENSOR
//        afegirPis("Mary", "C. Muntaner, 5, 3r", 300000, 3, false);
        // REPETIT
        afegirPis("Betty", "Pl. Consell, 13, Àtic B", 499000, 2, true);
        // NO EXISTEIX
        // Todo: falta terminar eliminar
        esborrar("Mary", "Pg. Bonanova, 33");

        System.out.println("\nTOTS\n----------------------------------");
        Vista.mostrarHabitatges(Model.getHabitatges());
        // Todo: falta terminar eliminar
        esborrar("Mary", "Pg. Bonanova, 34");

        System.out.println("\nCASES\n----------------------------------");
        Vista.mostrarHabitatges(Model.filtrarHabitatges("Casa"));
        System.out.println("\nPISOS\n----------------------------------");
        Vista.mostrarHabitatges(Model.filtrarHabitatges("Pis"));
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }


    // Afegeix una casa cridant el mètode afegirHabitatge() de la classe Model
    static void afegirCasa(String propietari, String adressa, float preu, boolean jardi) throws Exception {
        Model.afegirHabitatge(propietari, adressa, preu, jardi);
    }

    // Afegeix un pis cridant el mètode afegirHabitatge() de la classe Model
    static void afegirPis(String propietari, String adressa, float preu, int planta, boolean ascensor) throws Exception {
        Model.afegirHabitatge(propietari, adressa, preu, planta, ascensor);
    }

    // Esborra un habitatge cridant el mètode esborrar() de la classe Model
    static void esborrar(String propietari, String adressa) {
    }
}
