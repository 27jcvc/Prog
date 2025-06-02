
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Alimentacio extends Producte {
	
	private LocalDate dataCaducitat;

	public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
		super(preu, nom, codi);
		dataCaducitat = datac;
	}

	@Override
	public float getPreu() {
		float preu = super.getPreu();
		long dif;
		dif = ChronoUnit.DAYS.between(dataCaducitat,LocalDate.now());
		//preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
		/// Ex3
		preu = calcularPreu(preu,dif);
		///

		//System.out.println("preu:" + preu);
		return preu;
	}

	public int compararPerCaducitat(Object o) {
//		if (dataCaducitat);
		return 0;
	}

	@Override
	public String toString() {
        try {
            return new String(getNom() + " " + getPreu());
        } catch (ControlLlistaBuidaException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

	/// Ex3
	public static float calcularPreu(float preu, long dif){
		float descompte = (float) ((1.0 / (dif + 1)) + 0.1);
		return Math.max(preu * (1 - descompte), 0);
	}
	///

	/// Ex4
	/// Hauria de retornar alguna cosa que no sigui el producteBuscat
	public static Producte buscarProducte(List<Producte> llista, Producte producteBuscat) throws ControlLlistaBuidaException, ProducteNoTrobatException {

		for (int i = 0; i < llista.size(); ++i){
			Producte producte = llista.get(i);
			if(producte.getCodibarres().equals(producte.getCodibarres())){
				return producte;
			}
				throw new ProducteNoTrobatException("No s'ha trobat el producte.");
		}
        return producteBuscat;
    }
	///
}
