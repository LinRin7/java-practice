package javaAPI;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//StringBuilder sb = "A dog ";//StringBuilder != String -> error
		StringBuilder sb = new StringBuilder("A dog ");
		//StringBuilder����k�ϥιL��A�|��������ܼ�
		System.out.println(sb);
		System.out.println(sb.append("!"));//�᭱�W�[�r��
		System.out.println(sb);//�w���
		System.out.println(sb.indexOf("d"));
		System.out.println(sb.insert(3, "ooooooooo"));//�q��m3 ���J
		System.out.println(sb);//�w���
		System.out.println(sb.replace(2, 6, "DOOO"));// 2<= �����r�� <6 //���|���
		System.out.println(sb);//�w���
		System.out.println(sb.substring(2, 6));// �l�r����d�� 2<= x <6 //���|���sb
		System.out.println(sb.delete(2, 6));//�R����m2~6(���]�t6)���r�� //���|���
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb);
		
		
		
	}

}
