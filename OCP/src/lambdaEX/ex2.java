package lambdaEX;

interface book2<E, T>{
	E bookPrice1(E price);
	T bookPrice2(T price);
	T bookPrice3(E price);
}

public class ex2 {

	public static void main(String[] args) {
		
		book2 b = new book2<Integer, Double>(){

			@Override
			public Integer bookPrice1(Integer price) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double bookPrice2(Double price) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double bookPrice3(Integer price) {
				// TODO Auto-generated method stub
				return (double)price;
			}
			
		};
		
		System.out.println(b.bookPrice3(12));
		System.out.println("===========================");
		
		String price = "12345";
		System.out.println("»ù®æ¥´0.95§é="+new book2<String, Double>(){

			@Override
			public String bookPrice1(String price) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double bookPrice2(Double price) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Double bookPrice3(String price) {
				// TODO Auto-generated method stub
				return Double.parseDouble(price);
			}
			
		}.bookPrice3(price)*0.95);
	}

}
