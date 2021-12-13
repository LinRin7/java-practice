package ioEX;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEX {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/Order.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Order("abc", 6, 8));
		oos.writeObject(new Order("請先", 10, 20));
		oos.writeObject(new Order("說", 2, 100));
		oos.writeObject(new Order("你好", 400, 500));
		oos.writeObject(new Order("hello", 1, 1));
	}

}
