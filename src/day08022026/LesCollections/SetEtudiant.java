package day08022026.LesCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEtudiant {

	public static void main(String[] args) {
		//Set<Etudiant> students = new TreeSet<>(); // TreeSet : classe qui se base sur des objets comparables
		List<Etudiant> students = new ArrayList<>(); 
		Etudiant e1 = new Etudiant("amine",22,15);
		Etudiant e2 = new Etudiant("afef",23,16);
		Etudiant e3 = new Etudiant("monia",21,18);
		students.add(e1);
		students.add(e2);
		students.add(e3);
		System.out.println(students);
		
		Comparator<Etudiant> comp_age = (Etudiant a, Etudiant b)-> a.age-b.age;
		Comparator<Etudiant> comp_moy = (Etudiant a, Etudiant b)-> a.moyenne-b.moyenne;
		Comparator<Etudiant> comp_nom = (Etudiant a, Etudiant b)-> a.nom.compareTo(b.nom);
		System.out.println("Tri par age");
		Collections.sort(students,comp_age);
		System.out.println(students);
		System.out.println("Tri par moyenne");
		Collections.sort(students, comp_moy);
		System.out.println(students);
		System.out.println("Tri par nom");
		Collections.sort(students, comp_nom);
		System.out.println(students);
	}

}
