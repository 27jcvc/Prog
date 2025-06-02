
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Compra {
	public static final String NOM_SUPERMERCAT = "SAPAMERCAT 2025";
	private static Scanner sc = new Scanner(System.in); 
	
	private List<Alimentacio> llista_ali;
	private List<Electronica> llista_elec;
	private List<Textil> llista_textil;
	private LinkedHashMap magatzem = new LinkedHashMap<>();
	
	public Compra() {
		llista_ali = new ArrayList<Alimentacio>();
		llista_elec = new ArrayList<Electronica>();
		llista_textil = new ArrayList<Textil>();
	}
	
	public static void main(String... args) throws ControlLlistaBuidaException, LimitProductesException {
		int op,opP,opM;
		Compra compra = new Compra();
		///
		/// Ex5
		compra.comprovarLimitDeProductes();
		///
		///
		System.out.println("BENVINNGUT AL " + Compra.NOM_SUPERMERCAT);
		do {

			op = compra.menuPrincipal();
			switch(op) {
				case 1: 
					do {
						opP =  compra.menuProducte();
						switch(opP) {
							case 1: 
								System.out.println("Afegir aliment"); 
								compra.addAliment();
								break;
							case 2:	
								System.out.println("Afegir tèxtil"); 
								compra.addTextil();
								break;
							case 3:	
								System.out.println("Afegir electrònica"); 
								compra.addElectronica();
								break;
							default: break;
						}
					}while(opP!=0);
					break;
				case 2: compra.passarCaixa(); break;
				case 3:	
					System.out.println("Carret"); 
					compra.printCarret();
					break;
				case 4:
					do {
						opM =  compra.menuMagatzem();
						switch(opM) {
							case 1:
								///
								/// Ex6
								compra.gestioMagatzem();
								///
								break;
							case 2:
								System.out.println("EXER7: Cal implementar un Deque");
								break;

							default: break;
						}
					}while(opM!=0);
					break;
				case 0:	System.out.println("Gràcies per la seva visita"); break;
				default: break;				
			}
					
		}while(op!=0);
				
	}
	
	public int menuPrincipal() {
		int op;
		System.out.println("------------");
		System.out.println("-- INICI ---");
		System.out.println("------------");
		System.out.println("1) Introduir producte");
		System.out.println("2) Passar per caixa");
		System.out.println("3) Mostar carret de compra");
		System.out.println("4) Gestionar Magatzem");
		System.out.println("0) Acabar");	
		
		op = Integer.parseInt(sc.nextLine());
		return op;
	}
	
	public int menuProducte() {
		int op;
		System.out.println("---------------");
		System.out.println("-- PRODUCTE ---");
		System.out.println("---------------");
		System.out.println("1) Alimentació");
		System.out.println("2) Tèxtil");
		System.out.println("3) Electrònica");
		System.out.println("0) Tornar");	
		
		op = Integer.parseInt(sc.nextLine());
		return op;
	}

	public int menuMagatzem() {
		int op;
		System.out.println("---------------");
		System.out.println("-- MAGATZEM ---");
		System.out.println("---------------");
		System.out.println("1) Gestió estructurada del magatzem");
		System.out.println("2) Gestió operativa de la mercaderia");
		System.out.println("0) Tornar");

		op = Integer.parseInt(sc.nextLine());
		return op;
	}

	///  Ex5
	public void comprovarLimitDeProductes() throws LimitProductesException {
		if (llista_ali.size() > 10) throw new LimitProductesException("No pot haber més de 10 productes!");
		if (llista_textil.size() > 10) throw new LimitProductesException("No pot haber més de 10 productes!");
		if (llista_elec.size() > 10) throw new LimitProductesException("No pot haber més de 10 productes!");
	}
	///

	//Afegir aliment a la llista d'aliments
	public void addAliment() {
		String nom, codi;
		float preu;
		String dateFormat = "dd/MM/yyyy";
		
		System.out.print("Nom producte:\t");
		nom = sc.nextLine();
		System.out.print("preu:\t");
		preu = Float.parseFloat(sc.nextLine());
		System.out.print("Codi de barres:\t");
		codi = sc.nextLine();
		System.out.print("Data de caducitat (dd/mm/aaaa):\t");
		LocalDate ld = readDate();
		llista_ali.add(new Alimentacio(preu,nom,codi,ld));
	}
	
	//Afegir textil a la llista de productes tèxtils
	public void addTextil() {
		String nom, compo, codi;
		float preu;
		
		System.out.print("Nom producte:\t");
		nom = sc.nextLine();
		System.out.print("preu:\t");
		preu = Float.parseFloat(sc.nextLine());
		System.out.print("Composició:\t");
		compo = sc.nextLine();
		System.out.print("Codi de barres:\t");
		codi = sc.nextLine();
		
		llista_textil.add(new Textil(preu,nom,codi,compo));	
	}
	
	//Afegir textil a la llista de productes tèxtils
	public void addElectronica() {
		String nom,codi;
		float preu;
		int garantia;
		
		System.out.print("Nom producte:\t");
		nom = sc.nextLine();
		System.out.print("preu:\t");
		preu = Float.parseFloat(sc.nextLine());
		System.out.print("Garantia (dies):\t");
		garantia = Integer.parseInt(sc.nextLine());
		System.out.print("Codi de barres:\t");
		codi = sc.nextLine();
		
		llista_elec.add(new Electronica(preu,nom,codi,garantia));	
	}
	
	//Llistar les tres llistes
	public void printCarret() {
		Map<String,Integer> llista = new HashMap<>();

		//busquem els productes d'alimentació amb el mateix codi de barres
		for(Alimentacio a : llista_ali) {
			if(!llista.containsKey(a.getCodibarres())) 	llista.put(a.getCodibarres(),1);
			else llista.put(a.getCodibarres(),llista.get(a.getCodibarres()) + 1);
		}
		llista.forEach((k,v)-> {
            try {
                System.out.println(getNomProducte(k) + " -> " + (Integer) v);
            } catch (ControlLlistaBuidaException e) {
                throw new RuntimeException(e);
            }
        });
		llista.clear(); //netejar map perquè es fa servir en la següent cerca

		//busquem els productes tèxtils amb el mateix codi de barres
		for(Textil a : llista_textil) {
			if(!llista.containsKey(a.getCodibarres())) llista.put(a.getCodibarres(),1);
			else llista.put(a.getCodibarres(),llista.get(a.getCodibarres()) + 1);
		}
		llista.forEach((k,v)-> {
            try {
                System.out.println(getNomProducte(k) + " -> " + (Integer) v);
            } catch (ControlLlistaBuidaException e) {
                throw new RuntimeException(e);
            }
        });
		llista.clear(); //netejar map perquè es fa servir en la següent cerca

		//busquem els productes d'electrònica amb el mateix codi de barres
		for(Electronica a : llista_elec) {
			if(!llista.containsKey(a.getCodibarres())) llista.put(a.getCodibarres(),1);
			else llista.put(a.getCodibarres(),llista.get(a.getCodibarres()) + 1);
		}
		llista.forEach((k,v)-> {
            try {
                System.out.println(getNomProducte(k) + " -> " + (Integer) v);
            } catch (ControlLlistaBuidaException e) {
                throw new RuntimeException(e);
            }
        });
	}
	
	public void passarCaixa() throws ControlLlistaBuidaException {
		double total = 0;
		Set<Alimentacio> ali_uniq = new HashSet<Alimentacio>(llista_ali);
		Set<Producte> elec_uniq = new HashSet<Producte>(llista_elec);
		Set<Producte> textil_uniq = new HashSet<Producte>(llista_textil);
		int freq=0;

		LocalDate data = LocalDate.now();
		System.out.println("-----------------------------");
		System.out.println(Compra.NOM_SUPERMERCAT);
		System.out.println("-----------------------------");
		System.out.println("Data: " + data.toString());
		System.out.println("-----------------------------");

		//Productes iguals -> igual codi de barres i preu
		for(Producte a : ali_uniq)  {
			freq = Collections.frequency(llista_ali, a);
			System.out.println(a.getNom() + "\t\t" + freq + " " + a.getPreu() + "\t" + a.getPreu() * freq);
			total += a.getPreu()*freq;
		}

		for(Producte e: elec_uniq) {
			freq = Collections.frequency(llista_elec, e);
			System.out.println(e.getNom() + "\t\t" + freq + " " + e.getPreu() + "\t" + e.getPreu() * freq);
			total += e.getPreu()*freq;
		}

		for(Producte t: textil_uniq) {
			freq = Collections.frequency(llista_textil, t);
			System.out.println(t.getNom() + "\t\t" + freq + " " + t.getPreu() + "\t" + t.getPreu() * freq);
			total += t.getPreu()*freq;
		}
		System.out.println("-----------------------------");
		System.out.format("Total: %.3f%n%n", total);

		//buidar llistes
		llista_ali.clear();
		llista_elec.clear();
		llista_textil.clear();
	}

	private LocalDate readDate() {
		LocalDate d = null;
		boolean dateOK = false;

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		while(!dateOK) {
			try {
				d = LocalDate.parse(sc.nextLine(), format);
				dateOK = true;
			} catch (DateTimeException e) {
				System.out.print("Torna a entrar la data: ");
				dateOK = false;
			}
		}
		return d;
	}

	/* Busca el nom d'un producte a partir del codi de barres */
	private String getNomProducte(String codib) throws ControlLlistaBuidaException {
		//Mirem a les tres llistes
		List<Producte> list = llista_ali.stream().filter(o -> o.getCodibarres().equals(codib)).distinct().collect(Collectors.toList());
		if(list.size()==0) list = llista_textil.stream().filter(o -> o.getCodibarres().equals(codib)).distinct().collect(Collectors.toList());
		if(list.size()==0) list = llista_elec.stream().filter(o -> o.getCodibarres().equals(codib)).distinct().collect(Collectors.toList());
		return list.get(0).getNom();
	}
	public void gestioMagatzem() {

		int opcio;

		do {
			System.out.println("-------------------------");
			System.out.println("-- GESTIO DE MAGATZEM ---");
			System.out.println("-------------------------");
			System.out.println("1) Afegir producte");
			System.out.println("2) Buscar producte");
			System.out.println("3) Eliminar producte");
			System.out.println("4) Mostrar inventari");
			System.out.println("0) Sortir");

			opcio = Integer.parseInt(sc.nextLine());

			switch (opcio) {
				case 1:
					/// Ex6
					introduirProducteMagatzem(magatzem);
					///
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;

				default:
					System.out.println("Opció no vàlida.");
			}
		} while(opcio!=0);
	}

	/// Ex6
	public static void introduirProducteMagatzem(LinkedHashMap productes){
		String nom, codi;

		System.out.print("Nom producte:\t");
		nom = sc.nextLine();
		System.out.print("Codi de barres:\t");
		codi = sc.nextLine();
		productes.put(codi, nom);
	}

	/// Ex8
	public static boolean comprovarExistenciaAlMagatzem(Producte producte, LinkedList magatzem){
		for (int i = 0; i < magatzem.size(); ++i){
			Producte pMagatzem = (Producte) magatzem.get(i);
			if (producte.getCodibarres().equals(pMagatzem.getCodibarres())) return true;
		}

		return false;
	}
}
