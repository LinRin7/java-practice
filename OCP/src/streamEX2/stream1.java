package streamEX2;

import java.util.Arrays;
import java.util.List;

public class stream1 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(11, 3, 23, 144, 52, 1);
		l
		.stream()
		.sorted()
		.filter((n)->n>=30)
		.forEach((n)->System.out.println(n+" "));
		
	}

}
