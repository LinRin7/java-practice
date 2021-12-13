package lambdaEX;

interface book6<E>{
	
	void bookPrice(E price);
}

public class ex6 {

	public static void main(String[] args) {
		
		book6<Double> b = new book6<Double>() {

			@Override
			public void bookPrice(Double price) {
				
				System.out.println("price="+price);
			}
			
		};
		b.bookPrice(100.2);//不能int
		
		System.out.println("=========================");

		book6<Double> b2 = (Double price)->System.out.println("price="+price*0.95);
		b2.bookPrice(100.);

		System.out.println("=========================");

		book6<Integer> b3 = (/*Integer*/ price)->System.out.println("price="+price*0.95);
		b3.bookPrice(100);
	
		System.out.println("=========================");
		book6<Integer> b4 = cal::p1;
		book6<Double> b5 = cal::p2;
		//用p1 p2實作抽象方法
		b4.bookPrice(-10);
		b5.bookPrice(90.1);
	}

}

class cal{
	
	static void p1(Integer p) {
		if(p>0) {
			System.out.println("price="+p);
		}else {
			System.out.println("price need to > 0");
		}
	}
	
	static void p2(Double p) {
		if(p>0) {
			System.out.println("price="+p*0.9);
		}else {
			System.out.println("price need to > 0");
		}
	}
}
