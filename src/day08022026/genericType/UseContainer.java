package day08022026.genericType;

public class UseContainer {

	public static void main(String[] args) {
		Container<Double> cd = new Container<>(10.5);
		Container<String> cs = new Container<>("OCP");
		
		cd.display();
		cs.display();
	}

}
