public class Vista {

    public static void mostrarMenu(){
        System.out.println(
                        "------------\n" +
                        "1. Persona\n" +
                        "2. Producte\n" +
                        "0. Sortir \n" +
                        "------------");
            }

    public static void mostrarMenuPersona(){
        System.out.println(
                        "------------\n" +
                        "1, Afegir Persona\n" +
                        "2, Modificar Persona\n" +
                        "3, Esborrar Persona\n" +
                        "4. Mostrar Persones\n" +
                        "5. Filtrar 18 Anys\n" +
                        "0. Tornar\n" +
                        "------------");
    }

    public static void mostrarMenuProductes(){
        System.out.println(
                        "------------\n" +
                        "1, Afegir Producte\n" +
                        "2, Modificar Producte (falta)\n" +
                        "3, Sustituir Producte\n" +
                        "4, Esborrar Producte (falta)\n" +
                        "5, Llistar Productes\n" +
                        "0. Tornar\n" +
                        "------------");
    }
    public static void menuModificarProducte(){
        System.out.println("-----------------------------\n" +
                "Selecciona lo que quieres modificar: \n" +
                "1. Nom\n" +
                "2. Descripcio\n" +
                "3. Preu \n" +
                "0. Tornar\n" +
                "-----------------------------");
    }

    public static void mostrarArraylist(){

    }
//    TODO: Falta funcion para mostrar cosas(ex: una funcion que retorne un arraylist(MODEL) y que el controlador diga a la vista
//     que muestre ese ArrayList
}



