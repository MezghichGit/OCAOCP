package day08022026.genericType;

public class Container<T> {

	private T t; // attribut d'instance

	public Container(T t) // constructeur
	{
		this.t = t;
	}

	public void display() { // méthode d'instance
		System.out.println(this.t);
	}

}
