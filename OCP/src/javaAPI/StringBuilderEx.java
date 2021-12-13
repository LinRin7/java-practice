package javaAPI;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//StringBuilder sb = "A dog ";//StringBuilder != String -> error
		StringBuilder sb = new StringBuilder("A dog ");
		//StringBuilder的方法使用過後，會直接更改變數
		System.out.println(sb);
		System.out.println(sb.append("!"));//後面增加字串
		System.out.println(sb);//已更改
		System.out.println(sb.indexOf("d"));
		System.out.println(sb.insert(3, "ooooooooo"));//從位置3 插入
		System.out.println(sb);//已更改
		System.out.println(sb.replace(2, 6, "DOOO"));// 2<= 替換字串 <6 //不會顯示
		System.out.println(sb);//已更改
		System.out.println(sb.substring(2, 6));// 子字串取範圍 2<= x <6 //不會更改sb
		System.out.println(sb.delete(2, 6));//刪除位置2~6(不包含6)的字元 //不會顯示
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb);
		
		
		
	}

}
