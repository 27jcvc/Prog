package model;


import model.objectes.Casa;
import model.objectes.Habitatge;
import model.objectes.Inmobiliaria;
import model.objectes.Pis;

import java.util.ArrayList;

public class Model implements Inmobiliaria {
    // Llista d'habitatges que té la immobiliària
    private static ArrayList<Habitatge> habitatges = new ArrayList<>();

    // Retornar tota la llista d'habitatges
    public static ArrayList<Habitatge> getHabitatges() {
        return habitatges;
    }

//    buscar si esta repetido
    // Buscar la posició d'un habitatge en la llista a partir del propietari i l'adreça
   public static int buscar(String propietari, String adressa) {

        for(int i = 0; i < habitatges.size(); ++i){
            Habitatge e = habitatges.get(i);
            if(propietari.equals(e) || adressa.equals(e)) return i;
            if (habitatges.get(i).equals(propietari, adressa)) return i;
        }
            return -1;
    }

    // Afegir un habitatge (casa) amb les dades necessàries
    public static void afegirHabitatge(String propietari, String adressa, float preu, boolean jardi) throws Exception {
        Habitatge nouH = new Casa(propietari, adressa, preu, jardi);
        setHabitatges(nouH);
    }

    // Afegir un habitatge (pis) amb les dades necessàries
    public static void afegirHabitatge(String propietari, String adressa, float preu, int planta, boolean ascensor) throws Exception {
        Habitatge nouH = new Pis(propietari, adressa, preu, planta, ascensor);
        setHabitatges(nouH);
    }

    // Esborrar un habitatge buscant-lo a partir del propietari i l'adreça
//    Todo: Falta buscar y que me retorne el objeto
    public static void esborrar(String propietari, String adressa) throws Exception {
        if(buscar(propietari, adressa) == -1){
            throw new Exception("Aquest element no existeix");
        }

        //        if(equals(propietari, adressa)){
//
//        }

    }

    // Retornar una llista amb els habitatges d'un tipus determinat: casa o pis
    public static ArrayList<Habitatge> filtrarHabitatges(String tipus) {
        ArrayList<Habitatge> _Array_ = getHabitatges();
        ArrayList<Habitatge> llista = new ArrayList<>();

        for(Habitatge e : _Array_){
            String eTipus = e.getClass().getSimpleName();
            // .equalsignorecase() es para comprovar si es case sensitive
            if(eTipus.equals(tipus))
                llista.add(e);
        }

        return llista;
    }

    public static void setHabitatges(Habitatge habitatges) {
        Model.habitatges.add(habitatges);
    }


    @Override
    public void calcularImpostos() {

    }

    @Override
    public void calcularComissio() {

    }
}
