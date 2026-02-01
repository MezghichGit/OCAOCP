package day01022026;

public class EnseignantChercheur implements Employer, Chercheur{

	@Override
	public void getNInscription() {
		System.out.println("Demander à son ecole");
		
	}

	@Override
	public void getAffiliationCNSS() {
		System.out.println("Demander à son entreprise");
		
	}

}
