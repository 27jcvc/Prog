import model.Model;
import model.objectes.Asterisc;
import model.objectes.Jugador;

import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

//        Model.mostraBosc(Model.crearBosc(Model.getBosc()));
        Model.mostraBosc(Model.apareixAsterisc(Model.crearBosc(Model.getBosc())));
        String moviment = introText(    "  W  \n" + "A S D");
        if (moviment == "W"){

}
    }
    static String introText(String missatge) {
        System.out.print(missatge + ": ");
        return scan.nextLine();
    }
}
