package com.miss.in;

public class Stringg {
	public static void main(String[] args) {
		String s = "  Be live";

		int length = s.length();
		System.out.println(length);
		boolean equals = s.equals("belive");
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("belive");
		System.out.println(equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = s.startsWith("bel");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("ive");
		System.out.println(endsWith);
		boolean contains = s.contains("l");
		System.out.println(contains);
		int indexOf = s.indexOf("v");
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf("l");
		System.out.println(lastIndexOf);
		char charAt = s.charAt(4);
		System.out.println(charAt);
		String replace = s.replace('v', 's');
		System.out.println(replace);
		String substring = s.substring(2);
		System.out.println(substring);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		String trim = s.trim();
		System.out.println(trim);
		String[] split = s.split("");
		for (String str : split) {
			System.out.println(str);
			
		}
		
	}

}
