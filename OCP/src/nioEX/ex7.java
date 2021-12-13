package nioEX;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex7 {

	public static void main(String[] args) {
		
		Path p = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP");
		try {
			DirectoryStream<Path> t = Files.newDirectoryStream(p, "*");
			System.out.println(t);
			for(Path o:t) {
				System.out.println(o);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
