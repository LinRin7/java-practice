package javaAPI;

public class StringEX {

	public static void main(String[] args) {
		
		String str = "A dog ";//char[]
		System.out.println(str.length());
		System.out.println(str.concat("!"));//字串後面加! 不改變變數
		System.out.println(str);
		//str = str.concat("!");//字串後面加! 存進變數
		//System.out.println(str);
		System.out.println(str.trim().length());//trim() 前後刪除空格
		System.out.println(str.indexOf("d"));
		System.out.println(str.charAt(2));
		System.out.println(str.substring(2, 5));//2~4  2<=子字串<5  
		System.out.println(str.replace("dog", "cat"));
		System.out.println(str.equals("a DOG "));//是否等於
		System.out.println(str.equalsIgnoreCase("a DOG "));//是否等於 不分大小寫
		System.out.println(str.startsWith("A d"));//檢查開頭是否等於
		System.out.println(str.endsWith("g "));//檢查結尾是否等於
		System.out.println(str.toLowerCase());//全部變小寫
		System.out.println(str.toUpperCase());//全部變大寫
		System.out.println(str);
	}

}
