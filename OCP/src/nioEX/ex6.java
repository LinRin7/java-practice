package nioEX;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ex6 {

	public static void main(String[] args) {
		
		Path p = Paths.get("C:/Users/Lin/Desktop/JAVA/OCP/a.html");
		try {
			URL url = URI.create("https://www.gamer.com.tw/").toURL();
			InputStream fo = url.openStream();
			
			Files.copy(fo, p, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("งนฆจ");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
