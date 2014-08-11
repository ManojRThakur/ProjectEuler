package com.project.euler;

public class Problem5 {

	public static long GCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return GCD(b, a%b);
	}
	
	
	public static long LCM(int a, int b) {
		return (a*b)/GCD(a,b);
	}
	
	public static long LCM(int[] numbers) {
		int a = numbers[0];
		int b = numbers[1];
		long ret = LCM(a, b);
		
		for(int i = 2; i < numbers.length; i++) {
			ret = LCM((int)ret, i);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.err.println(LCM(new int[] {1,2,3,4,5,6,7,8,9,10, 11,12,13,14,15,16,17,18,19,20}));
	}
}
