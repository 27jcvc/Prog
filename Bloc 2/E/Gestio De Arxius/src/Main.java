import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        File carpeta = new File("Proves");
//        File arxiu = new File("Proves/arxiu.txt");

//        tener una
        final String baseDir = "C:/Users/usuari";
        File arxiu = new File(baseDir, "Proves");
    }

}