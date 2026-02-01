package day01022026.classeAbstraite;

public class TestClassesAbstraites {

	public static void main(String[] args) {
		Animal tab[] = new Animal[4];
		tab[0]= new Oiseau();
		tab[1]= new Poisson();
		tab[2]= new Serpent();
		tab[3]= new Chien();
		
		for(Animal a : tab)
		{
			a.seDeplacer();
		}
	}

}
