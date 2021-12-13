package streamEX2;

import java.util.Arrays;
import java.util.List;

class student implements Comparable<student>{
	
	private String name;
	private int chi;
	private int eng;
	private int sum;
	
	public student() {
		
	}

	public student(String name, int chi, int eng) {
		super();
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.sum = chi+eng;
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
		return chi+eng;
	}
	
	public void show() {
		System.out.println("name:"+getName()+
				"\tchi:"+getChi()+
				"\teng:"+getEng()+
				"\tsum:"+getSum());
	}
	
	public String show2() {
		return "名:"+getName()+
				"\t總:"+getSum();
	}
	
	public String show3(){
		return "名:"+getName()+
				"\t國文:"+getChi()+
				"\t英文:"+getEng()+
				"\t總分:"+getSum();
	}

	@Override
	public int compareTo(student o) {
		
		return o.sum-this.sum;
	}
}

public class stream2 {

	public static void main(String[] args) {
		
		List<student> l = Arrays.asList(
				new student("a", 75, 80),
				new student("b", 70, 90),
				new student("c", 90, 50));
		//l.stream().forEach((s)->s.show());
		//l.stream().forEach(showStudent::show1);
		l.stream().sorted().filter((n)->n.getChi()>70).forEach(showStudent::show1);
	}

}

class showStudent{
	
	static void show1(student s) {
		if(s.getSum()>=150) {
			System.out.println(s.show3());
		}else {
			System.out.println(s.show2());
		}
	}
}