package ioEX;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEX {

	public static void main(String[] args) throws IOException {
		
		//Ū��
		FileInputStream fis = new FileInputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/fis.txt");
		/*int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);//����L�k���T��X
		}*/
		System.out.println("===============");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		/*int j;
		while((j=isr.read()) != -1) {
			System.out.print((char)j);//��s�X->���T��X
		}*/
		System.out.println("===============");
		BufferedReader br = new BufferedReader(isr);
		int k;
		while((k=br.read()) != -1) {
			System.out.print((char)k);//
		}
	}
}
