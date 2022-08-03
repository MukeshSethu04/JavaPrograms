package com.miss.in;

public class Numbers {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		int a[]= {1,2,3,5,6};
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
			
		}
		for (int i = 0; i <=6; i++) {
			sum2=sum2+i;
			
		}
		
		System.out.println("the missing number is "+(sum2-sum1));
	}

}
