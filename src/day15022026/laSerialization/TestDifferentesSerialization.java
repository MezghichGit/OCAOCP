package day15022026.laSerialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestDifferentesSerialization {

	public static void createAnimalsFile(List<Animal> animals, File dataFile)
            throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animal animal : animals) {
                out.writeObject(animal);
            }
        }
    }
	
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
	       List<Animal> animals = new ArrayList<Animal>();
	try (ObjectInputStream in = new ObjectInputStream(
	        new BufferedInputStream(new FileInputStream(dataFile)))) {
	    while (true) {
	        Object object = in.readObject();
	        if (object instanceof Animal) {
	            animals.add((Animal) object);
	        }
	    }
	} catch (EOFException e) {
	//File end reached
	}
	return animals;
	}
	public static void main(String[] args) throws IOException {
		/*
		List<Animal> animals = new ArrayList<>();
	    animals.add(new Animal("Tommy", 5, 'T'));
	    animals.add(new Animal("Peter", 8, 'P'));
	    
	    createAnimalsFile(animals, new File("animal1.data"));
	    System.out.println("Sérialisation effectuée avec UID=1");
	    */
		 
		try {
	        List<Animal> animals = getAnimals(new File("animal1.data"));
	        System.out.println(animals);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
