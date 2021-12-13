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
		//set不能重複，是指stack(記憶體位址)不能重複，所以下面範例的資料還是兩筆
		x.add(new student("a", 66, 80));
		x.add(new student("a", 66, 80));*/
		
		TreeSet<student> x = new TreeSet();//排序由小到大
		//PriorityQueue<student> x = new PriorityQueue();//保證第一個是最小(或最大值)//二元樹
		//因為要排序，所以物件要設定一個欄位當排序索引值，否則run失敗
		//使用TreeSet 當設定的索引值一樣的時候，只會保留前者的那一筆資料
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
