package com.miss.in;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {

		int a = 0;
		int j = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		a = n;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}

		if (n == j) {
			System.out.println("the given number is armstrong");
		} else {
			System.out.println("the given number is not armstrong");
		}
	}
}
