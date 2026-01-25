package S1_25012026;

public class Voiture {
	
	// par défaut Java nous offre le constructeur par défaut qui est implicite
	public Voiture() {
	}

	// attributs d'instance
	String marque;
	String modele;
	double prix;
	
	// constructeur avec paramètres
	public Voiture(String marque, String modele, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
	}

}
