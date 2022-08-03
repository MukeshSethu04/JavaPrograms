package com.miss.in;

public class ReversePalindrome {
	public static void palindromee() {
		int num = 54545;
		int a = 0;
		int j = 0;
		int i = 0;
		a = num;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		if (num == j) {
			System.out.println("the given number is a palindrome");

		} else {
			System.out.println("the given number is not a palindrome");
		}
	}

	public static void main(String[] args) {
		palindromee();
	}

}
