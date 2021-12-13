package inheritanceEx;

class Parent2{
	void show() {
		System.out.println("我是父類別");
	}
}

class Child2 extends Parent2{
	void show() {//重新定義版本
		System.out.println("我是子類別");
	}
	
	void show(String str) {//多重定義版本
		System.out.println(str);
	}
}

public class PolymorphismEx5 {

	public static void main(String[] args) {
		/*
		 * 多形的意義
		 * 
		 * 由於下層的類別一定包含了上層的成員，
		 * 可以使用上層類別的參照去指向一個下層類別的物件
		 */
		
		/*Parent2 p = new Parent2();
		Child2 c = new Child2();
		p.show();
		c.show();*/
		
		//p = c;// 等同 Parent2 p = new Child2();
		//p.show();
		Parent2 p = new Child2();
		p.show();
		/*
		 * 若Parent2與Child2有相同名稱的方法且參數與型別相同
		 * 會執行Child2的方法
		 * 
		 * 若是執行只有Parent2有的方法
		 * 就會執行Parent2的方法
		 * 
		 * 若是執行只有Child2的方法
		 * 會編譯錯誤
		 */
		/*
		 * 可再測試把10~12行隱蔽掉
		 * 再執行內容
		 * 結果會不一樣
		 */
	}

}
