package multithreadingEx;

/*
 * 
 */

class PollingStationEx5 extends Thread{//�}����
	static int reportTimes = 5;//�^������
	int total = 0;//���}���Ҫ��`����
	Assistant a;//�p���U�z����
	String name;//�}���ҦW��
	
	public PollingStationEx5() {
		
	}
	
	public PollingStationEx5(Assistant a, String name) {
		this.a = a;//����Assistant����
		this.name = name;//�����}���ҦW��
	}
	
	public void run() {//����ǭn���檺�u�@
		for(int i=0; i<reportTimes; i++) {//�^�������벼
			//�H�üƲ��ͷs�W�벼��
			int count = (int)(Math.random()*500);
			a.reportCount(name, count);//�^���s�W�o���ƨå[�`
			total+=count;//���}���ҥ[�`�o��
		}
	}
	
}

class Assistant{
	//�O�_���o���ƥ��[�`
	private boolean unprocessedData = false;
	private int count;//�s�W���o����
	private String name;//�}�X�s�W�o���ƪ��}����
	/*
	 * wait()��k�i�H���ثe������Ƕi�J���ݪ��A�A
	 * ���즳�O������ǩI�s�P�@�Ӫ���notify()��k�~�|�~�����
	 */
	public synchronized void reportCount(String name, int count) {
		while(unprocessedData) {//�����[�`����
			try {
				wait();//����
			}catch(InterruptedException e) {
				
			}
		}
		
		System.out.println(name + "�}���ҷs�W: " + count + "��");
		this.count = count;
		this.name = name;
		unprocessedData = true;
		notify();
	}
	
	public synchronized int getCount() {
		while(!unprocessedData) {//�S�����[�`����
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		
		int value = count;
		unprocessedData = false;
		notify();
		return value;
	}
	/*
	 * �p�G���h�Ӱ���Ǧbwait()�P�@���귽�A�������notify()�u�|�H������䤤�@�Ӱ����
	 * �t�~�٦�notifyAll()��k�A�h�i�H����Ҧ����ݸӸ귽�������
	 * wait()�Bnotify()�BnotifyAll()���OObject���O����k(�Ӥ��OThread���O��Runnable������)
	 * �ӥB���u��b�bsynchronized����k�ΰ϶�������
	 * public synchronized void foo(){
	 * 	...
	 * }
	 * ���P��
	 * public void foo(){
	 * 	synchronized(this){
	 * 		...
	 * 	}
	 * }
	 */
}

public class VoteEx5 {

	static int total = 0;//�`�}����
	static int numOfStations = 2;//�}���Ҽ�
	static PollingStationEx5[] stations;
	
	public static void main(String[] args) {
		//�إߧU�z����
		Assistant a = new Assistant();
		
		stations = new PollingStationEx5[numOfStations];
		
		//�@�@�إߧ벼�Ҫ���
		for(int i=0; i<numOfStations; i++) {
			stations[i] = new PollingStationEx5(a, i+1 + "��");
		}
		
		//�@�@�Ұʰ����
		for(int i=0; i<numOfStations; i++) {
			stations[i].start();
		}
		
		for(int i=0; i<numOfStations * PollingStationEx5.reportTimes; i++) {
			total+=a.getCount();//Ū������
			System.out.println("�ثe�`����:" + total);
		}
		
		System.out.println("�̫�벼���G:");
		
		//�@�@��ܦU�벼�Ҳ���
		for(int i=0; i<numOfStations; i++) {
			System.out.println(stations[i].name + ":" + stations[i].total);
		}
		
		//��̫ܳ��`����
		System.out.println("�`����:" + total);

	}

}
