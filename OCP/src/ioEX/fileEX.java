package ioEX;

import java.io.File;
import java.io.IOException;

public class fileEX {

	public static void main(String[] args) throws IOException {
		
		//¶}·sÀÉ®×
		File f = new File("C:/Users/Lin/Desktop/JAVA/OCP/day16/test.txt");
		f.createNewFile();
		
		//File f = new File("C:/Users/Lin/Desktop/JAVA/OCP/day16/ABC");
		//f.mkdir();
		
		//File f=new File("C:/Users/Lin/Desktop/JAVA/OCP/day16/DEF/RRR/YYY");
		//f.mkdirs();
	}

}
