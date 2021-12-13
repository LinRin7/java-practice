package ioEX;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriterEX {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:/Users/Lin/Desktop/JAVA/OCP/day16/test.txt");
		fw.write("abcde");//ÂÐ»\
		//fw.flush();
		fw.close();
	}

}
