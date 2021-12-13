package streamEX;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class streamEx5 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12, 44, 1, 89, 5);
		Predicate<Integer> p = (t)->t>30;
		l
		.stream()//list物件 -> stream物件
		.sorted()
		.filter(p)
		.forEach((t)->System.out.print("數字="+t+"\t"));
		System.out.println("\n=======================");
		
		Arrays
		.asList(3, 46, 1, 33, 70)
		.stream()
		.sorted()
		.filter((t)-> t>=30 && t<=50)
		.forEach((t)->System.out.print("t="+t+" "));
		System.out.println("\n=======================");
		
		Arrays
		.asList(2, 60, 52, 35, 38)
		.stream()
		.sorted()
		.filter(cal::p1)
		.forEach(cal::p2);
	}

}

class cal{
	
	static boolean p1(Integer n) {
		
		n=n+5;
		return n>=30 && n<=60;
	}
	
	static void p2(Integer n) {
		if(n>40) {
			System.out.print(n+" ");
		}else {
			System.out.print(n+"x ");
		}
		
	}
}
