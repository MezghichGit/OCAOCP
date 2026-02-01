package day01022026.LesInterfaces;

public interface Imprimante {
	
	public void imprimer();
	
	
	// A partir de la version 8
	public default void marque() {
		
		marqueP();
		System.out.println("HP4");
	}
	
	public default void marque2() {
		marqueP();
		
		System.out.println("HP5");
	}
	
	public static void marqueStatic() {
		System.out.println("HP static");
	}
	
	public static void marqueStatic2() {
		System.out.println("HP static");
	}
	
	// A partir de la version 9
	private void marqueP() {
		System.out.println("HP1");
		System.out.println("HP2");
		System.out.println("HP3");
	}
	
	private static void marquePS() {
		System.out.println("HP");
	}
}
