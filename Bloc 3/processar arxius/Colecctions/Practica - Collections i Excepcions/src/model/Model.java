package model;

import model.objects.Alimentacio;
import model.objects.Electronica;
import model.objects.Producte;
import model.objects.Textil;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Model {
    private static ArrayList productes = new ArrayList<Producte>();
    public static void introduirProducteAlimentacion(String nom, int preu, String codiDeBarres, String data){
//        if (data == null || data.isBefore(LocalDate.now())) {
//            System.out.println("Data invàlida. ");
//            return;
//        }

        productes.add(new Alimentacio(nom, preu, codiDeBarres, data));
    }
    public static void introduirProducteElectronica(String nom, int preu, String codiDeBarres, int diesGarantia){
        productes.add(new Electronica(nom, preu, codiDeBarres, diesGarantia));
    }
    public static void introduirProducteTextil(String nom, int preu, String codiDeBarres, String compTextil){
        productes.add(new Textil(nom, preu, codiDeBarres, compTextil));
    }
}
