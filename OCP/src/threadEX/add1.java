package threadEX;

public class add1 {

	public static void main(String[] args) throws InterruptedException {
		
		school[] s = new school[4];
		s[0] = new school("aa");
		s[1] = new school("bb");
		s[2] = new school("cc");
		s[3] = new school("dd");
		/*
		s[0].start();
		s[1].start();
		s[1].join();
		s[2].start();
		s[3].start();
		*/
		
		for(school o:s) {	
			//o.show();
			//o.run();
			o.start();
		}
		
		/*
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(200);
				System.out.println("i="+i+"\thello java");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		*/
	}

}
