package day01022026.LesInterfaces;

public interface Vehicule {
	
	//int vitesseMax = 280;  // final (ne change pas)
	
	public static final  int vitesseMax = 280;
	
	void info(); // par defaut c'est public et abstract
	
	public default void display() {}

}
