package designEX;

public class test1 {

	public static void main(String[] args) {
		
		style1 s1 = new style1();
		System.out.println(s1);
		s1.getA().setName("aa");// getA() -> 取得A物件 dependency
		s1.getB().setName("bb");
		s1.show();
	}

}
