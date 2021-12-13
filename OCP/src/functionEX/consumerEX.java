package functionEX;

import java.util.function.Consumer;

public class consumerEX {

	public static void main(String[] args) {
		
		//��J���Q�n����ƫ��A���Ѽ�
		Consumer<String> c1 = new Consumer<String>() {//���g�n���檺�B�J

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
		
		Consumer<String> c3 = cal2::a1;//��@���e��cal2��a1
		//Consumer<String> c3 = cal2::a2;
		c3.accept("123");
		System.out.println("====================");
		
		Consumer<String> c4 = System.out::println;//out�O����A ::�O��@���N��A��println��@��@�����e
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
