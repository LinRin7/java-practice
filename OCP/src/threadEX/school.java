package threadEX;

public class school extends Thread{

	private String name;
	
	public school(String name) {
		this.name = name;
	}
	
	//@Override
	public void run(){//是Thread的方法
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(300);
				System.out.println("i="+i+"\t name="+name+"\trun");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	void show() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(300);
				System.out.println("i="+i+"\tname="+name+"\tshow");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
