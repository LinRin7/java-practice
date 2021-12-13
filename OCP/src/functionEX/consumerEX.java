package functionEX;

import java.util.function.Consumer;

public class consumerEX {

	public static void main(String[] args) {
		
		//輸入的想要的資料型態的參數
		Consumer<String> c1 = new Consumer<String>() {//撰寫要執行的步驟

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}	
		};
		
		c1.accept("hello java");
		System.out.println("====================");
		
		Consumer<String> c2 = t->System.out.println("message= "+t);
		c2.accept("hello");
		System.out.println("====================");
		
		Consumer<String> c3 = cal2::a1;//實作內容為cal2的a1
		//Consumer<String> c3 = cal2::a2;
		c3.accept("123");
		System.out.println("====================");
		
		Consumer<String> c4 = System.out::println;//out是物件， ::是實作的意思，拿println當作實作的內容
		c4.accept("apple");
	}

}

class cal2{
	
	static void a1(String t) {
		if(t.equals("abc")) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	static void a2(String t) {
		int T = Integer.parseInt(t);
		if(T>10) {
			System.out.println(T*2);
		}else {
			System.out.println(0);
		}
	}
}
