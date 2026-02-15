package day15022026.laSerialization;

import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    public Animal() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    
    public String getName() { 
        return name; 
    }
    
    public int getAge() { 
        return age; 
    }
    
    public char getType() { 
        return type; 
    }

    public String toString() {
        return "Animal [name='" + name + "', age='" + age + "', type='" + type + "']";
    }
}
/*
public class Animal implements Serializable {
   
	private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private char type;

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() { 
        return name; 
    }
    
    public int getAge() { 
        return age; 
    }
    
    public char getType() { 
        return type; 
    }

    public String toString() {
        return "Animal [name='" + name + "', age='" + age + "', type='" + type + "']";
    }
   /*
	 private static final long serialVersionUID = 2L;  // UID CHANGÉ !!!
	    private String name;
	    private int age;
	    private char type;
	    private String habitat;  // NOUVEL ATTRIBUT AJOUTÉ

	    public Animal(String name, int age, char type, String habitat) {
	        this.name = name;
	        this.age = age;
	        this.type = type;
	        this.habitat = habitat;
	    }

	    public String toString() {
	        return "Animal [name=" + name + ", age=" + age + 
	               ", type=" + type + ", habitat=" + habitat + "]";
	    }
	    */
//}