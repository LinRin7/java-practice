package multithreadingEx;

import java.util.Date;

/*
 * ²�檺�h������{��
 * �C�@�Ӱ�������O�H�@��Thread����Ӫ��
 * �n�إ߷s��������A��²�檺��k�N�O�qThread���O�A�l�ͷs�����O
 * �åB���s�w�qThread()���O����run()��k
 */

class TimerThreadEx1 extends Thread{//�s�������
	public void run() {//�s��������n���檺���e
		while(true) {//���_��ܤ���ɶ����j��
			for(int i=0; i<50_000_000; i++) {//���@�q�ɶ�
				Date now = new Date();//���o�ثe���ɶ�
				System.out.println("�s�����:" + now);//��ܮɶ�
			}
		}
	}
}

public class TestThreadEx1 {

	public static void main(String[] args) {
		
		TimerThreadEx1 newThread = new TimerThreadEx1();
		newThread.start();//�Ұʰ����
		while(true) {
			for(int i=0; i<50_000_000; i++) {
				Date now = new Date();
				System.out.println("�°����:" + now);
			}
		}

	}

}
