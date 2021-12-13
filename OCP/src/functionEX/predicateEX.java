package functionEX;

import java.util.function.Predicate;

public class predicateEX {

	public static void main(String[] args) {
		
		//��J������J���Ѽƫ��A(����Integer) �^��boolean
		Predicate<Integer> p = new Predicate<Integer>() {//�g�P�_��

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t>=0;
			}
		};
		
		System.out.println(p.test(100));
		System.out.println("========================");
		
		Predicate<Double> p2 = (t)->t>=10;
		System.out.println(p2.test(4.5));
		System.out.println("========================");
		
		Predicate<Integer> p3 = cal1::p1;//��@test�覡�bcal1��p1
		Predicate<Double> p4 = cal1::p2;
		System.out.println(p3.test(100));
		System.out.println(p4.test(100.1));
	}

}

class cal1{
	
	static boolean p1(Integer t) {
		t = t+100;
		t=2*t;
		return t>50;
	}
	
	static boolean p2(Double t) {
		t = t-100;
		t=2/t;
		return t>50;
	}
}