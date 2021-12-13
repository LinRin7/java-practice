package ioEX;

import java.io.Serializable;

public class Order implements Serializable{

	private String name;
	private int Lcd;
	private int Ram;
	
	public Order() {
		super();
	}
	
	public Order(String name, int Lcd, int Ram) {
		super();
		this.name = name;
		this.Lcd = Lcd;
		this.Ram = Ram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLcd() {
		return Lcd;
	}

	public void setLcd(int lcd) {
		Lcd = lcd;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}
	
	public void show() {
		System.out.println("¦W:"+getName()+"\nLcd:"+getLcd()+"\nRan:"+getRam()+"\n");
	}
	
	public void show2() {
		System.out.println("¦W:"+getName());
	}
}
