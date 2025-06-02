package vista;

import model.objectes.Animal;

import java.util.ArrayList;

public class Vista {

    public static void menu(){
        System.out.println( "------------------------------------\n" +
                            "1. Mostrar animales\n" +
                            "2. Mostrar animal por tipo\n" +
                            "3. Mostrar informacion de animales\n" +
                            "4. Moure animals\n" +
                            "0. Sortir");
    }

    public static void menuTipusAnimal(){
        System.out.println( "1. Peix\n" +
                            "2. Au\n" +
                            "3. Mamifer\n" +
                            "4. Reptil\n" +
                            "5. Prova\n" +

                            "0. Tornar");

    }

//    TODO: la vista solo tiene que recibir los datos y mostrarlos
//     el modelo ha de retornarlos...

    public static void mostrarNomAnimals(ArrayList<? extends Animal> llistatAnimals) {
        System.out.print("Animals: \n");
        for(Animal e : llistatAnimals){
            System.out.println(" " + e.getNom());
        }
    }



    public static void mostraAnimaloMoviment(ArrayList<Animal> _Array_, boolean moviment){
        ArrayList<Animal> a = _Array_;
        String tipusClasse = a.get(1).getClass().getSimpleName();

        if(moviment) System.out.println("Moviments de animals: ");
        else System.out.println("Animals de tipus " + tipusClasse + ":\n");

        for(Animal e : a){
            if(moviment){
                System.out.print(e.getNom() + ": ");
                e.moure();
            }
            else System.out.println(" " + e.getNom());;
        }
    }


    public static <T> void mostrarInformacioAnimals(ArrayList<T> _array_, String tipusClasse){
        System.out.print("Informacio de animals de tipus " + tipusClasse + ":\n");
        for(T e : _array_){
            if (e.getClass().getSimpleName().equals(tipusClasse)){
                System.out.println(" " + e);
            }
        }
    }





}
