package javaAPI;

import java.util.Locale;

public class LocaleEX {

	public static void main(String[] args) {
		
		Locale l = Locale.getDefault();
		System.out.println(l.getDisplayCountry());
		System.out.println(l.getDisplayLanguage());
		
		Locale Italy = Locale.ITALY;
		System.out.println(Italy.getDisplayCountry());
		System.out.println(Italy.getDisplayLanguage());

	}

}
