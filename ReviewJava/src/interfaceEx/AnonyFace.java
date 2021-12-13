package interfaceEx;

/*
 * 匿名類別經常使用在"需要實作某個介面來產生物件"
 * 以匿名方式實作介面並產生物件
 */

interface Face{
	void smile();
}

public class AnonyFace {

	public static void main(String[] args) {
		
		//實作Face介面的匿名類別，並建立物件並傳回給變數c
		Face c = new Face() {
			/*
			 * 抽象類別與介面都不能用來建立物件(new Face(); -> error)
			 * 但卻可以用來宣告變數以參照其子物件，如15行
			 */
			@Override
			public void smile() {//實作介面的方法
				
				System.out.println("^_^");
			}
			
		};
		c.smile();
		
		//如果只要執行一次smile()，那麼也可將變數c省略掉
		new Face() {

			@Override
			public void smile() {
				System.out.println("(^_^)");
				
			}
			
		}.smile();
	}

}
