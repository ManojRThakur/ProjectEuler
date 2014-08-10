package com.project.euler;

public class Problem3 {

	public static long largestPrimeFactor(long n) {
		long i = 2;
		while(n > 1) {
			while(n%i == 0) {
				n = n / i;
			}
			i++;
		}
		return i-1;
	}
	
	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143l));
	}
}