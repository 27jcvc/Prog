import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class testPersona {
    public static void main(String[] args) {
        PersonaMC p1 = new PersonaMC("Miguel", 14);
        PersonaMC p2 = new PersonaMC("Juan", 21);
        PersonaMC p3 = new PersonaMC("Carlos", 56);
        PersonaMC p4 = new PersonaMC("Marta", 30);
        PersonaMC p5 = new PersonaMC("Pepe", 28);
        PersonaMC p6 = new PersonaMC("Fernando", 41);

        List<PersonaMC> persones = new ArrayList<PersonaMC>();

        persones.add(p1);
        persones.add(p2);
        persones.add(p3);
        persones.add(p4);
        persones.add(p5);
        persones.add(0, p6);

        for (PersonaMC p : persones) {
            System.out.println(p);
        }

        Collections.sort(persones, PersonaMC.by_NOM);

        System.out.println("Ordenant per nom...");

        for (PersonaMC p : persones) {
            System.out.println(p);
        }

        Collections.sort(persones, PersonaMC.by_EDAT);

        System.out.println("Ordenant per edat...");

        for (PersonaMC p : persones) {
            System.out.println(p);
        }
    }
}