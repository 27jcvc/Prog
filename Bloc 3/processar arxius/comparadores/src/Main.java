import model.Persona;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("García", 69, "Ana"));
        personas.add(new Persona("López", 25, "Carlos"));
        personas.add(new Persona("Paz", 30, "Bea"));
        personas.add(new Persona("Sanchez", 55, "Paco"));
        personas.add(new Persona("Wrawner", 23, "Bros"));
        personas.add(new Persona("Lomastu", 77, "Bastian"));


//        System.out.println(personas.iterator());
        // Ordenar por nombre
        System.out.printf("Sin ordenar: %n");
        for (Persona e : personas){
            System.out.printf("%50s%n", e);
        }

        Collections.sort(personas, Persona.comparePerNom);
        System.out.printf("Ordenado por nombre: %n");
        for (Persona e : personas){
            System.out.printf("%50s%n", e);
        }

        // Ordenar por nombre y después apellido
        System.out.printf("Ordenado por nombre y apellido: %n");
        Collections.sort(personas, Persona.comparadorPorNomYCognom);
        for (Persona e : personas){
            System.out.printf("%50s%n", e);
        }

        // Ordenar por edad
        System.out.printf("Ordenado por edad: %n");
        personas.sort(Persona.comparadorPorEdat); // forma moderna
        for (Persona e : personas){
            System.out.printf("%50s%n", e);
        }

        System.out.printf("%nOrdenado por edad: %n");
        Collections.sort(personas, (p1, p2) -> Integer.compare(p1.edat, p2.edat));

        for (Persona e : personas){
            System.out.printf("%50s%n", e);
        }
    }
}