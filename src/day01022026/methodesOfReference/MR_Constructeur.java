package day01022026.methodesOfReference;

import java.util.Date;
import java.util.function.Supplier;

public class MR_Constructeur {

	public static void main(String[] args) {
		Supplier<Double> rnd = ()->Math.random();
		
		System.out.println(rnd.get());
		
		// Donner moi son implémentation avec Méthode de référence: cas de méthode static
		Supplier<Double> rnd_2 = Math::random;
		System.out.println(rnd_2.get());
		
		Supplier<Date> timer = ()->new Date();
		Supplier<Date> timer_v2 = Date::new;
		
		System.out.println(timer.get());
		System.out.println(timer_v2.get());
		
		Supplier<StringBuilder> sb = StringBuilder::new;
		
		Supplier<Animal> f = Animal::new;
		Animal temp = f.get();
	}

}
