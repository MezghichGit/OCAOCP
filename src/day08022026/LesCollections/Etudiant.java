package day08022026.LesCollections;

public class Etudiant implements Comparable<Etudiant>{
	
	String nom;
	int age;
	int moyenne;
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + "]";
	}

	public Etudiant(String nom, int age, int moyenne) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
	}

	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		//return this.age-o.age;
		return this.nom.compareTo(o.nom);
	}
	
	

}
