package stringEX;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RegularExpressionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*String pat;//�O���ϥΪ̿�J�˦�
		String str;//�O���ϥΪ̿�J���զr��
		
		System.out.print("�п�J�˦�:");
		pat = sc.next();
		
		System.out.print("�п�J�r��:");
		str = sc.next();
		
		if(str.matches(pat)) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}*/
		
		/*
		 * ����X�{����
		 * 	? -> 0��1��
		 * 	* -> ���N����
		 * 	+ -> 1���H�W
		 * 	{n} -> ��nn��
		 * 	{n,} -> n���H�W
		 * 	{n,m} -> n��m��
		 * 
		 */
		if("aa".matches("ab?a")) {//�۲ű���aa aba
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		
		if("abba".matches("ab?a")) {//�۲ű���aa aba
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		System.out.println("====================================");
		
		/*
		 * �Τ��A���Ӫ�ܤ@�Ӧr��
		 * 
		 */
		
		if("aba".matches("a[bjl]a")) {//aba aja ala
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		
		if("aka".matches("a[bjl]a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		System.out.println("====================================");
		
		/*
		 * �Τ��A�����ϥ� - ��ܤ@�q�s�򪺦r�X�϶�
		 * [0-9]
		 * [a-z]
		 * [0-9a-zA-Z]
		 * 
		 */
		if("a1a".matches("a[0-9a-zA-Z]a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		
		if("a#a".matches("a[0-9a-zA-Z]a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		System.out.println("====================================");
		
		/*
		 * �b�����A�����[�W ^ ��ܭn�ư����r�X�϶�
		 * [^a-z]
		 * 
		 */
		if("aba".matches("a[^0-9a-zA-Z]a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		
		if("a#a".matches("a[^0-9a-zA-Z]a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		System.out.println("====================================");
		
		/*
		 * �W�h��ܪk���w���w�q�F�@�Ǧr������
		 * �r������ -> ����
		 * . -> ���N�r��
		 * \d -> �Ʀr
		 * \D -> �D�Ʀr
		 * \s -> �ťզr��
		 * \S -> �D�ťզr��
		 * \w -> �^��r���μƦr
		 * \W -> �D�^��r���μƦr
		 * 
		 * (tip �ѩ� . �y���N����N�r���A��Ӫ��y�����H\.���)
		 * 
		 */
		/*
		 * �]�i�H�ϥΤp�A���N�@�q�W�h�զX�A�f�t����ƨϥ�
		 * 
		 */
		/*
		 * �] \ ��������ǦC���_�l�r��(ex: \t -> �w��r���C \n -> ����r���C \\ �� \�r��)
		 * �ҥH�n�ϥιw���w�q���r�������ɡA�ݦh�[�@�� \ (ex: \\d  \\s)
		 * �_�h�|�sĶ���~
		 */
		if("ac1cc2ca".matches("a(c\\dc){2}a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		
		if("ac3ca".matches("a(c\\dc){2}a")) {
			System.out.println("�۲�");
		}else {
			System.out.println("���۲�");
		}
		System.out.println("====================================");
		
		//replaceAll()�]�i�f�t�W�h��ܪk
		String src = "a111bc34d";//��J�����(�n�Q��諸���)
		String pat = "\\d+";//�����˦�// + -> �@���H�W
		String rep = "�Ʀr";//�n���N�����G
		System.out.println(src.replaceAll(pat, rep));
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String str = br.readLine();
		 */
		System.out.println("====================================");
		
		//�Ʊ���N�����G�n�]�t�쥻�����q�r��A���ɥi�H�ϥθs��()���\��
		String src2 = "a111bc34d";
		String pat2 = "(\\d+)";//() -> �s��
		String rep2 = "�Ʀr$1";//$1 -> �Ĥ@�Ӹs��
		System.out.println(src2.replaceAll(pat2, rep2));
		
		//
		String src3 = "a111bc34d";
		String pat3 = "([a-z])(\\d+)([a-z]+)(\\d+)([a-z])";//() -> �s��
		String rep3 = "1:$1, 2:$2, 3:$3, 4:$4, 5:$5, 0:$0";//$1 -> �Ĥ@�Ӹs��...�H�������C$0�O�����X��q����r
		System.out.println(src3.replaceAll(pat3, rep3));
	}

}
