package stringEX;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RegularExpressionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*String pat;//記錄使用者輸入樣式
		String str;//記錄使用者輸入測試字串
		
		System.out.print("請輸入樣式:");
		pat = sc.next();
		
		System.out.print("請輸入字串:");
		str = sc.next();
		
		if(str.matches(pat)) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}*/
		
		/*
		 * 限制出現次數
		 * 	? -> 0或1次
		 * 	* -> 任意次數
		 * 	+ -> 1次以上
		 * 	{n} -> 剛好n次
		 * 	{n,} -> n次以上
		 * 	{n,m} -> n到m次
		 * 
		 */
		if("aa".matches("ab?a")) {//相符條件aa aba
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		
		if("abba".matches("ab?a")) {//相符條件aa aba
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		System.out.println("====================================");
		
		/*
		 * 用中括號來表示一個字元
		 * 
		 */
		
		if("aba".matches("a[bjl]a")) {//aba aja ala
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		
		if("aka".matches("a[bjl]a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		System.out.println("====================================");
		
		/*
		 * 用中括號中使用 - 表示一段連續的字碼區間
		 * [0-9]
		 * [a-z]
		 * [0-9a-zA-Z]
		 * 
		 */
		if("a1a".matches("a[0-9a-zA-Z]a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		
		if("a#a".matches("a[0-9a-zA-Z]a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		System.out.println("====================================");
		
		/*
		 * 在左中括號中加上 ^ 表示要排除的字碼區間
		 * [^a-z]
		 * 
		 */
		if("aba".matches("a[^0-9a-zA-Z]a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		
		if("a#a".matches("a[^0-9a-zA-Z]a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		System.out.println("====================================");
		
		/*
		 * 規則表示法中預先定義了一些字元種類
		 * 字元種類 -> 說明
		 * . -> 任意字元
		 * \d -> 數字
		 * \D -> 非數字
		 * \s -> 空白字元
		 * \S -> 非空白字元
		 * \w -> 英文字母或數字
		 * \W -> 非英文字母或數字
		 * 
		 * (tip 由於 . 句號代表任意字元，原來的句號須以\.表示)
		 * 
		 */
		/*
		 * 也可以使用小括號將一段規則組合，搭配限制次數使用
		 * 
		 */
		/*
		 * 因 \ 視為跳脫序列的起始字元(ex: \t -> 定位字元。 \n -> 換行字元。 \\ 表 \字元)
		 * 所以要使用預先定義的字元種類時，需多加一個 \ (ex: \\d  \\s)
		 * 否則會編譯錯誤
		 */
		if("ac1cc2ca".matches("a(c\\dc){2}a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		
		if("ac3ca".matches("a(c\\dc){2}a")) {
			System.out.println("相符");
		}else {
			System.out.println("不相符");
		}
		System.out.println("====================================");
		
		//replaceAll()也可搭配規則表示法
		String src = "a111bc34d";//輸入的資料(要被比對的資料)
		String pat = "\\d+";//紀錄樣式// + -> 一次以上
		String rep = "數字";//要取代的結果
		System.out.println(src.replaceAll(pat, rep));
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String str = br.readLine();
		 */
		System.out.println("====================================");
		
		//希望取代的結果要包含原本的那段字串，此時可以使用群組()的功能
		String src2 = "a111bc34d";
		String pat2 = "(\\d+)";//() -> 群組
		String rep2 = "數字$1";//$1 -> 第一個群組
		System.out.println(src2.replaceAll(pat2, rep2));
		
		//
		String src3 = "a111bc34d";
		String pat3 = "([a-z])(\\d+)([a-z]+)(\\d+)([a-z])";//() -> 群組
		String rep3 = "1:$1, 2:$2, 3:$3, 4:$4, 5:$5, 0:$0";//$1 -> 第一個群組...以此類推。$0是指比對出整段的文字
		System.out.println(src3.replaceAll(pat3, rep3));
	}

}
