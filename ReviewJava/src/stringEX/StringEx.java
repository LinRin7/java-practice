package stringEX;

public class StringEx {

	public static void main(String[] args) {
		
		/*
		 * String類別方法(不改變原本字串內容) //str.方法名稱();
		 * char charAt(int index)
		 * int compareTo(String anotherString)
		 * int compareToIgnoreCase(String anotherString)
		 * boolean contains(CharSequence s)//CharSequence參數可以是String StringBuffer
		 * boolean endsWith(String suffix)
		 * void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		 * 		將原字串從srcBegin~srcEnd的字元，複製到dst字元陣列，從dstBegin的位置開始貼上
		 * int indexOf(int ch)//回傳ch自原在字串第一次出現的位置
		 * int lastIndexOf(int ch)//從後開始
		 * int indexOf(int ch, int fromIndex)//從fromIndex開始找 ch
		 * int indexOf(String str)
		 * int indeOf(String str, int fromIndex)
		 * boolean isEmpty()
		 * int length()
		 * String replace(char oldChar, char newChar)//將字串中所有oldChar字元取代為newChar字元
		 * String replace(CharSequence target, CharSequence replacement)//取代為新字串
		 * boolean startsWith(String prefix)
		 * boolean startsWith(String prefix, int toffset)
		 * String substring(int beginIndex)
		 * String subString(int beginIndex, int endIndex)
		 * String toLowerCase()
		 * String toUpperCase()
		 * String trim()//將字串鐘頭、尾端的空白符號去除，包含空白、定位、換行、換頁等字元
		 * 
		 */
		
		/*
		 * StringBuffer類別可看成是"可改變內容的String類別"
		 * StringBuffer物件不能用 + 來連接字串，必須使用append()或insert()
		 * append()//會在字串尾端添加資料。參數可傳入基本型別、String物件、以及其他有定義toString()方法的物件
		 * insert(int offset, )//把資料插入到offset所指定的位置之前。第二個參數可傳入以上型別
		 * StringBuffer delete(int start, int end)
		 * StringBuffer deleteCharAt(int index)
		 * StringBuffer replace(int start, int end, String str)//str~end-1的一段字元取代為str
		 * StringBuffer reverse()//字串反轉
		 * void setCharAt(int index, char ch)//注意 沒有回傳自己
		 * 
		 */
		
	}

}
