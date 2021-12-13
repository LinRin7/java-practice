package inheritanceEx;

class Parent{
	void show() {
		System.out.println("我是父類別");
	}
}

class Child extends Parent{
	void show() {//重新定義
		System.out.println("我是子類別");
	}
}

public class OverridingEx4 {

	public static void main(String[] args) {
		// 重新定義父類別的方法Overriding
		Child c = new Child();
		c.show();
	}

}
