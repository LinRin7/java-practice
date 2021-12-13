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
	private static int i2 = 200;//第三段->static的存取
	
	public Child7() {
		
	}
	
	public Child7(int i) {
		super(i);//有super()的話，一定要寫在前面//呼叫父類別的建構方法//第四段
		this.i = i;
	}
	
	public void show1() {
		System.out.println("super.i = " + super.i);//如果是private 則無法super//第一段
		System.out.println("c.i = " + i);
	}
	
	public void show2() {
		System.out.println("i = " + i);
		super.show2();//使用super呼叫父類別的方法//第二段
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
		Parent7 p = new Child7();//P是Parent型別的參照，所以存取的是Parent類別中所定義的成員變數，而非Child
		System.out.println("p.i = " + p.i);
		System.out.println("=====================");
		
		c.show2();
		System.out.println("=====================");
		
		Child7 c1 = new Child7();
		Child7 c2 = new Child7();
		System.out.println("c1.i2 = " + c1.getI2());
		c2.setI2(80);//更改的是Child類別內的i2
		System.out.println("c1.i2 = " + c1.getI2());
		Parent7 p2 = c1;
		System.out.println("p2.i2 = " + p2.i2);
		System.out.println("=====================");
		
		/*
		 * 父類別的建構方法不能繼承
		 * 而只能呼叫父類別的建構方法 使用super()
		 */
		Child7 c3 = new Child7(1000);
		System.out.println("c3.i = " + c3.getI());
		System.out.println("super(i) = " + c3.getSuperI());
	}

}
