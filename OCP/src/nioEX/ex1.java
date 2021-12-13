package nioEX;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex1 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP/test.txt");
		System.out.println(p1);
		System.out.println(p1.getFileName());
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		System.out.println(p1.getNameCount());
		System.out.println(p1.isAbsolute());//絕對路徑
		System.out.println(p1.toAbsolutePath());
		System.out.println(p1.toUri());//透過瀏覽器的網址
		
	}

}
