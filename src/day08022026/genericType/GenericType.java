package day08022026.genericType;

import java.util.ArrayList;

public class GenericType {

	public static void main(String[] args) {
		//Avant java 5 : sans generics
		ArrayList objs = new ArrayList();
		objs.add("amine");
		objs.add("med");
		objs.add(true);
		objs.add(12);
		for(Object o : objs)
		{
			String temp = (String)o;
			System.out.println(temp.length());
		}
		System.out.println(objs);
		
		// version 5 : Intégration de la notion de generics
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("amine");
		names.add(true);
		
		// version 7 : Enlever le type de la partie droite
		ArrayList<String> noms = new ArrayList<>();
	}

}
