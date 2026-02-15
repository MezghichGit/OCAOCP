package day15022026;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exemple_PrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		try(PrintWriter out = new PrintWriter("zoo.log"))
		{
			out.print(5); // PrintWriter method
			//out.flush();
			out.write(String.valueOf(5)); // Writer method 
		}
		
		

	}

}
