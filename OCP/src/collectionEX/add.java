package collectionEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * 
 * @author Lin
 *
 */

public class add {

	public static void main(String[] args) {
		
		//student[] s = new student[3];
		//s[0] = new student("a", 60, 80);
		
		//ArrayList<student> x = new ArrayList<student>();
		/*x.add(new student("a", 80, 90));
		x.add(new student("b", 10, 20));
		x.add(new student("c", 100, 70));
		x.add(new student("d", 60, 60));
		x.add(new student("e", 50, 80));*/
		
		/*HashSet<student> x = new HashSet();
		//set���୫�ơA�O��stack(�O�����})���୫�ơA�ҥH�U���d�Ҫ�����٬O�ⵧ
		x.add(new student("a", 66, 80));
		x.add(new student("a", 66, 80));*/
		
		TreeSet<student> x = new TreeSet();//�ƧǥѤp��j
		//PriorityQueue<student> x = new PriorityQueue();//�O�ҲĤ@�ӬO�̤p(�γ̤j��)//�G����
		//�]���n�ƧǡA�ҥH����n�]�w�@������Ƨǯ��ޭȡA�_�hrun����
		//�ϥ�TreeSet ��]�w�����ޭȤ@�˪��ɭԡA�u�|�O�d�e�̪����@�����
		x.add(new student("a", 80, 90));
		x.add(new student("b", 10, 20));
		x.add(new student("c", 100, 70));
		x.add(new student("d", 60, 60));
		x.add(new student("e", 50, 80));
		
		
		
		for(student s:x) {
			s.show();
			System.out.println("\n");
		}
	}

}
