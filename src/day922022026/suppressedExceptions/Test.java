package day922022026.suppressedExceptions;

public class Test {

	public static void main(String[] args) {
		
		try (JammedTurkeyCage t1 = new JammedTurkeyCage();
				JammedTurkeyCage t2 = new JammedTurkeyCage()) {
		    //throw new IllegalStateException("turkeys ran off"); // exception principale
		    
		} //finally implicite sera exécuté ici
		catch (IllegalStateException e) {
		    System.out.println("caught: " + e.getMessage());
		    for (Throwable t: e.getSuppressed())
		        System.out.println("Suppressed : "+ t.getMessage());
		}
		finally {
			System.out.println("Fin du programme");
		}

	}

}
