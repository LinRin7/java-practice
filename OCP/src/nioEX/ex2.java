package nioEX;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex2 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP/test.txt");
		System.out.println(p1.subpath(2, 6));
		System.out.println(p1);
		p1 = p1.subpath(2, 6);
		System.out.println(p1);
	}

}
