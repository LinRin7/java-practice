package threadEX;

public class Bus extends Thread{//�`���q

	private static int sum;
	
	public void run() {
		for(int i=1; i<=20; i++) {
			add(50);
		}
	}
	
	synchronized static void add(int money) {//�C�@���ƥ�
	//�����P�B��	
		int m = sum;
		System.out.println("�ثe�`���B:" + m + "��");
		System.out.println("�i�b�@��:" + money + "��");
		m+=money;
		System.out.println("�̷s�`���B:" + m + "��\n");
		sum=m;
	}
	
	void show() {
		for(int i=1; i<=20; i++) {
			add(50);
		}
	}
}
