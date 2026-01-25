package S1_25012026;

public class Personne {
	
	//Des attributs(caractéristique) d'instance
	String nom;
	int age;
	
	//Des attributs de classes
	static  int MAX_AGE = 120;
	static  double MAX_POIDS = 200;
	
	// Les constructeurs
	
	// Le constructeur par défaut
	
	public Personne()
	{
		System.out.println("Nouvelle personne");
	}
	// Le constructeur avec paramètres
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	// Méthodes d'instance
	public void info()
	{
		System.out.println("Mon nom est : "+this.nom +" mon age : "+ this.age);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// Méthodes de classe
	public static void getMaxAge()
	{
		System.out.println(MAX_AGE);
	}
	
	// bloc d'initialisation d'instance
	{
		String formation = "OCA OCP";
		System.out.println(formation);
	}
	
	// bloc d'initialisation de classe
	static {
		System.out.println("Bloc Initialisation de la classe");
	}

}
