package abstractClassEx;

abstract class Parent{//��H���O
	abstract public void show();//��H��k
}

abstract class Child extends Parent{//Parent���l���O
	//�L��@show()�A�۰ʦ�����H���O
	//�Y�L��@��H���O����k�A�]�����n�ŧi����H���O
}

class Grandson extends Child{//Child���l���O

	@Override
	public void show() {//��@��H��k
		System.out.println("��@��H��k");
		
	}
	
}

public class AbstractChiild {

	public static void main(String[] args) {
		
		Parent p = new Grandson();
		p.show();
	}

}
