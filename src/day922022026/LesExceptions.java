package day922022026;

public class LesExceptions {

	public static void main(String[] args) {
		String nom = "amine";
		System.out.println(nom.length());
		
		String nom2 = null;
		try {
		System.out.println(nom2.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Oups : "+e.getMessage());
			e.printStackTrace();
			return;
		}
		catch(Exception e)
		{
			System.out.println("Oups : "+e.getMessage());
			e.printStackTrace();
		}
		/*
		int x = 10;
		int y = 0;
		try {
		System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Oups : "+ e.getMessage());
		}*/
		finally {
		System.out.println("Suite du programme : envois d'emails...");
		}
		
	}

}
