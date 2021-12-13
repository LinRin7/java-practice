package ioEX;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderEX {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/Lin/Desktop/JAVA/OCP/day16/test.txt");
		//System.out.println((char)fr.read());//char -> ascll//只讀一個字元
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
	}

}
