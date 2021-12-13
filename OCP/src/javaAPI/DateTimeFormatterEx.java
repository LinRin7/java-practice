package javaAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterEx {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		//DateTimeFormatter f = null;
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		//去尾數0
		
		System.out.println(now.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		//2021-249
				
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		//完整日期時間
		
		System.out.println(now.format(DateTimeFormatter
				.ofPattern("EEEE,MMMM,dd,yyyy,hh:m")));
		System.out.println(now.format(DateTimeFormatter
				.ofPattern("西元yyyy- MMMM - dd日  a hh點 m分 ss秒")));
		System.out.println(now.format(DateTimeFormatter
				.ofPattern("西元yyyy- MMMM - dd日  HH點 m分 ss秒")));
		
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
		
	}

}

