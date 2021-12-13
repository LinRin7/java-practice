package javaAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		Date d2 = new Date(120, 7, 20);//�~���q1900�}�l�� ���0~11 ��1~31
		System.out.println(d2);
		System.out.print(d.getYear()+1900+"\t");//year
		System.out.print(d.getMonth()+1+"\t");//month
		System.out.print(d.getDate()+"\t");//��
		System.out.println(d.getDay()+"\t");//�P��
		System.out.println("\n");
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime dt2 = LocalDateTime.of(2021, 9, 6, 11, 15);
		System.out.println(dt2);
		System.out.print(dt.getYear()+"\t");//year
		System.out.print(dt.getMonthValue()+"\t");//month 1~12
		System.out.print(dt.getDayOfMonth()+"\t");//�� 1~31
		System.out.print(dt.getDayOfWeek()+"\t");//�P��
		System.out.print(dt.getDayOfYear()+"\t");
		System.out.println("\n");
		
		System.out.println(dt);
		System.out.println(dt.plusDays(5));//�ä��|���ܭ쥻��dt
		System.out.println(dt.plusMonths(3));//�ä��|���ܭ쥻��dt
		System.out.println(dt);
		System.out.println("\n");
		
		LocalDateTime dt3 = LocalDateTime.of(2014, 7, 31, 1, 1);
		System.out.println(dt3.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(dt3.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		
	}

}
