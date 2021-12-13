package designEX;

public class test2 {

	public static void main(String[] args) {
		
		/*A a = new A("a");
		B b = new B("b");
		
		style1 s = new style1(a, b);*/
		style1 s = new style1(new A("a"), new B("b"));
		
		//System.out.println(s.getA().getName());
		//System.out.println(s.getB().getName());
		
		s.show();
		s.getA().setName("a2");
		s.getB().setName("b2");
		
		s.show();
		
	}

}
