package stringEX;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RegularExpressionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*String pat;//癘魁ㄏノ块妓Α
		String str;//癘魁ㄏノ块代刚﹃
		
		System.out.print("叫块妓Α:");
		pat = sc.next();
		
		System.out.print("叫块﹃:");
		str = sc.next();
		
		if(str.matches(pat)) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}*/
		
		/*
		 * 瞷Ω计
		 * 	? -> 0┪1Ω
		 * 	* -> ヴ種Ω计
		 * 	+ -> 1Ω
		 * 	{n} -> nΩ
		 * 	{n,} -> nΩ
		 * 	{n,m} -> nmΩ
		 * 
		 */
		if("aa".matches("ab?a")) {//才兵ンaa aba
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		
		if("abba".matches("ab?a")) {//才兵ンaa aba
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		System.out.println("====================================");
		
		/*
		 * ノい珹腹ㄓボじ
		 * 
		 */
		
		if("aba".matches("a[bjl]a")) {//aba aja ala
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		
		if("aka".matches("a[bjl]a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		System.out.println("====================================");
		
		/*
		 * ノい珹腹いㄏノ - ボ琿硈尿絏跋丁
		 * [0-9]
		 * [a-z]
		 * [0-9a-zA-Z]
		 * 
		 */
		if("a1a".matches("a[0-9a-zA-Z]a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		
		if("a#a".matches("a[0-9a-zA-Z]a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		System.out.println("====================================");
		
		/*
		 * オい珹腹い ^ ボ璶逼埃絏跋丁
		 * [^a-z]
		 * 
		 */
		if("aba".matches("a[^0-9a-zA-Z]a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		
		if("a#a".matches("a[^0-9a-zA-Z]a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		System.out.println("====================================");
		
		/*
		 * 砏玥ボ猭い箇﹚竡ㄇじ贺摸
		 * じ贺摸 -> 弧
		 * . -> ヴ種じ
		 * \d -> 计
		 * \D -> 獶计
		 * \s -> フじ
		 * \S -> 獶フじ
		 * \w -> 璣ゅダ┪计
		 * \W -> 獶璣ゅダ┪计
		 * 
		 * (tip パ . 腹ヴ種じㄓ腹斗\.ボ)
		 * 
		 */
		/*
		 * ㄏノ珹腹盢琿砏玥舱穎皌Ω计ㄏノ
		 * 
		 */
		/*
		 *  \ 跌铬叉癬﹍じ(ex: \t -> ﹚じ \n -> 传︽じ \\  \じ)
		 * ┮璶ㄏノ箇﹚竡じ贺摸惠 \ (ex: \\d  \\s)
		 * 玥穦絪亩岿粇
		 */
		if("ac1cc2ca".matches("a(c\\dc){2}a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		
		if("ac3ca".matches("a(c\\dc){2}a")) {
			System.out.println("才");
		}else {
			System.out.println("ぃ才");
		}
		System.out.println("====================================");
		
		//replaceAll()穎皌砏玥ボ猭
		String src = "a111bc34d";//块戈(璶砆ゑ癸戈)
		String pat = "\\d+";//魁妓Α// + -> Ω
		String rep = "计";//璶挡狦
		System.out.println(src.replaceAll(pat, rep));
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String str = br.readLine();
		 */
		System.out.println("====================================");
		
		//辨挡狦璶セê琿﹃ㄏノ竤舱()
		String src2 = "a111bc34d";
		String pat2 = "(\\d+)";//() -> 竤舱
		String rep2 = "计$1";//$1 -> 材竤舱
		System.out.println(src2.replaceAll(pat2, rep2));
		
		//
		String src3 = "a111bc34d";
		String pat3 = "([a-z])(\\d+)([a-z]+)(\\d+)([a-z])";//() -> 竤舱
		String rep3 = "1:$1, 2:$2, 3:$3, 4:$4, 5:$5, 0:$0";//$1 -> 材竤舱...摸崩$0琌ゑ癸俱琿ゅ
		System.out.println(src3.replaceAll(pat3, rep3));
	}

}
