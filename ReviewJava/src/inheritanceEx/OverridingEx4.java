package inheritanceEx;

class Parent{
	void show() {
		System.out.println("�ڬO�����O");
	}
}

class Child extends Parent{
	void show() {//���s�w�q
		System.out.println("�ڬO�l���O");
	}
}

public class OverridingEx4 {

	public static void main(String[] args) {
		// ���s�w�q�����O����kOverriding
		Child c = new Child();
		c.show();
	}

}
