package streamEX;

import java.util.Arrays;
import java.util.List;

public class streamEx4 {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(67, 13, 24, 1);
		/*for(Integer o:l) {
			System.out.print(o+" ");
		}*/
		/*l//�W�U��Ӥ@��
		.stream()
		.forEach((Integer t)->System.out.print(t+" "));*/
		l
		.stream()
		.sorted()
		.forEach((t)->System.out.print(t+" "));
		System.out.println("\n============================");
		
		
	}

}
