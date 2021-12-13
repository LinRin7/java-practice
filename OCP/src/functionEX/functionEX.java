package functionEX;

import java.util.function.Function;

class Order{
	
	private String name;

	Order(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class functionEX {

	public static void main(String[] args) {
		
		//��J���Ѽƫ��A��e�� �^�Ǫ���ƫ��A��᭱
		Function<String, Integer> f = new Function<String, Integer>(){//�Ѽ�String �^��Integer

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return Integer.parseInt(t);
			}
			
		};
		System.out.println(f.apply("1111")+100);
		System.out.println("=======================");
		//                        �o�̪�String�i�H�ٲ� ->�᭱����@���e
		Function<String, Double> f2 = (String t)->Double.parseDouble(t)*10;//�Ѽ�String �^��Double
		System.out.println(f2.apply("123.56"));
		System.out.println("=======================");
        //                       �o�̪�String�i�H�ٲ�
		Function<String, Order> f3 = (String name)->new Order(name);//�Ѽ�String �^��Order
		Order o = f3.apply("teacher");//=new Order("teacher");
		System.out.println(o+"\t"+o.getName());
		o.setName("orange");
		System.out.println(o+"\t"+o.getName());
		System.out.println("=======================");
		
		Function<String, Integer> f4 = cal3::f1;
		Function<String, Double> f5 = cal3::f2;
		Function<String, Order> f6 = cal3::f3;
		
		System.out.println(f4.apply("11"+10));
		System.out.println(f5.apply("10.10"));
		
		Order o2 = f6.apply("Q^Q");
		System.out.println(f6);
		System.out.println(o2+"\t"+o2.getName());
		o2.setName("33");
		System.out.println(o2+"\t"+o2.getName());

	}

}

class cal3{
	
	static Integer f1(String t) {
		return Integer.parseInt(t);
	}
	
	static Double f2(String t) {
		return Double.parseDouble(t);
	}
	
	static Order f3(String name) {
		return new Order(name);
	}
}
