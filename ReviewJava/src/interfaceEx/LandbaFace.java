package interfaceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �Y�ΦW���O�n��@����k�u���@�Ӫ��ܡA�h�i�H���Lamdba�ӧ�[²�Ƶ{��
 * ���ɥu�ݭn���g��k���ѼƸ�{���D��Y�i
 * �򥻻y�k: (��k���Ѽ�)->��k���D��
 */

interface Face2{
	void smile(String str);
}

public class LandbaFace {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			System.out.print("��J�x��:");
			 str = br.readLine();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Face2 c = (s)->System.out.println("(^_^) ��" + s + "!");
		c.smile(str);

	}

}
