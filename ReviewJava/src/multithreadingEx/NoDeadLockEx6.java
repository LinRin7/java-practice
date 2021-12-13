package multithreadingEx;
/*
 * �p�G�P�@���O�����h��synchronized��k�ɡA�Y�O������Ǥw�i�J�����O���Y��synchronized��k�A
 * �N�|�y����L����ǵL�k�A�I�s�P�@���󪺥���@��synchronized��k
 * ���D�ϥ�wait()��������Ӫ���synchronized���A
 * ����L������ǥi�H�i�J�H�P�@���󬰦@�ɸ귽��synchronized�϶�
 */

class ThreadA extends Thread{
	public void run() {
		Lock.obj.a();
		//Lock2.obj.a();
	}
}

class ThreadB extends Thread{
	public void run() {
		Lock.obj.b();
		//Lock2.obj.b();
	}
}

class Lock{//���|�y���������{��
	public static Lock obj = new Lock();
	private boolean bExecuted = false;
	
	public synchronized void a() {
		System.out.println("��ka�}�l����");
		while(!bExecuted) {
			//�i�Jwhile�j��A����kb�Q�I�s
		}
		System.out.println("��ka���槹��");
	}
	
	public void b() {
		System.out.println("��kb�}�l����");
		bExecuted = true;//��ܤ�kb�w�g�I�s�F�A��a()��while�j��i�H����
		System.out.println("��kb���槹��");
	}
}

class Lock2{//�ϥ�wait()�קK����
	public static Lock2 obj = new Lock2();
	
	public synchronized void a() {
		System.out.println("��ka�}�l����");
		try {
			wait();//���wait()����b()��notify
		}catch(InterruptedException e) {
			
		}
		System.out.println("��ka���槹��");
	}
	
	public synchronized void b() {
		System.out.println("��kb�}�l����");
		notify();
		System.out.println("��kb���槹��");
	}
}

public class NoDeadLockEx6 {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		try {
			ta.start();//ta����ǥ�����
			tb.start();//tb����ǦA���۰���
			ta.join();//��ta����ǵ���
			tb.join();//��tb����ǵ���
		}catch(InterruptedException e) {
			
		}
		System.out.println("�{������");

	}

}
