package exceptionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * throw 自行拋出例外
 * 
 */

public class IdealGas {

	public static void main(String[] args) throws IOException {
		
		int[] temp = {0, 15, 20, 25};
		System.out.println("計算攝氏0, 15, 20, 25度下，理想氣體體積");
		System.out.println("請輸入大氣壓力(atm)->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		//double pressure = Double.parseDouble(str);
		try {
			double pressure = Double.parseDouble(str);
			if(pressure == 0) {
				//自訂的例外類別一定要是Throwable的衍生類別
				throw new ValueException("輸入的值將使除數為零");
			}else if(pressure < 0) {
				throw new ValueException("無法計算負值");
			}
		}catch(ValueException e){
			System.out.println("發生例外:" + e);
		}catch(NumberFormatException e) {
			System.out.println("輸入的資料有誤");
			System.out.println("發生例外:" + e);
		}
	}
}

//自訂例外類別
class ValueException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValueException(String s) {
		super(s);
	}
}
