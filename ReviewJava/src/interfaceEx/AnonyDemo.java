package interfaceEx;

public class AnonyDemo {

	public static void main(String[] args) {
		/*
		 * �ΦW���O(Anonymous Class)�D�n�O�Ψ��{�ɩw�q�@�ӬY���O(�Τ���)���l���O
		 * �åΥH���ͪ���
		 */
		final int a = 10;
		
		(new Object(){//�ΦW���O
			int b = 10000;//�ΦW�������ܼ�
			public void show() {//�ΦW���O����k
				System.out.println("�ΦW���O:");
				System.out.println("this -> b = " + b);
				System.out.println("main() -> a = " + a);
			}
		}).show();

	}

}
