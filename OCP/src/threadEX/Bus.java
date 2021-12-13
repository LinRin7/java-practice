package threadEX;

public class Bus extends Thread{//總公司

	private static int sum;
	
	public void run() {
		for(int i=1; i<=20; i++) {
			add(50);
		}
	}
	
	synchronized static void add(int money) {//每一筆數目
	//取消同步化	
		int m = sum;
		System.out.println("目前總金額:" + m + "元");
		System.out.println("進帳一筆:" + money + "元");
		m+=money;
		System.out.println("最新總金額:" + m + "元\n");
		sum=m;
	}
	
	void show() {
		for(int i=1; i<=20; i++) {
			add(50);
		}
	}
}
