import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Miyagi",116);
        Persona p2 = new Persona("Roshi",179);
        Persona p3 = new Persona("Lee", 108);

        
        List<Persona> persones = new ArrayList<>();
        persones.add(p1);
        persones.add(p2);
        persones.add(p3);

        System.out.println("####### Llistem com es troben inicialment a l'arraylist #######");
        for(Persona p : persones) {
            System.out.println(p);
        }

        Collections.sort(persones);
        System.out.println("####### Llistem per edat #######");
        for(Persona p : persones) {
            System.out.println(p);
        }

        Collections.sort(persones,new ComparadorPersonesLongNom());

        Collections.sort(
                persones,
                new Comparator<Persona>() {
                @Override
                public int compare(Persona o1, Persona o2) {
                    if(o1.getNom().length() < o2.getNom().length()) return -1;
                    else if (o1.getNom().length() > o2.getNom().length()) return 1;
                    else return 0;
                }
            }
            );
        System.out.println("####### Llistem per longitud de nom #######");
        persones.forEach(System.out::println);


    }
}
