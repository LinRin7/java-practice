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
		//�h����0
		
		System.out.println(now.format(DateTimeFormatter.ISO_ORDINAL_DATE));
		//2021-249
				
		System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		//�������ɶ�
		
		System.out.println(now.format(DateTimeFormatter
				.ofPattern("EEEE,MMMM,dd,yyyy,hh:m")));
		System.out.println(now.format(DateTimeFormatter
				.ofPattern("�褸yyyy- MMMM - dd��  a hh�I m�� ss��")));
		System.out.println(now.format(DateTimeFormatter
				.ofPattern("�褸yyyy- MMMM - dd��  HH�I m�� ss��")));
		
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
		
	}

}

