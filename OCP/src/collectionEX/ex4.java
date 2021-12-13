package collectionEX;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ex4 {

	public static void main(String[] args) {
		
		//Map的使用方式 <set, collection> // set的值不能重複，若重複以後者為主
		//HashMap<String, Integer> x = new HashMap<String, Integer>();//亂序Random
		TreeMap<String, Integer> x = new TreeMap<String, Integer>();//會排序
		x.put("java7", 600);
		x.put("java8", 500);
		x.put("java7", 700);
		
		System.out.println(x);

		Set<String> k = x.keySet();//把x的set值獨立出來放到k裡面
		Collection<Integer> v = x.values();
		
		System.out.println(k);
		System.out.println(v);
	}

}
