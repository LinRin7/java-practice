package abstractClassEx;

abstract class Land{
	/*
	 * ��H���O�����ӥΨӲ��ͪ���
	 * ����T�O�Ҧ��~��Land���l�������|���ө�H���O����k(������@)
	 * �i��� inheritanceEx �� LandsEx6
	 * �֦���H��k�����O�@�w�n�е�����H���O;�@�ө�H���O�o�����n�֦���H��k
	 */
	abstract double area();//�p�⭱�n����H��k
}

class Circle extends Land{

	private int r;//�b�|
	
	public Circle() {
		
	}
	
	public Circle(int r) {
		this.r = r;
	}
	
	@Override
	double area() {//��@��H��k
		
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
	double area() {//��@��H��k
		
		return side * side;
	}
}

public class AbstractLandEx1 {

	public static void main(String[] args) {
		

	}

}
