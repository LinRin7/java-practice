package nioEX;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex4 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("peter");
		System.out.println(p1);
		
		Path p2 = Paths.get("john");
		Path p3 = p1.relativize(p2);//p2的相對路徑
		System.out.println(p3);// .. => 上一頁
		
		Path p4 = p2.relativize(p1);
		System.out.println(p4);
		
		Path p5 = Paths.get("A/B/C/D/DD/E.txt");
		Path p6 = Paths.get("A/B/C/D");
		Path p7 = p5.relativize(p6);
		System.out.println(p7);
		p7 = p6.relativize(p5);
		System.out.println(p7);
		
	}

}
