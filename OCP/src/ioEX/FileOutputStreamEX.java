package ioEX;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamEX {

	public static void main(String[] args) throws IOException {
		//�g�J
		//FileOutputStream fos = new FileOutputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/fos.txt");
		//fos.write(65);
		
		//���XoutputStreamWriter --> �걵 --> Object�`�J --> inject --> argument
		//OutputStreamWriter osw = new OutputStreamWriter(fos);//�걵 --> Object�`�J
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
