package collectionEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class ex2 {

	public static void main(String[] args) {
		
		
		//�ʺA�}�C���U�رƧ�
		//ArrayList<Integer> x = new ArrayList();//�Ӷ���
		//HashSet<Integer> x = new HashSet();//�ç�
		//TreeSet<Integer> x = new TreeSet();//�Ѥp��j
		PriorityQueue<Integer> x = new PriorityQueue();//�O�ҲĤ@�Ӥ����@�w�O�̤p(�γ̤j)
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
