package model.objects;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Alimentacio extends Producte{
    private double dataCaducitat;

    public Alimentacio(String nom, int preu, String codiDeBarres, String dataCaducitat) {
        super(nom, preu, codiDeBarres);
        int any = Integer.parseInt(dataCaducitat.substring(0, 2));
        int mes = Integer.parseInt(dataCaducitat.substring(3, 5));
        int dia = Integer.parseInt(dataCaducitat.substring(6, 8));

        LocalDate dataFormatada = LocalDate.of(any, mes, dia);
        long dies = dataFormatada.toEpochDay() - LocalDate.now().toEpochDay();

        if (dies < 0) dies = 0;
        this.dataCaducitat = preu - preu*(1/(dies +1)) + (preu * 0.1);


    }
}
