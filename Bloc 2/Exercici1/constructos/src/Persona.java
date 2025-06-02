public class Persona {
//    static ArrayList<Persona> persones;
//sirve para crear personas
//    nom y edad
//    tostring = objecte -> a string

    String nom;
    int edad;

    //Constructor
    public Persona(String nombre, int edad){
        this.nom = nombre;
        this.edad = edad;
    }

    /**
     * // Con override cambiamos el objeto padre de el constructor
     * @return
     */
    @Override
    public String toString() {
        return "Nom: " + nom + ", Edat: " + edad;
    }


}


