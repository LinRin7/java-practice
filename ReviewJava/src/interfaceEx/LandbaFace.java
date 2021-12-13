package interfaceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 若匿名類別要實作的方法只有一個的話，則可以改用Lamdba來更加簡化程式
 * 此時只需要撰寫方法的參數跟程式主體即可
 * 基本語法: (方法的參數)->方法的主體
 */

interface Face2{
	void smile(String str);
}

public class LandbaFace {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			System.out.print("輸入台詞:");
			 str = br.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Face2 c = (s)->System.out.println("(^_^) 說" + s + "!");
		c.smile(str);

	}

}
