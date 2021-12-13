package streamEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class streamEx1 {

	public static void main(String[] args) {
		//List + function + lambda = stream
		/*List<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(3);
		x.add(100);
		x.add(20);
		x.add(30);
		x.add(40);*/
		List<Integer> x = Arrays.asList(10, 3, 9, 100, 40);
		System.out.println(x);
		Collections.sort(x);
		for(Integer o:x) {
			System.out.print(o+" ");
		}
		System.out.println("\n=========================");
		
		int[] a = new int[] {10, 20, 56};
		funCal.abc(a);
		System.out.println("");
		funCal.abc2(a);
		System.out.println("");
		funCal.abc2(13, 16, 56, 44, 50);// ... ->可以這樣寫
	}

}

class funCal{
	
	static void abc(int[] x) {
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
	
	static void abc2(int... x) {//參數列, 可視為一維陣列，只能一個不能多個，也不能做多維
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
	
	/*static void abc4(int... x, int... y) {//error
		
	}*/
}