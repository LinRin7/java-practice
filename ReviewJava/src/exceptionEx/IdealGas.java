package exceptionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * throw �ۦ�ߥX�ҥ~
 * 
 */

public class IdealGas {

	public static void main(String[] args) throws IOException {
		
		int[] temp = {0, 15, 20, 25};
		System.out.println("�p�����0, 15, 20, 25�פU�A�z�Q������n");
		System.out.println("�п�J�j�����O(atm)->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		//double pressure = Double.parseDouble(str);
		try {
			double pressure = Double.parseDouble(str);
			if(pressure == 0) {
				//�ۭq���ҥ~���O�@�w�n�OThrowable���l�����O
				throw new ValueException("��J���ȱN�ϰ��Ƭ��s");
			}else if(pressure < 0) {
				throw new ValueException("�L�k�p��t��");
			}
		}catch(ValueException e){
			System.out.println("�o�ͨҥ~:" + e);
		}catch(NumberFormatException e) {
			System.out.println("��J����Ʀ��~");
			System.out.println("�o�ͨҥ~:" + e);
		}
	}
}

//�ۭq�ҥ~���O
class ValueException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValueException(String s) {
		super(s);
	}
}
