package collectionEX;

import java.util.ArrayList;
import java.util.Collections;

public class ex3 {

	public static void main(String[] args) {
		
		//動態陣列的方法
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		x.add(60);
		x.add(10);
		x.add(30);
		x.add(80);
		x.add(50);
		
		System.out.println(x);
		System.out.println("=============================");
		
		x.add(2, 67);
		System.out.println(x);
		System.out.println("=============================");
		
		x.add(3, null);
		System.out.println(x);
		System.out.println("=============================");
	
		System.out.print(x);
		System.out.println("\tx.get(4) = "+x.get(4));
		System.out.println("=============================");
		
		x.remove(3);
		System.out.println(x);
		System.out.println("=============================");
		
		Collections.sort(x);
		System.out.println(x);
		System.out.println("==================");
		
		
		System.out.println(Collections.binarySearch(x, 30));
		System.out.println(Collections.binarySearch(x, 1));
		System.out.println("==================");
		
		
		
		System.out.println("==================");
		
		
		
		System.out.println("==================");
		
		
	}
}