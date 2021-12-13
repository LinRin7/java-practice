package testEX;

import java.util.Arrays;
import java.util.List;

public class ex3 {

	public static void main(String[] args) {
		//809 ex39
		List<Vehicle> vehicle=Arrays.asList(
				new Vehicle(2,"Car"),
				new Vehicle(3,"Bike"),
				new Vehicle(1,"Truck"));

		vehicle.stream()
				// line n1
				.forEach(System.out::print);
		

	}

	
}

 class Vehicle{
	int vId;
	String vName;
	public Vehicle(int vIdArg,String vNameArg) {
		this.vId=vIdArg;
		this.vName=vNameArg;	
	}
	
	public int getVid() {return vId;}
	public String getVName() { return vName;}
	public String toString() {
		return vName;	
	}
}


