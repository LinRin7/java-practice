package functionEX;

import java.util.function.Supplier;

class product{
	
	private String name;
	private Integer amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}

public class supplierEX {

	public static void main(String[] args) {
		
		//�L�Ѽ� �^�Ǫ���ƫ��A��᭱
		Supplier<String> s1 = new Supplier<String>() {//�L�޼� �^��String

			@Override
			public String get() {//�L�޼� �^��String ��k�W�٬�get()
				// TODO Auto-generated method stub
				return "���K�q��";
			}
			
		};
		
		System.out.println(s1.get());
		System.out.println("============================");
		
		Supplier<Double> s2 = ()->3.14;//�L�޼� �^��Double
		System.out.println(s2.get());
		System.out.println("============================");
		
		Supplier<product> s3 = ()->new product();//�L�޼� �^��product ��k�W�٬�get()
		product p1 = s3.get();
		p1.setName("Lcd");
		p1.setAmount(9);
		System.out.println(p1+"\tname="+p1.getName()+"\tamount="+p1.getAmount());
		System.out.println("============================");
		
		Supplier<String> G1 = cal4::g1;
		Supplier<Double> G2 = cal4::g2;
		Supplier<product> G3 = cal4::g3;
		System.out.println(G1.get());
		System.out.println(G2.get());
		product p2 = G3.get();
		p2.setName("Ram");
		p2.setAmount(3);
		System.out.println(p2+"\tname="+p2.getName()+"\tamount="+p2.getAmount());
		System.out.println("============================");
	}

}

class cal4{
	
	static String g1() {
		return "zzzZZZ";
	}
	
	static Double g2() {
		return 3.14;
	}
	
	static product g3() {
		return new product();
	}
}
