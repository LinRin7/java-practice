package inheritanceEx;

class Shape{//代表圖形的類別
	protected double x, y;//座標
	
	public Shape(){
		
	}
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "圖形原點:(" + x + "," + y + ")";
	}
}


class Rectangle extends Shape{
	private double w, h;//矩形的寬與高
	
	public Rectangle() {
		
	}
	
	public Rectangle(double x, double y, double w, double h) {
		super(x, y);
		this.w = w;
		this.h = h;
	}
}


class Circle3 extends Shape{
	private double r;//半徑
	
	public Circle3() {
		
	}
	
	public Circle3(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}
}


class Cylinder3 extends Circle3{
	private double h;//圓柱高度
	
	public Cylinder3() {
		
	}
	
	public Cylinder3(double x, double y, double r, double h) {
		super(x, y, r);
		this.h = h;
	}
}



public class HieraInheriEx3 {

	public static void main(String[] args) {
		//多層繼承
		Rectangle re = new Rectangle(3, 6, 7, 9);
		Circle3 ci = new Circle3(5, 8, 7);
		Cylinder3 cy = new Cylinder3(4, 2, 6, 3);
		
		System.out.println(re.toString());
		System.out.println(ci.toString());
		System.out.println(cy.toString());

	}

}
