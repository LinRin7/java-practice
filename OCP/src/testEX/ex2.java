package testEX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {
		
		List<Person> emps=new ArrayList<>();
		 // code that adds objects of the Person class to the emps list goes here
		 Collections.sort(emps);
		
	}

}

class Person implements Comparable<Person>
{
	String name;
	Person(String name) {
		this.name=name;	
	}
	public int compareTo(Person p) {
    	return this.name.compareTo(p.name);    
    }
}
