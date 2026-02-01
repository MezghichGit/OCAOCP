package day01022026.LesInterfaces.interfaceFonctionnel;

@FunctionalInterface
public interface Prediction {
	
	public void info();

	public default void display() {
	}

	
	public static void display2() {
	}
}
