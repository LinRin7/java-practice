package threadEX;

class student{
	
}

public class school2 extends student implements Runnable{

	private String name;
	
	public school2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(300);
				System.out.println("i="+i+"\tname="+name);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
