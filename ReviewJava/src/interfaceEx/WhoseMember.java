package interfaceEx;

/*
 * 繼承多個同名的方法與成員變數的介面
 */

interface P1{
	int i = 10;
	
	/*public abstrace*/void show();
}

interface P2{
	int i = 20;
	
	void show();
}

interface C extends P1, P2{//子介面
	void show(String s);//多重定義的版本
}

public class WhoseMember implements C{//實作介面
	
	@Override
	public void show() {//實作由P1和P2繼承來的方法
		show("");
	}

	@Override
	public void show(String s) {//實作C中多重定義的方法
		//System.out.println(s + "i:" + i);//編譯會發生錯誤，無法確定i是哪個介面的i(P1 還是 P2的i)
		System.out.println(s + "P1.i=" + P1.i + "\nP2.i=" + P2.i);
	}
	
	public static void main(String[] args) {
		
		WhoseMember wm = new WhoseMember();
		wm.show();
		System.out.println(wm);
	}
	
}

