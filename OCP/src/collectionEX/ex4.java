package collectionEX;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ex4 {

	public static void main(String[] args) {
		
		//Map���ϥΤ覡 <set, collection> // set���Ȥ��୫�ơA�Y���ƥH��̬��D
		//HashMap<String, Integer> x = new HashMap<String, Integer>();//�ç�Random
		TreeMap<String, Integer> x = new TreeMap<String, Integer>();//�|�Ƨ�
		x.put("java7", 600);
		x.put("java8", 500);
		x.put("java7", 700);
		
		System.out.println(x);

		Set<String> k = x.keySet();//��x��set�ȿW�ߥX�ө��k�̭�
		Collection<Integer> v = x.values();
		
		System.out.println(k);
		System.out.println(v);
	}

}
