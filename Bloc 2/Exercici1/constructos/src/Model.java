import java.util.ArrayList;

public class Model {

    private static ArrayList<Persona> persones = new ArrayList<>();
    private static ArrayList<Producte> productes = new ArrayList<>();
//    | --------- |
//    |  Persona  |
//    | --------- |
    public static void mostrarPersones() throws Exception{
        comprovarDadesE(persones);
        ArrayList<Persona> p = persones;
        for (Persona e : p) {  // Usa 'Persona' en vez de 'Object'
            System.out.println(e);     // Esto llama a toString() automáticamente
        }
    }

    public static void afegirPersona(String nombre, int edad) throws Exception {
        if (!verificarDades(nombre)){
            persones.add(new Persona(nombre, edad));
            return;
        };
        throw new Exception("S'ha trobat un nom igual");
    }


    public static boolean verificarDades(String nomIntroduit) throws Exception{
        ArrayList<Persona> p = persones;
        for(Persona e : p){
            if(e.nom.equals(nomIntroduit)) return true;
            else if(e.nom == null || e.nom.isBlank()) throw new Exception("El nombre esta buit!!");
//            else if (e.nombre <= ) {
//
//            }
        }
        return false;
    }
    public static <T> void comprovarDadesE(ArrayList<T> ARRAY){
        if (ARRAY.isEmpty()){
            throw new IllegalStateException("No s'ha afegit cap valor posteriorment");
        }
    }
    public static void modificarPersona(String nomSel, String nomNou, int edatNova) throws Exception{
        comprovarDadesE(persones);
        ArrayList<Persona> p = persones;
        for(Persona e : p){
            if(e.nom.equals(nomSel)){
                e.nom = nomNou;
                e.edad = edatNova;
            }else{
                throw new Exception("Aquesta persona no existeix");
            }
        }
    }
    public static void esborrarPersona(String nomSel){
        comprovarDadesE(persones);
        ArrayList<Persona> p = persones;
    for (int i = 0; i < p.size(); ++i){
        if(p.get(i).nom.equals(nomSel)){
            persones.remove(i);
        }
        }
    }
    public static void filtrarAnys(){
        comprovarDadesE(persones);
        final int anys = 18;
        ArrayList<Persona> p = persones;
        for (Persona e : p) {  // Usa 'Persona' en vez de 'Object'
            if(e.edad == anys){
                System.out.println(e);     // Esto llama a toString() automáticamente
            }
        }
    }

//    | --------- |
//    | Productes |
//    | --------- |
    public static void afegirProducte(String nom, String desc, float preu){
        productes.add(new Producte(nom, desc, preu));

    }

    public static void llistarProductes() throws Exception {
        if (productes.isEmpty()) throw new Exception("S'ha de afegir algun producte");
        ArrayList<Producte> pd = productes;
        for (Producte e : pd) {  // Usa 'Persona' en vez de 'Object'
            System.out.println(e);     // Esto llama a toString() automáticamente
        }
    }

    public static void modificarProductes(String cAm, String cMod, String cModificat){
        comprovarDadesE(productes);
        ArrayList<Producte> pd = productes;
        switch (cAm){
            case "1":
                for (Producte e : pd){
                    e.nom = cModificat;
                }
                break;
            case "2":
                for (Producte e : pd){
                    e.desc = cMod;
                }
                break;
            case "3":
                for (Producte e : pd){
                    e.preu = Float.parseFloat(cMod);
                }
                break;
            case "0":
                break;
            default:
                System.out.println("Opcion incorrecta\n");

                //                    if(e.nom.equals(cMod)){
//                        e.nom = cModificat;
//                    } else if (e.desc.equals(cMod)) {
//                        e.desc = cModificat;
//                    } else if (e.preu == Float.parseFloat(cModificat)) {
//
//                    }
        }
    }


    public static void sustituirProductes(String naM, String nModificat, String dModificat, float pModificat) throws Exception{
        ArrayList<Producte> pd = productes;
//        if (!verificarContingut(naM, pd)) throw new Exception("El nom d'aquest producte no existeix");
        for (int i = 0; i < pd.size(); ++i) {
            if (naM.equals(pd.get(i).nom)){
                Producte nouProducte = new Producte(nModificat, dModificat, pModificat);
                productes.set(i, nouProducte);
            };
        }
    }

//    TODO: Falta terminar la funcion verificarContingut()
//    public static <Object> boolean verificarContingut(String nBuscat, ArrayList<Object> ARRAY){
//        ArrayList<Object> pd = ARRAY;
//
//            for(Object e : ARRAY){
//                if(nBuscat.equals(e.nom)) return true;
//            }
//            return false;
//    }


}




