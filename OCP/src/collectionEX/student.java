package collectionEX;

public class student implements Comparable<student>{

	private String name;
	private int chi;
	private int eng;
	private int sum;
	
	public student() {
		super();
	}
	
	public student(String name, int chi, int eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.sum = chi + eng;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getChi() {
		return chi;
	}
	
	public void setChi(int chi) {
		this.chi = chi;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getSum() {
		sum = chi+eng;
		return sum;
	}
	
	public void show() {
		System.out.println(":"+getName()+
				"\t瓣ゅ:"+getChi()+
				"\t璣ゅ:"+getEng()+
				"\t羆だ:"+getSum());
	}

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		//瞷把计籔疭﹚把计ゑ耕肚把计Τ贺 : タ计0璽计
		//return this.sum-o.sum;//酚羆だ逼パ
		return o.sum-this.sum;//酚羆だ逼パ
	}
	
	/////////////////////////////////////////////////
	
}
