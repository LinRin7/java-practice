package testEX;

import java.util.ArrayList;
import java.util.List;

interface shape{
	
	void draw(CanVas c);
}

class Circle implements shape{

	@Override
	public void draw(CanVas c) {
		
		System.out.println(c+"��εe��");
	}
	
}

class Rectangle implements shape{

	@Override
	public void draw(CanVas c) {
		
		System.out.println(c+"�x�εe��");
	}
	
}

class CanVas{         //?��shape���l���O(�Φۤv����)(�W��)
	void drawAll(List<? extends shape> shapes) {
		for(shape s:shapes) {
			s.draw(this);
		}
	}
}

public class ex4 {

	public static void main(String[] args) {
		//�x���̳]�p�h������
		CanVas c = new CanVas();
		List<Circle> l = new ArrayList<>();
		l.add(new Circle());
		l.add(new Circle());
		List<Rectangle> l2 = new ArrayList<>();;
		c.drawAll(l);
		c.drawAll(l2);

	}

}
