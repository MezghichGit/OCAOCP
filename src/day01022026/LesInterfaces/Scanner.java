package day01022026.LesInterfaces;

public interface Scanner {
	public void scan();
	
	public default void marque() {
		System.out.println("Samsung");
	}
}
