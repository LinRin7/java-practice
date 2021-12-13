package testEX;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MyUtil1<T>{
	
	T show1(T t) {
		return t;
	}
	
	void show2(String x) {
		
	}
}

class MyUtil2{
	
	<T>T show1(T t){
		return t;
	}
	
	/*<Q>Q show3(Q q){
		return q;
	
	}*/
	void show2(String x) {
		
	}
}

class MyUtil3{					//?為T的父類別(或?本身自己)(下限)
	static<T>T copy(Collection<? super T> target, Collection<T> source){
		
		T result = null;
		for(T o:source) {
			result = o;
			target.add(result);
		}
		
		return result;
	}
}

public class ex5 {

	public static void main(String[] args) {
		//泛型碰到多型的應用
		MyUtil1<Integer> m = new MyUtil1<>();
		m.show1(100);
		m.show2("abcde");
		
		MyUtil2 m2 = new MyUtil2();
		m2.show1(200);
		//m2.show1("200");
		m2.show2("gggggg");
		
		List<Number> ln = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(80);
		//ln.add(5);
		Integer i = MyUtil3.copy(ln, li);
		
	}

}
