package abstractClassEx;

abstract class Parent{//抽象類別
	abstract public void show();//抽象方法
}

abstract class Child extends Parent{//Parent的子類別
	//無實作show()，自動成為抽象類別
	//若無實作抽象類別的方法，也必須要宣告為抽象類別
}

class Grandson extends Child{//Child的子類別

	@Override
	public void show() {//實作抽象方法
		System.out.println("實作抽象方法");
		
	}
	
}

public class AbstractChiild {

	public static void main(String[] args) {
		
		Parent p = new Grandson();
		p.show();
	}

}
