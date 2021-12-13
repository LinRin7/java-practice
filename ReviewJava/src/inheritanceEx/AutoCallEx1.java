package inheritanceEx;

class Circle{
	private double x, y;//圓心
	private double r;//半徑
	
	public Circle(){
		System.out.println("...正在執行Circle()建構方法...");
	}
	
	public void setCenter(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public String toString() {
		return "圓心:(" + x + "," + y + "), 半徑:" + r;
	}	
}


class Cylinder extends Circle{//圓柱繼承圓形
	
	public Cylinder(){
		//super();//會先執行父類別的建構方法//預設默認super()
		System.out.println("...正在執行Cylinder()建構方法...");
	}
}


public class AutoCallEx1 {

	public static void main(String[] args) {
		
		Cylinder cr = new Cylinder();
		/*
		 * JAVA在建構子物件時會先初始化繼承而來的部分
		 * 
		 */
		
		cr.setCenter(3, 4);//呼叫繼承來的方法
		cr.setRadius(5);
		System.out.println(cr.toString());

	}

}
