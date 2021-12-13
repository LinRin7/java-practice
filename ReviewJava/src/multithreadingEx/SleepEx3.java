package multithreadingEx;

import java.util.Date;

class TimerThreadEx3 extends Thread{
	public void run() {
		try {
			while(true) {
				//static��ksleep()
				sleep(1000);//�ίv�@����
				/*
				 * �w�ƪ��AReader->��ܰ�����N�ƶ����ݰ���A��إ߰��������ð���start()��A�N�|�i�J�o�Ӫ��A�C
				 * 					����浲���ίv��]�|�i�J�����A���ݰ���
				 * ���檬�ARunning->��ܦ���������b���椤�C�i�H�I�sThread���O�ҩw�q��static��kcurrentThread()
				 * 					���o�ثe���b���椤��Thread����
				 * �ᵲ���ABlocked->���������涷���ݪ��B�z�A�N�|�i�J�ᵲ���A�C����B�z������A�N�|�����ᵲ���A�C
				 * ���ݪ��AWaiting->�������I�sObject���O�ҩw�q��wait()��k���@���ݮɡA�N�|�i�J���ݪ��A�A
				 * 					�@�����L������I�snotify()�άOnotifyAll��k�Ѱ��䵥�ݪ��A�A�~�|�b�i�J�w�ƪ��A�C
				 */
				Date now = new Date();
				System.out.println("�s�����:" + now);
			}
		}catch(InterruptedException e) {
			
		}
	}
}

public class SleepEx3 {

	public static void main(String[] args) {
		TimerThreadEx3 newThread = new TimerThreadEx3();
		newThread.start();
		try {
			while(true) {
				Thread.sleep(1000);
				Date now = new Date();
				System.out.println("�°����:" + now);
			}
		}catch(InterruptedException e) {
			
		}

	}

}
