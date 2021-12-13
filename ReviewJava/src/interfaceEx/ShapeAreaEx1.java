package interfaceEx;
/*
 * 在Interface之前也可加上Public、protected等存取控制字符，其功效和類別相同。
 * 		因此若不加，則只能在同一個Package上使用
 * 在介面中只能定義方法的型別(回傳值)和參數型別，不可定義方法本體(和抽象類別相同)。
 * 這些方法預設都會自動成為public abstract的公開抽象方法
 * 由於介面通常代表某種特性
 */

interface Surfacing{
	/*
	 * 介面也可以擁有成員變數
	 * 在介面中選告的變數會自動擁有public static final的存取控制
	 * 必須在宣告時即指定初始值
	 */
	double PI = 3.14159;//定義常數
	double area();//計算面積的方法
}

class Shape{//代表圖形原點的類別
	protected double x, y;//座標
	
	public Shape() {
		
	}
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "圖形原點:(" + x + ", " + y + ")";
	}
}


class Circle extends Shape implements Surfacing{
	private double r;//圓形半徑
	final static double PI = 3.14159;
	
	public Circle() {
		
	}
	
	public Circle(double x, double y, double r) {
		super(x, y);//呼叫父類別的建構方法
		this.r = r;
	}

	@Override
	public double area() {
		return PI*r*r;
	}
	
	public String toString() {
		return "圓心:(" + x + ", " + y + ")\n半徑:" + r + "\n面積:" + area();
	}
}



public class ShapeAreaEx1 {

	public static void main(String[] args) {
		Circle c = new Circle(5, 8, 7);
		System.out.println(c.toString());
		System.out.println(Surfacing.PI);
		System.out.println(c.PI);//Circle.PI
	}

}
