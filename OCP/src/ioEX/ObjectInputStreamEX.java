package ioEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEX {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:/Users/Lin/Desktop/JAVA/OCP/day16/Order.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//System.out.println(ois.readObject());//記憶體位置
		//((Order)ois.readObject()).show();//只讀一筆，若無->EOFException->End of file
		int amount = 0;
		while(true) {
			try {
				//((Order)ois.readObject()).show();
				//((Order)ois.readObject()).show2();
				System.out.println(((Order)ois.readObject()));
				amount++;
			}catch(java.io.EOFException e) {
				System.out.println("end");
				break;
			}
			
		}
		
		/*while(true) {
			try {
				System.out.println(ois);
				if(((Order)ois.readObject()).getName().equals("hello")) {//抓到例外，直接break
					((Order)ois.readObject()).show();
					System.out.println("this data");
				}else {
					System.out.println("no data");
				}
				amount++;
			}catch(java.io.EOFException e) {
				System.out.println("end");
				break;
			}
			
		}*/
		System.out.println(amount);
	}

}
