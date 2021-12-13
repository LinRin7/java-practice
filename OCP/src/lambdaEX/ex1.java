package lambdaEX;

interface book1<E>{
	E bookPrice(E price);
}

public class ex1 {

	public static void main(String[] args) {
		
		book1<Integer> b = new book1<Integer>() {
			@Override
			public Integer bookPrice(Integer price) {
				return null;
			}
		};
		
		book1 b2 = new book1<Integer>() {//book1後面省略<Integer>，lambda的寫法
			@Override
			public Integer bookPrice(Integer price) {
				return null;
			}
		};
		
	}

}
