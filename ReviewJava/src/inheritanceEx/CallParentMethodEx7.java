package inheritanceEx;

class Parent7{
	protected int i=10;
	protected static int i2 = 100;
	
	public Parent7() {
		
	}
	
	public Parent7(int i) {
		this.i = i;
	}
	
	public void show2() {
		System.out.println("i = " + i);
	}
}

class Child7 extends Parent7{
	private int i=20;
	private static int i2 = 200;//�ĤT�q->static���s��
	
	public Child7() {
		
	}
	
	public Child7(int i) {
		super(i);//��super()���ܡA�@�w�n�g�b�e��//�I�s�����O���غc��k//�ĥ|�q
		this.i = i;
	}
	
	public void show1() {
		System.out.println("super.i = " + super.i);//�p�G�Oprivate �h�L�ksuper//�Ĥ@�q
		System.out.println("c.i = " + i);
	}
	
	public void show2() {
		System.out.println("i = " + i);
		super.show2();//�ϥ�super�I�s�����O����k//�ĤG�q
	}
	
	public int getI() {
		return i;
	}
	
	public int getSuperI() {
		return super.i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI2() {
		return i2;
	}
	
	public void setI2(int i2) {
		this.i2 = i2;
	}
}

public class CallParentMethodEx7 {

	public static void main(String[] args) {
		Child7 c = new Child7();
		c.show1();
		Parent7 p = new Child7();//P�OParent���O���ѷӡA�ҥH�s�����OParent���O���ҩw�q�������ܼơA�ӫDChild
		System.out.println("p.i = " + p.i);
		System.out.println("=====================");
		
		c.show2();
		System.out.println("=====================");
		
		Child7 c1 = new Child7();
		Child7 c2 = new Child7();
		System.out.println("c1.i2 = " + c1.getI2());
		c2.setI2(80);//��諸�OChild���O����i2
		System.out.println("c1.i2 = " + c1.getI2());
		Parent7 p2 = c1;
		System.out.println("p2.i2 = " + p2.i2);
		System.out.println("=====================");
		
		/*
		 * �����O���غc��k�����~��
		 * �ӥu��I�s�����O���غc��k �ϥ�super()
		 */
		Child7 c3 = new Child7(1000);
		System.out.println("c3.i = " + c3.getI());
		System.out.println("super(i) = " + c3.getSuperI());
	}

}
