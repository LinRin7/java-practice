package multithreadingEx;

import java.util.Date;

/*
 * 簡單的多執行緒程式
 * 每一個執行緒都是以一個Thread物件來表示
 * 要建立新的執行緒，最簡單的方法就是從Thread類別，衍生新的類別
 * 並且重新定義Thread()類別中的run()方法
 */

class TimerThreadEx1 extends Thread{//新的執行緒
	public void run() {//新的執行緒要執行的內容
		while(true) {//不斷顯示日期時間的迴圈
			for(int i=0; i<50_000_000; i++) {//等一段時間
				Date now = new Date();//取得目前的時間
				System.out.println("新執行緒:" + now);//顯示時間
			}
		}
	}
}

public class TestThreadEx1 {

	public static void main(String[] args) {
		
		TimerThreadEx1 newThread = new TimerThreadEx1();
		newThread.start();//啟動執行緒
		while(true) {
			for(int i=0; i<50_000_000; i++) {
				Date now = new Date();
				System.out.println("舊執行緒:" + now);
			}
		}

	}

}
