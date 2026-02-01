package day01022026.classeAbstraite;

public abstract class Animal {
	String espece;
	double poids;
	double taille;
	
	public void infos()
	{
		System.out.println("Espece : " +this.espece+", Poids : "+this.poids+", Taille : "+this.taille);
	}
	public abstract void seDeplacer();	
}
