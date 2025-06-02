
public abstract class Producte implements Comparable{
	private float preu;
	private String nom;
	private String codibarres;

	public Producte(float preu, String nom, String codi) {
		this.preu = preu;
		this.nom = nom;
		codibarres = codi;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	/// Ex2
	public String getNom() throws ControlLlistaBuidaException {
		if (nom == null) throw new ControlLlistaBuidaException("Nom buit");
		return nom;
	}
	///

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodibarres() {
		return codibarres;
	}
	public void setCodibarres(String codibarres) {
		this.codibarres = codibarres;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		else {
			Producte p = (Producte) obj;
			if (codibarres.equals(p.getCodibarres()) && getPreu() == p.getPreu()) return true;
			//if (codibarres.equals(p.getCodibarres())) return true;
			else return false;
		}
	}

	/// Ex1
	@Override
	public int compareTo(Object o) {
		if (codibarres.equals(o)) return 0;
		if (!codibarres.equals(o)) return 1;

		return -1;
	}




	@Override
	public int hashCode() {
		return codibarres.hashCode();
	}
	
	
	

}
