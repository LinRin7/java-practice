package inheritanceEx;

class Parent2{
	void show() {
		System.out.println("�ڬO�����O");
	}
}

class Child2 extends Parent2{
	void show() {//���s�w�q����
		System.out.println("�ڬO�l���O");
	}
	
	void show(String str) {//�h���w�q����
		System.out.println(str);
	}
}

public class PolymorphismEx5 {

	public static void main(String[] args) {
		/*
		 * �h�Ϊ��N�q
		 * 
		 * �ѩ�U�h�����O�@�w�]�t�F�W�h�������A
		 * �i�H�ϥΤW�h���O���ѷӥh���V�@�ӤU�h���O������
		 */
		
		/*Parent2 p = new Parent2();
		Child2 c = new Child2();
		p.show();
		c.show();*/
		
		//p = c;// ���P Parent2 p = new Child2();
		//p.show();
		Parent2 p = new Child2();
		p.show();
		/*
		 * �YParent2�PChild2���ۦP�W�٪���k�B�ѼƻP���O�ۦP
		 * �|����Child2����k
		 * 
		 * �Y�O����u��Parent2������k
		 * �N�|����Parent2����k
		 * 
		 * �Y�O����u��Child2����k
		 * �|�sĶ���~
		 */
		/*
		 * �i�A���է�10~12��������
		 * �A���椺�e
		 * ���G�|���@��
		 */
	}

}
