package day01022026.LesInterfaces;

public interface Photocopieuse {
	public void photocopier();
	
	public default void marque() {
		System.out.println("Toshiba");
	}
}
