package abstractClassEx;

abstract class Land{
	/*
	 * 抽象類別不應該用來產生物件
	 * 能夠確保所有繼承Land的衍生類都會有該抽象類別的方法(必須實作)
	 * 可比較 inheritanceEx 的 LandsEx6
	 * 擁有抽象方法的類別一定要標註為抽象類別;一個抽象類別卻未必要擁有抽象方法
	 */
	abstract double area();//計算面積的抽象方法
}

class Circle extends Land{

	private int r;//半徑
	
	public Circle() {
		
	}
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	double area() {//實作抽象方法
		
		return 3.14*r*r;
	}
	
}

class Square extends Land{
	private int side;
	
	public Square() {
		
	}
	
	public Square(int side) {
		this.side = side;
	}

	@Override
	double area() {//實作抽象方法
		
		return side * side;
	}
}

public class AbstractLandEx1 {

	public static void main(String[] args) {
		

	}

}
