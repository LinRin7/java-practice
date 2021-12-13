package inheritanceEx;

class Land{//�N�����Ϊ��g�a�������O
	public  double area() {//�p�⭱�n
		return 0;
	}
}


class Circle6 extends Land{//
	private int r;//
	
	public Circle6() {
		
	}
	
	public Circle6(int r) {//�غc��k
		this.r = r;
	}
	
	public double area() {//���s�w�q������
		return 3.14*r*r;
	}
}


class Square6 extends Land{//����Ϊ��g�a
	private int side;//���
	
	public Square6() {
		
	}
	
	public Square6(int side) {
		this.side = side;
	}
	
	public double area() {
		return side*side;
	}
}


class Calculator{//�p��
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
		// �ϥ��~�ӻP�h�θѨM���_�ק�{�������D
		Circle6 c = new Circle6(5);
		Square6 s = new Square6(5);
		
		Calculator ca = new Calculator(3000);
		
		System.out.println("c �o���a��" + ca.calculatePrice(c));
		//�Ѽ�����J���A��Land -> Land c = new Circle(5);
		System.out.println("s �o���a��" + ca.calculatePrice(s));
		//�Ѽ�����J���A��Land -> Land s = new Square(5);
		
	}

}
