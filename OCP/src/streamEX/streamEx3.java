package streamEX;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamEx3 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12, 42, 55, 41, 1);
		Stream<Integer> s = l.stream();
		s.forEach((t)->System.out.print(t+" "));
		System.out.println("\n=========================");
		
		List<Integer> l2 = Arrays.asList(34, 56, 78, 90);
		l2.stream().forEach((t)->System.out.print(t+" "));
		System.out.println("\n=========================");
		
		Arrays.asList(12, 34, 56, 78, 90).stream().forEach((t)->System.out.print(t+" "));
		System.out.println("\n=========================");
		
		Arrays
		.asList(831, 110, 5566, 78, 94)
		.stream().
		forEach((t)->System.out.print(t+" "));
	}

}
