package multithreadingEx;

import java.util.Date;

/*
 * JAVA提供Runnable介面
 * 讓任何類別都可以用來建立執行緒
 */

class TimerThreadEx2 implements Runnable{//以Runnable介面建立新的執行緒
	public void run() {//新的執行緒要執行的內容
		while(true) {//不斷顯示日期時間的迴圈
			for(int i=0; i<50_000_000; i++) {//等一段時間
				Date now = new Date();//取得目前的時間
				System.out.println("新執行緒:" + now);//顯示時間
			}
		}
	}
}

public class TestRunnableEx2 {

	public static void main(String[] args) {
		//新的執行緒
		Thread newThread = new Thread(new TimerThreadEx2());
		/*
		 * 用單一參數的建構方法來產生Thread物件
		 * 並且將有實作Runnable介面的物件傳給建構方法
		 */
		newThread.start();//啟動執行緒
		/*
		 * 每個Thread物件只能呼叫一次start()
		 */
		while(true) {
			for(int i=0; i<50_000_000; i++) {
				Date now = new Date();
				System.out.println("舊執行緒:" + now);
			}
		}

	}

}
