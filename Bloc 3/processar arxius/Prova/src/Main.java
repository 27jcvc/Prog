import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        File f = new File("./Proves/arxiu.txt");

        System.out.println("\nPath:       " + f);
        System.out.println("Exists:       " + f.exists());
        if (!f.exists()) return;

        System.out.println("Hidden:       " + f.isHidden());
        System.out.println("Read:         " + f.canRead());
        System.out.println("Write:        " + f.canWrite());
        System.out.println("Execute:      " + f.canExecute());
        System.out.println("File:         " + f.isFile());
        System.out.println("Directory:    " + f.isDirectory());
        System.out.println("Length:       " + f.length());
        System.out.println("LastModified: " + f.lastModified());
        Date d = new Date(f.lastModified());
        System.out.println("LastModified: " + d.toString());
    }

    public static void comprovarRuta(String RutaArxiu){
        File f = new File(".");
        try {
            System.out.println(f.getCanonicalPath());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}