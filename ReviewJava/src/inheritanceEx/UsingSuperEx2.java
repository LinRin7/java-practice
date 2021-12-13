package inheritanceEx;

class Circle2{
	private double x, y;//���
	private double r;//�b�|
	
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
		return "���:(" + x + "," + y + "), �b�|:" + r;
	}	
}

class Cylinder2 extends Circle2{
	private double h;//��
	
	public Cylinder2(){
		
	}
	
	public Cylinder2(double x, double y, double r, double h){
		super(x, y, r);////�I�s�����O���غc��k
		this.h = h;
		/*
		 * �l���O�u��l�Ʀۤv�������ܼơA�~�ӦӨӪ������ܼ�(private)�h��Ѥ����O���غc��k����l��
		 */
	}
}

public class UsingSuperEx2 {

	public static void main(String[] args) {
		
		Cylinder2 cr = new Cylinder2(1, 2, 3, 4);
		System.out.println(cr.toString());
		
	}

}
