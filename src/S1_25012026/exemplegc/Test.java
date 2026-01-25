package S1_25012026.exemplegc;

public class Test {

	public static void main(String[] args) {
		
		Thread T1 = new Thread();
		System.out.println(10/0);
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		a1 = a2;
		a3 = null;
	
		for(int i=0;i<100;i++)
		{
			System.out.println("i = "+i);
		}
	
		System.gc(); // appel au garbage collector
		System.out.println("Fin du programme");

	}

}
