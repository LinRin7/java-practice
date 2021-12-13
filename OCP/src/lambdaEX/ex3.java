package lambdaEX;

interface book3<E, T>{
	void bookName(String name, E price, T discount);
}

class bookStore1 implements book3<Integer, Double>{

	@Override
	public void bookName(String name, Integer price, Double discount) {
		// TODO Auto-generated method stub
		
	}
	
}

class bookStore2 implements book3<Double, Double>{

	@Override
	public void bookName(String name, Double price, Double discount) {
		// TODO Auto-generated method stub
		
	}
	
}

public class ex3 {

	public static void main(String[] args) {
		
	}

}
