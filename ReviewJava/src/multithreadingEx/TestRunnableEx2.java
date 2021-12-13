package multithreadingEx;

import java.util.Date;

/*
 * JAVA����Runnable����
 * ���������O���i�H�Ψӫإ߰����
 */

class TimerThreadEx2 implements Runnable{//�HRunnable�����إ߷s�������
	public void run() {//�s��������n���檺���e
		while(true) {//���_��ܤ���ɶ����j��
			for(int i=0; i<50_000_000; i++) {//���@�q�ɶ�
				Date now = new Date();//���o�ثe���ɶ�
				System.out.println("�s�����:" + now);//��ܮɶ�
			}
		}
	}
}

public class TestRunnableEx2 {

	public static void main(String[] args) {
		//�s�������
		Thread newThread = new Thread(new TimerThreadEx2());
		/*
		 * �γ�@�Ѽƪ��غc��k�Ӳ���Thread����
		 * �åB�N����@Runnable����������ǵ��غc��k
		 */
		newThread.start();//�Ұʰ����
		/*
		 * �C��Thread����u��I�s�@��start()
		 */
		while(true) {
			for(int i=0; i<50_000_000; i++) {
				Date now = new Date();
				System.out.println("�°����:" + now);
			}
		}

	}

}
