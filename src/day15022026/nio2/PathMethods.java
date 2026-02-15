package day15022026.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {

	public static void main(String[] args) {
		
		Path path = Paths.get("/land/hippo/harry.happy");
		
		System.out.println("The Path Name is: "+path.toString());
		
		for(int i=0; i<path.getNameCount(); i++) 
		{
			System.out.println(" Element "+i+" is: "+path.getName(i));
		} 


	}

}
