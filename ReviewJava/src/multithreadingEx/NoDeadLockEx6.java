package multithreadingEx;
/*
 * 如果同一輩別中有多個synchronized方法時，若是有執行序已進入此類別的某個synchronized方法，
 * 就會造成其他執行序無法再呼叫同一物件的任何一個synchronized方法
 * 除非使用wait()來釋放對於該物件的synchronized狀態
 * 讓其他的執行序可以進入以同一物件為共享資源的synchronized區塊
 */

class ThreadA extends Thread{
	public void run() {
		Lock.obj.a();
		//Lock2.obj.a();
	}
}

class ThreadB extends Thread{
	public void run() {
		Lock.obj.b();
		//Lock2.obj.b();
	}
}

class Lock{//不會造成死結的程式
	public static Lock obj = new Lock();
	private boolean bExecuted = false;
	
	public synchronized void a() {
		System.out.println("方法a開始執行");
		while(!bExecuted) {
			//進入while迴圈，等方法b被呼叫
		}
		System.out.println("方法a執行完畢");
	}
	
	public void b() {
		System.out.println("方法b開始執行");
		bExecuted = true;//表示方法b已經呼叫了，讓a()的while迴圈可以結束
		System.out.println("方法b執行完畢");
	}
}

class Lock2{//使用wait()避免死結
	public static Lock2 obj = new Lock2();
	
	public synchronized void a() {
		System.out.println("方法a開始執行");
		try {
			wait();//改用wait()等待b()的notify
		}catch(InterruptedException e) {
			
		}
		System.out.println("方法a執行完畢");
	}
	
	public synchronized void b() {
		System.out.println("方法b開始執行");
		notify();
		System.out.println("方法b執行完畢");
	}
}

public class NoDeadLockEx6 {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		try {
			ta.start();//ta執行序先執行
			tb.start();//tb執行序再接著執行
			ta.join();//等ta執行序結束
			tb.join();//等tb執行序結束
		}catch(InterruptedException e) {
			
		}
		System.out.println("程式結束");

	}

}
