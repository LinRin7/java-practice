package multithreadingEx;

/*
 * 
 */

class PollingStationEx5 extends Thread{//秨布┮
	static int reportTimes = 5;//厨Ω计
	int total = 0;//秨布┮羆布计
	Assistant a;//璸布瞶ン
	String name;//秨布┮嘿
	
	public PollingStationEx5() {
		
	}
	
	public PollingStationEx5(Assistant a, String name) {
		this.a = a;//魁Assistantン
		this.name = name;//魁秨布┮嘿
	}
	
	public void run() {//磅︽璶磅︽
		for(int i=0; i<reportTimes; i++) {//厨きΩщ布
			//睹计玻ネ穝糤щ布计
			int count = (int)(Math.random()*500);
			a.reportCount(name, count);//厨穝糤眔布计羆
			total+=count;//秨布┮羆眔布
		}
	}
	
}

class Assistant{
	//琌Τ眔布计ゼ羆
	private boolean unprocessedData = false;
	private int count;//穝糤眔布计
	private String name;//秨穝糤眔布计秨布┮
	/*
	 * wait()よ猭琵ヘ玡磅︽秈单篈
	 * Τ磅︽㊣ンnotify()よ猭穦膥尿磅︽
	 */
	public synchronized void reportCount(String name, int count) {
		while(unprocessedData) {//Τゼ羆布
			try {
				wait();//单
			}catch(InterruptedException e) {
				
			}
		}
		
		System.out.println(name + "秨布┮穝糤: " + count + "布");
		this.count = count;
		this.name = name;
		unprocessedData = true;
		notify();
	}
	
	public synchronized int getCount() {
		while(!unprocessedData) {//⊿Τゼ羆布
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
	 * 狦Τ磅︽wait()戈方ê或磅︽notify()穦繦诀酬眶ㄤい磅︽
	 * 临ΤnotifyAll()よ猭玥酬眶┮Τ单赣戈方磅︽
	 * wait()notify()notifyAll()常琌Object摸よ猭(τぃ琌Thread摸┪Runnableざ)
	 * τ常synchronizedよ猭┪跋遏い磅︽
	 * public synchronized void foo(){
	 * 	...
	 * }
	 * 单
	 * public void foo(){
	 * 	synchronized(this){
	 * 		...
	 * 	}
	 * }
	 */
}

public class VoteEx5 {

	static int total = 0;//羆秨布计
	static int numOfStations = 2;//秨布┮计
	static PollingStationEx5[] stations;
	
	public static void main(String[] args) {
		//ミ瞶ン
		Assistant a = new Assistant();
		
		stations = new PollingStationEx5[numOfStations];
		
		//ミщ布┮ン
		for(int i=0; i<numOfStations; i++) {
			stations[i] = new PollingStationEx5(a, i+1 + "腹");
		}
		
		//币笆磅︽狐
		for(int i=0; i<numOfStations; i++) {
			stations[i].start();
		}
		
		for(int i=0; i<numOfStations * PollingStationEx5.reportTimes; i++) {
			total+=a.getCount();//弄布计
			System.out.println("ヘ玡羆布计:" + total);
		}
		
		System.out.println("程щ布挡狦:");
		
		//陪ボщ布┮布计
		for(int i=0; i<numOfStations; i++) {
			System.out.println(stations[i].name + ":" + stations[i].total);
		}
		
		//陪ボ程羆布计
		System.out.println("羆布计:" + total);

	}

}
