package javaAPI;

public class StringEX {

	public static void main(String[] args) {
		
		String str = "A dog ";//char[]
		System.out.println(str.length());
		System.out.println(str.concat("!"));//�r��᭱�[! �������ܼ�
		System.out.println(str);
		//str = str.concat("!");//�r��᭱�[! �s�i�ܼ�
		//System.out.println(str);
		System.out.println(str.trim().length());//trim() �e��R���Ů�
		System.out.println(str.indexOf("d"));
		System.out.println(str.charAt(2));
		System.out.println(str.substring(2, 5));//2~4  2<=�l�r��<5  
		System.out.println(str.replace("dog", "cat"));
		System.out.println(str.equals("a DOG "));//�O�_����
		System.out.println(str.equalsIgnoreCase("a DOG "));//�O�_���� �����j�p�g
		System.out.println(str.startsWith("A d"));//�ˬd�}�Y�O�_����
		System.out.println(str.endsWith("g "));//�ˬd�����O�_����
		System.out.println(str.toLowerCase());//�����ܤp�g
		System.out.println(str.toUpperCase());//�����ܤj�g
		System.out.println(str);
	}

}
