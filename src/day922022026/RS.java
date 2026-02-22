package day922022026;

public class RS implements AutoCloseable{

	
	public void processing() {
		System.out.println("Do work...");
	}
	@Override
	public void close() {
		System.out.println("Cloture de RS");
		
	}

}
