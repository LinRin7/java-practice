package multithreadingEx;

import java.util.Date;

class TimerThreadEx3 extends Thread{
	public void run() {
		try {
			while(true) {
				//static方法sleep()
				sleep(1000);//睡眠一秒鐘
				/*
				 * 預備狀態Reader->表示執行緒將排隊等待執行，當建立執行緒物件並執行start()後，就會進入這個狀態。
				 * 					當執行結束睡眠後也會進入此狀態等待執行
				 * 執行狀態Running->表示此執行緒正在執行中。可以呼叫Thread類別所定義的static方法currentThread()
				 * 					取得目前正在執行中的Thread物件
				 * 凍結狀態Blocked->當執行緒執行須等待的處理，就會進入凍結狀態。等到處理完畢後，就會結束凍結狀態。
				 * 等待狀態Waiting->當執行緒呼叫Object類別所定義的wait()方法自願等待時，就會進入等待狀態，
				 * 					一直到其他執行緒呼叫notify()或是notifyAll方法解除其等待狀態，才會在進入預備狀態。
				 */
				Date now = new Date();
				System.out.println("新執行緒:" + now);
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
				System.out.println("舊執行緒:" + now);
			}
		}catch(InterruptedException e) {
			
		}

	}

}
