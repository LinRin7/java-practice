package inheritanceEx;

class Circle{
	private double x, y;//���
	private double r;//�b�|
	
	public Circle(){
		System.out.println("...���b����Circle()�غc��k...");
	}
	
	public void setCenter(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public String toString() {
		return "���:(" + x + "," + y + "), �b�|:" + r;
	}	
}


class Cylinder extends Circle{//��W�~�Ӷ��
	
	public Cylinder(){
		//super();//�|����������O���غc��k//�w�]�q�{super()
		System.out.println("...���b����Cylinder()�غc��k...");
	}
}


public class AutoCallEx1 {

	public static void main(String[] args) {
		
		Cylinder cr = new Cylinder();
		/*
		 * JAVA�b�غc�l����ɷ|����l���~�ӦӨӪ�����
		 * 
		 */
		
		cr.setCenter(3, 4);//�I�s�~�ӨӪ���k
		cr.setRadius(5);
		System.out.println(cr.toString());

	}

}
