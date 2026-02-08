package day08022026.genericType;

import java.util.List;

public class Personne {
	List list;
	int age;
	String nom;
	
	public static <T> void display(T t)
	{
		System.out.println(t);
	}

}
