package day01022026;

public class Bus implements Vehicule{

	@Override
	public void transporter() {
		System.out.println("Transporter des passagers entre les villes");
		
	}

	@Override
	public void accelerer() {
		System.out.println("Ne dépasse pas 110KM/h");
	}

}
