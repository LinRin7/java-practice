package testEX;

import java.util.ArrayList;
import java.util.List;

interface shape{
	
	void draw(CanVas c);
}

class Circle implements shape{

	@Override
	public void draw(CanVas c) {
		
		System.out.println(c+"圓形畫布");
	}
	
}

class Rectangle implements shape{

	@Override
	public void draw(CanVas c) {
		
		System.out.println(c+"矩形畫布");
	}
	
}

class CanVas{         //?為shape的子類別(或自己本身)(上限)
	void drawAll(List<? extends shape> shapes) {
		for(shape s:shapes) {
			s.draw(this);
		}
	}
}

public class ex4 {

	public static void main(String[] args) {
		//泛型裡設計多形應用
		CanVas c = new CanVas();
		List<Circle> l = new ArrayList<>();
		l.add(new Circle());
		l.add(new Circle());
		List<Rectangle> l2 = new ArrayList<>();;
		c.drawAll(l);
		c.drawAll(l2);

	}

}
