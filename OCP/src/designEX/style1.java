package designEX;

public class style1 {

	private A a;
	private B b;
	
	public style1() {
		super();
		a = new A();
		b = new B();
	}

	public style1(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	public void show() {
		System.out.println("nameA="+getA().getName()+
				"\nnameB="+getB().getName());
	}
	
	
}
