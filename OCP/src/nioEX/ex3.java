package nioEX;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex3 {

	public static void main(String[] args) {
		
		String p = "/home/A/B";
		Path p1 = Paths.get(p).resolve("C/D");// �S�[ "/" �[��᭱
		System.out.println(p1);
		
		Path p2 = Paths.get(p).resolve("/I/J/K");// �[ "/" ���N
		System.out.println(p2);

	}

}
