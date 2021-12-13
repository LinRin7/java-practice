package inheritanceEx;

class Shape{//�N��ϧΪ����O
	protected double x, y;//�y��
	
	public Shape(){
		
	}
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "�ϧέ��I:(" + x + "," + y + ")";
	}
}


class Rectangle extends Shape{
	private double w, h;//�x�Ϊ��e�P��
	
	public Rectangle() {
		
	}
	
	public Rectangle(double x, double y, double w, double h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
}


class Circle3 extends Shape{
	private double r;//�b�|
	
	public Circle3() {
		
	}
	
	public Circle3(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}
}


class Cylinder3 extends Circle3{
	private double h;//��W����
	
	public Cylinder3() {
		
	}
	
	public Cylinder3(double x, double y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}
}



public class HieraInheriEx3 {

	public static void main(String[] args) {
		//�h�h�~��
		Rectangle re = new Rectangle(3, 6, 7, 9);
		Circle3 ci = new Circle3(5, 8, 7);
		Cylinder3 cy = new Cylinder3(4, 2, 6, 3);
		
		System.out.println(re.toString());
		System.out.println(ci.toString());
		System.out.println(cy.toString());

	}

}
