package interfaceEx;

public class AnonyDemo {

	public static void main(String[] args) {
		/*
		 * 匿名類別(Anonymous Class)主要是用來臨時定義一個某類別(或介面)的子類別
		 * 並用以產生物件
		 */
		final int a = 10;
		
		(new Object(){//匿名類別
			int b = 10000;//匿名成員的變數
			public void show() {//匿名類別的方法
				System.out.println("匿名類別:");
				System.out.println("this -> b = " + b);
				System.out.println("main() -> a = " + a);
			}
		}).show();

	}

}
