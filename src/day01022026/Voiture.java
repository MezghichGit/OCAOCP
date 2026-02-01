package day01022026;

public class Voiture implements Vehicule{

	@Override
	public void transporter() {
		System.out.println("Transporter entre emp A et B");
		
	}

	@Override
	public void accelerer() {
		System.out.println("Ne dépasse pas 180KM/h");
		
	}

}
