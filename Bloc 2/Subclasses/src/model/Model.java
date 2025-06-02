package model;

import model.objectes.*;

import java.util.ArrayList;

public class Model {

    private static ArrayList<Animal> Animals = new ArrayList<>();;

    public static void afegirAnimal(String nom, int pes, String moviment,
                                    int profunditat, double envergaduraAlas,
                                    String tipusPel, String tipusEscates) {

//        Peix
        Animal peix = new Peix(nom, pes, profunditat, moviment);

//        Mamifer
        Animal mamifer = new Mamifer(nom, pes, tipusPel, moviment);

//        Aus
        Animal au = new Au(nom, pes, envergaduraAlas, moviment);

//        Reptil
        Animal reptil = new Reptil(nom, pes, tipusEscates, moviment);

//        Animals.add(sardina);
    }



//    Getters y setters
    public static void setAnimals(ArrayList<Animal> animals) {
        Animals = animals;
    }

    public static ArrayList<Animal> getAnimals() {
        return (ArrayList<Animal>) Animals;
    }

//    TODO: filtrarAnimals
public static ArrayList<Animal> filtrarAnimals(ArrayList<Animal> llistatAnimals, String tipusClasse){

        ArrayList<Animal> _tipusAnimal_ = new ArrayList<>();
        for(Animal e : llistatAnimals){
            if (e.getClass().getSimpleName().equals(tipusClasse)){
                _tipusAnimal_.add(e);
            }
        }
        return _tipusAnimal_;
    }
}
