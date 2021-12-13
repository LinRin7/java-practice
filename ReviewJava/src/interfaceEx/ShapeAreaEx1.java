package interfaceEx;
/*
 * �bInterface���e�]�i�[�WPublic�Bprotected���s������r�šA��\�ĩM���O�ۦP�C
 * 		�]���Y���[�A�h�u��b�P�@��Package�W�ϥ�
 * �b�������u��w�q��k�����O(�^�ǭ�)�M�Ѽƫ��O�A���i�w�q��k����(�M��H���O�ۦP)�C
 * �o�Ǥ�k�w�]���|�۰ʦ���public abstract�����}��H��k
 * �ѩ󤶭��q�`�N��Y�دS��
 */

interface Surfacing{
	/*
	 * �����]�i�H�֦������ܼ�
	 * �b��������i���ܼƷ|�۰ʾ֦�public static final���s������
	 * �����b�ŧi�ɧY���w��l��
	 */
	double PI = 3.14159;//�w�q�`��
	double area();//�p�⭱�n����k
}

class Shape{//�N��ϧέ��I�����O
	protected double x, y;//�y��
	
	public Shape() {
		
	}
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "�ϧέ��I:(" + x + ", " + y + ")";
	}
}


class Circle extends Shape implements Surfacing{
	private double r;//��Υb�|
	final static double PI = 3.14159;
	
	public Circle() {
		
	}
	
	public Circle(double x, double y, double r) {
		super(x, y);//�I�s�����O���غc��k
		this.r = r;
	}

	@Override
	public double area() {
		return PI*r*r;
	}
	
	public String toString() {
		return "���:(" + x + ", " + y + ")\n�b�|:" + r + "\n���n:" + area();
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
