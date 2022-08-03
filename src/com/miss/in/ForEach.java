package com.miss.in;

public class ForEach {
	public static void main(String[] args) {

		int a[] = new int[5];

		{
			a[0] = 100;
			a[1] = 110;
			a[2] = 120;
			a[3] = 130;
			a[4] = 450;
			for (int i : a) {

				System.out.println(i);

			}
		}

	}
}
