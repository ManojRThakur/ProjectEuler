package com.project.euler;

public class Problem2 {
	
	public static long sumOfEvenElementsInFibonacciSeries(long n) {
		long previous = 1;
		long nextTopPrevious = 0;
		long current = previous + nextTopPrevious;
		long sum = 0l;
		while(current <= n) {
			if(current%2 == 0) {
				sum += current;
			}
			nextTopPrevious = previous;
			previous = current;
			current = previous + nextTopPrevious;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		long sum = sumOfEvenElementsInFibonacciSeries(4000000l);
		System.out.println(sum);
	}
}
