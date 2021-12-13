package nioEX;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex5 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP/test.txt");
		System.out.println(Files.exists(p1, LinkOption.NOFOLLOW_LINKS));
		System.out.println(Files.notExists(p1, LinkOption.NOFOLLOW_LINKS));
		
	}

}
