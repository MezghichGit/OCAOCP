package day15022026.nio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LaMethodeNormalize {

	public static void main(String[] args) throws IOException {
		/*
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		// ../user/home
		
		Path relativePath = path3.relativize(path4);
		System.out.println(path3.resolve(relativePath));
		// E:/data/../user/home
		System.out.println(path3.resolve(relativePath).normalize());
		 */
		System.out.println(Paths.get(".")); 
		System.out.println(Paths.get(".").toRealPath());
		Path path4 = Paths.get("E:\\user\\home");
		System.out.println(path4.toRealPath());
		System.out.println(path4.toAbsolutePath());
	}

}
