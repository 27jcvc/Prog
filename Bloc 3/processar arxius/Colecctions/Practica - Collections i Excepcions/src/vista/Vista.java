package vista;

public class Vista {
    public static void mostrarMenuPrincipal(){
        System.out.println( "--------------------\n" +
                            "--     INICI      --\n" +
                            "--------------------\n" +
                            "1) Introduir Producte\n" +
                            "2) Pasar per caixa\n" +
                            "3) Mostrar carret de compra\n" +
                            "0) Acabar\n");
    }

    public static void mostrarMenuProducte(){
        System.out.println( "--------------------\n" +
                            "--    Producte    --\n" +
                            "--------------------\n" +
                            "1) Alimentacio\n" +
                            "2) Textil\n" +
                            "3) Electronica\n" +
                            "0) Tornar\n");
    }

    public static void mostrarMissatge(String m){
        System.out.println(m);
    }
}
