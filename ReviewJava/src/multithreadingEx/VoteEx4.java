package multithreadingEx;
/*
 * ��������P�B(Synchronization)
 * �h������s���@��
 */

class PollingStationEx4 extends Thread{//�}�������O(�ӧO���벼��)
	static int reportTimes = 5;//�^������
	int total = 0;//���}���Ҫ��`����
	VoteEx4 v;//Vote����
	String name;//�}���ҦW��
	
	public PollingStationEx4() {
		
	}
	
	public PollingStationEx4(VoteEx4 v, String name) {
		this.v = v;//����vote����
		this.name = name;//�����}���ҦW��
	}
	
	public void run() {//������n�i�檺�u�@:�}���B�M��^���å[�`�o����
		for(int i=0; i<reportTimes; i++) {
			//�H�üƲ��ͷs�W�o����
			int count = (int)(Math.random()*500);
			v.reportCount(name, count);//�^���s�W�o���ƨå[�`
			total+=count;//���}���ҥ[�`
		}
	}
}


public class VoteEx4 {//�{�����D���O
	
	private int total = 0;//�`�}����
	private int numOfStations = 2;//�}���Ҽ�
	private PollingStationEx4[] stations;
	
	
	//synchronized(�P�B����)�r�šA�i�ΥH�ХܦP�@�ɶ��ȯ঳�@�Ӱ�������檺��k
	//�[�Wsynchronized�r�ū�A��L��������Q�n����P�@�Ӥ�k�ɡA�N�|�Q�j��Ȱ��A����ثe����������槹����k��~���~�����C
	public synchronized void reportCount(String name, int count) {//��ܤΥ[�`�o����
		int temp = total;
		
		System.out.println(name + "�}���ұo:" + count + "��");
		temp = temp + count;
		System.out.println("�ثe�`����" + temp);
		total = temp;
	}
	
	public void startReport() {//�}�l�p��
		stations = new PollingStationEx4[numOfStations];
		
		//�@�@�إߧ벼�Ҫ�����x�s��}�C
		for(int i=0; i<numOfStations; i++) {
			stations[i] = new PollingStationEx4(this, i+1 + "��");
		}
		
		//�@�@�Ұʧ벼�Ҫ��󪺰�����A�}�l�p��
		for(int i=0; i<numOfStations; i++) {
			stations[i].start();
		}
		
		//�@�@���ݧ벼�Ҷ}������
		for(int i=0; i<numOfStations; i++) {
			try {
				//���ݦU�ӧ벼�Ҷ}�������A���ݪ���k�O�I�sThread���O��join()��k
				stations[i].join();//�o�Ӥ�k�|���������Thread���󪺰�������槹����~��^
			}catch(InterruptedException e) {
				
			}
		}
		
		System.out.println("�̫�벼���G:");
		
		//�@�@��ܦU�벼�Ҳ���
		for(int i=0; i<numOfStations; i++) {
			System.out.println(stations[i].name + ":" + stations[i].total);
		}
		
		//��̫ܳ��`�벼��
		System.out.println("�`����:" + total);
		
	}

	public static void main(String[] args) {
		
		VoteEx4 v = new VoteEx4();
		v.startReport();
	}

}
