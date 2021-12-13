package ioEX;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEX {

	public static void main(String[] args) throws IOException {
		
		//讀取
		FileInputStream fis = new FileInputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/fis.txt");
		/*int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);//中文無法正確輸出
		}*/
		System.out.println("===============");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		/*int j;
		while((j=isr.read()) != -1) {
			System.out.print((char)j);//改編碼->正確輸出
		}*/
		System.out.println("===============");
		BufferedReader br = new BufferedReader(isr);
		int k;
		while((k=br.read()) != -1) {
			System.out.print((char)k);//
		}
	}
}
