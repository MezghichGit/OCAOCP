package day08022026.genericType;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Exemeple de classe generique 
		
		ArrayList<String> names = new ArrayList();
		names.add("amine");
		names.add("salim");
		names.add("mourad");
		System.out.println(names);
		
		ArrayList<Double> notes = new ArrayList();
		notes.add(20.0);
		notes.add(14.0);
		notes.add(18.5);
		System.out.println(notes);
		
		List<String> list = new ArrayList<>();

	}

}
