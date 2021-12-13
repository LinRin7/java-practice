package inheritanceEx;

class Land{//代表任何形狀土地的父類別
	public  double area() {//計算面積
		return 0;
	}
}


class Circle6 extends Land{//
	private int r;//
	
	public Circle6() {
		
	}
	
	public Circle6(int r) {//建構方法
		this.r = r;
	}
	
	public double area() {//重新定義的版本
		return 3.14*r*r;
	}
}


class Square6 extends Land{//正方形的土地
	private int side;//邊長
	
	public Square6() {
		
	}
	
	public Square6(int side) {
		this.side = side;
	}
	
	public double area() {
		return side*side;
	}
}


class Calculator{//計算
	private double price;
	
	public Calculator(){
		
	}
	
	public Calculator(double price) {
		this.price = price;
	}
	
	public double calculatePrice(Land l) {
		return l.area() * price;
	}
	
}

public class LandsEx6 {

	public static void main(String[] args) {
		// 使用繼承與多形解決不斷修改程式的問題
		Circle6 c = new Circle6(5);
		Square6 s = new Square6(5);
		
		Calculator ca = new Calculator(3000);
		
		System.out.println("c 這塊地值" + ca.calculatePrice(c));
		//參數應放入型態為Land -> Land c = new Circle(5);
		System.out.println("s 這塊地值" + ca.calculatePrice(s));
		//參數應放入型態為Land -> Land s = new Square(5);
		
	}

}
