package lambdaEX;

interface book4<T, E>{
	E bookName(T n);
}

public class ex4 {

	public static void main(String[] args) {
		
		book4 b = new book4<String, Order>(){

			@Override
			public Order bookName(String n) {
				
				return new Order(n);
			}
			
		};
		System.out.println(b.bookName("java"));
	}

}


class Order{
	private String name;

	public Order(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}