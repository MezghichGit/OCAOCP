package day08022026.genericType;

public class Voiture <T> implements Vehicule<T>{

	@Override
	public void transporter(T t) {
		System.out.println("Transporter n'importe quel type");
		
	}

}
