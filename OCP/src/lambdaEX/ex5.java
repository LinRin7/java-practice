package lambdaEX;

import java.util.ArrayList;
import java.util.List;

interface book5<E>{
	
	E bookPrice(E price);
}

class Store1 implements book5<Integer>{

	@Override
	public Integer bookPrice(Integer price) {
		// TODO Auto-generated method stub
		return price;
	}
	
}

class Store2 implements book5<Double>{

	@Override
	public Double bookPrice(Double price) {
		// TODO Auto-generated method stub
		return price*0.95;
	}
	
}

public class ex5 {

	public static void main(String[] args) {
		
		book5[] b1 = new book5[2];
		b1[0] = new Store1();
		b1[1] = new Store2();
		
		System.out.println(b1[0].bookPrice(10));
		System.out.println(b1[1].bookPrice(10.));//Double 不能接收int，一定要有小數點
		System.out.println("=====================");
		
		ArrayList<book5> b2 = new ArrayList<book5>();
		b2.add(new Store1());
		b2.add(new Store2());
		
		System.out.println("=====================");
		
		List<book5> b3 = new ArrayList<book5>();
		b3.add(new Store1());
		b3.add(new Store2());
		
		System.out.println("=====================");
		
		ArrayList<book5<Integer>> b4 = new ArrayList<book5<Integer>>();//限定只能Integer
		b4.add(new Store1());
		//b4.add(new Store2());//錯誤 限定只能Integer
		
		/*for(book5 o:b2) {
			System.out.println(o.bookPrice(10));
		}*/
	}

}
