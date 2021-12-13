package ioEX;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamEX {

	public static void main(String[] args) throws IOException {
		//寫入
		//FileOutputStream fos = new FileOutputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/fos.txt");
		//fos.write(65);
		
		//結合outputStreamWriter --> 串接 --> Object注入 --> inject --> argument
		//OutputStreamWriter osw = new OutputStreamWriter(fos);//串接 --> Object注入
		//osw.write("asduyfoihwefu\njaifuhiuhsua");
		//osw.close();
		
		//BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/fos.txt")));
		
		bw.write("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		bw.close();
	}

}
