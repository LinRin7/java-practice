package streamEX2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Order{
	
	private String name;
	private Integer Lcd;
	private Integer Ram;
	private Integer Sum;
	
	public Order() {
		
	}

	public Order(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		Lcd = lcd;
		Ram = ram;
		Sum = lcd*4999+ram*1280;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLcd() {
		return Lcd;
	}

	public void setLcd(Integer lcd) {
		Lcd = lcd;
	}

	public Integer getRam() {
		return Ram;
	}

	public void setRam(Integer ram) {
		Ram = ram;
	}

	public Integer getSum() {
		Sum = Lcd*4999+Ram*1280;
		return Sum;
	}

	public void setSum(Integer sum) {
		Sum = sum;
	}
	
	void show() {
		System.out.println("¦W:"+name+
				"\tLcd:"+Lcd+
				"\tRan:"+Ram+
				"\tSum:"+Sum);
	}
}

public class stream3 {

	public static void main(String[] args) {
		
		Order[] o = new Order[] {
				new Order("a", 5, 6),
				new Order("b", 5, 7),
				new Order("c", 4, 6),
				new Order("d", 3, 6)
		};
		
		List<Order> l = Arrays.asList(o);
		/*Comparator<Order> c = new Comparator<Order>() {

			@Override
			public int compare(Order o1, Order o2) {
				// TODO Auto-generated method stub
				//return o1.getSum()-o2.getSum();//»¼¤É
				return o2.getSum()-o1.getSum();//»¼´î
			}
			
		};
		l
		.stream()
		.sorted(c)
		.forEach((n)->n.show());*/
		l
		.stream()
		.sorted((o1, o2)->o1.getSum()-o2.getSum())//»¼¤É
		.forEach((n)->n.show());
	}

}
