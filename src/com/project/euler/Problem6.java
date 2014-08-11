package com.project.euler;

public class Problem6 {
	
	public static long diffOfSquareOfSumofSquareAndSumOfSquare(int n) {
		long sumofsquares = (n * (n+1) * (2*n + 1))/6;
		long sumofnumbers = (long) Math.pow(((n * (n+1))/2),2);
		return sumofnumbers - sumofsquares;
	}
	
	public static void main(String[] args) {
		System.out.println(diffOfSquareOfSumofSquareAndSumOfSquare(100));
	}
}
