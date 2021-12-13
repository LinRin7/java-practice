package designEX;

public class test3 {

	public static void main(String[] args) {
		
		style2 x = new style2();
		A[] a = new A[] {
				new A("a"),
				new A("a2")
		};
		B[] b = new B[] {
				new B("b"),
				new B("b2")
		};
		
		style2 x2 = new style2(a, b);

	}

}
