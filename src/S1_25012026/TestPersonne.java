package S1_25012026;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne(); // création d'un objet Personne via le constructeur par défaut
		Personne p2 = new Personne("Ali",25);
		
		System.out.println(p1.nom);
		System.out.println(p1.age);
		
		System.out.println(Personne.MAX_AGE);
		p1.MAX_AGE = 130;
		System.out.println(p2.MAX_AGE);

	}

}
