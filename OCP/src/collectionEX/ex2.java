package collectionEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class ex2 {

	public static void main(String[] args) {
		
		
		//動態陣列的各種排序
		//ArrayList<Integer> x = new ArrayList();//照順序
		//HashSet<Integer> x = new HashSet();//亂序
		//TreeSet<Integer> x = new TreeSet();//由小到大
		PriorityQueue<Integer> x = new PriorityQueue();//保證第一個元素一定是最小(或最大)
		x.add(70);
		x.add(20);
		x.add(50);
		
		for(Integer o:x) {
			System.out.print(o+"\t");
		}
		
		System.out.println("\n======================");
		
		x.add(100);
		x.add(10);
		for(Integer o:x) {
			System.out.print(o+"\t");
		}
	}
}
