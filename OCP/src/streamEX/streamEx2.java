package streamEX;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamEx2 {

	public static void main(String[] args) {
		
		List<Integer> x = Arrays.asList(20, 40, 30, 11, 22);
		Stream<Integer> s = x.stream();
		
		Consumer<Integer> c = (Integer t)->System.out.print(t+" ");//要實作的方法(規則)
		s.forEach(c);//List沒有forEach方法，所以轉成stream
	}

}
