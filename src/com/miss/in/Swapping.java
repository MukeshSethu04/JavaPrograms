package com.miss.in;

public class Swapping {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		System.out.println("variable before swapping " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("variables after swapping " + a + " " + b);
	}

}
