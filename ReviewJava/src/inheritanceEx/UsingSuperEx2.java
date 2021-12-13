package inheritanceEx;

class Circle2{
	private double x, y;//圓心
	private double r;//半徑
	
	public Circle2(){
		
	}
	
	public Circle2(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void setCenter(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public String toString() {
		return "圓心:(" + x + "," + y + "), 半徑:" + r;
	}	
}

class Cylinder2 extends Circle2{
	private double h;//高
	
	public Cylinder2(){
		
	}
	
	public Cylinder2(double x, double y, double r, double h){
		super(x, y, r);////呼叫父類別的建構方法
		this.h = h;
		/*
		 * 子類別只初始化自己的成員變數，繼承而來的成員變數(private)則交由父類別的建構方法做初始化
		 */
	}
}

public class UsingSuperEx2 {

	public static void main(String[] args) {
		
		Cylinder2 cr = new Cylinder2(1, 2, 3, 4);
		System.out.println(cr.toString());
		
	}

}
