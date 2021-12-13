package threadEX;

public class add3 {

	public static void main(String[] args) {
		
		Bus[] b = new Bus[3];
		b[0] = new Bus();
		b[1] = new Bus();
		b[2] = new Bus();
		
		b[0].start();
		b[1].start();
		b[2].start();

	}

}
