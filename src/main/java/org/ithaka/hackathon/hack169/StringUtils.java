package org.ithaka.hackathon.hack169;

public class StringUtils {

	public static Integer len(String in) {
		return in.length();
	}
	
	public static String merge(String str1, String str2) {
		return str1 + str2;
	}
	
	public static Boolean hasText(String str) {
		return org.springframework.util.StringUtils.hasText(str);
	}
}
