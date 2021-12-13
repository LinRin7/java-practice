package nioEX;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ex8 {

	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP/test.txt");
		Charset cs = Charset.defaultCharset();
		List<String> l = Files.readAllLines(p);
		
		Path p2 = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP/a.html").toAbsolutePath();
		Files.write(p2, l, cs, StandardOpenOption.TRUNCATE_EXISTING);
		System.out.println("finish");
		
	}

}
