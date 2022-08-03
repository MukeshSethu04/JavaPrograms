package com.miss.in;

import java.util.Iterator;

public class Reverse {
	public static void Revprogram() {
		String s = "possible";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		Revprogram();
	}

}
