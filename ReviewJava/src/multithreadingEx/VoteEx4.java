package multithreadingEx;
/*
 * 磅︽狐˙(Synchronization)
 * 磅︽狐ノ
 */

class PollingStationEx4 extends Thread{//秨布┮摸(щ布┮)
	static int reportTimes = 5;//厨Ω计
	int total = 0;//秨布┮羆布计
	VoteEx4 v;//Voteン
	String name;//秨布┮嘿
	
	public PollingStationEx4() {
		
	}
	
	public PollingStationEx4(VoteEx4 v, String name) {
		this.v = v;//魁voteン
		this.name = name;//魁秨布┮嘿
	}
	
	public void run() {//磅︽狐璶秈︽:秨布礛厨羆眔布计
		for(int i=0; i<reportTimes; i++) {
			//睹计玻ネ穝糤眔布计
			int count = (int)(Math.random()*500);
			v.reportCount(name, count);//厨穝糤眔布计羆
			total+=count;//秨布┮羆
		}
	}
}


public class VoteEx4 {//祘Α摸
	
	private int total = 0;//羆秨布计
	private int numOfStations = 2;//秨布┮计
	private PollingStationEx4[] stations;
	
	
	//synchronized(˙诀)才ノ夹ボ丁度Τ磅︽狐磅︽よ猭
	//synchronized才ㄤ磅︽狐稱璶磅︽よ猭碞穦砆眏既氨单ヘ玡磅︽狐磅︽Чよ猭膥尿磅︽
	public synchronized void reportCount(String name, int count) {//陪ボの羆眔布计
		int temp = total;
		
		System.out.println(name + "秨布┮眔:" + count + "布");
		temp = temp + count;
		System.out.println("ヘ玡羆布计" + temp);
		total = temp;
	}
	
	public void startReport() {//秨﹍璸布
		stations = new PollingStationEx4[numOfStations];
		
		//ミщ布┮ン纗皚
		for(int i=0; i<numOfStations; i++) {
			stations[i] = new PollingStationEx4(this, i+1 + "腹");
		}
		
		//币笆щ布┮ン磅︽狐秨﹍璸布
		for(int i=0; i<numOfStations; i++) {
			stations[i].start();
		}
		
		//单щ布┮秨布挡
		for(int i=0; i<numOfStations; i++) {
			try {
				//单щ布┮秨布Ч拨单よ猭琌㊣Thread摸join()よ猭
				stations[i].join();//硂よ猭穦单癸莱Threadン磅︽狐磅︽Ч拨
			}catch(InterruptedException e) {
				
			}
		}
		
		System.out.println("程щ布挡狦:");
		
		//陪ボщ布┮布计
		for(int i=0; i<numOfStations; i++) {
			System.out.println(stations[i].name + ":" + stations[i].total);
		}
		
		//陪ボ程羆щ布计
		System.out.println("羆布计:" + total);
		
	}

	public static void main(String[] args) {
		
		VoteEx4 v = new VoteEx4();
		v.startReport();
	}

}
