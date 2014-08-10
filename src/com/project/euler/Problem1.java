package com.project.euler;

/**
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author manoj
 */
public class Problem1 {
	
	public static long sumOfMultiples(int n) {
		long sum = 0l;
		
		for(int i = 1; i * 3 < n; i++) {
			sum += 3*i;
		}
		
		for(int i = 1; i * 5 < n ; i++) {
			if(i%3 == 0) {
				continue;
			}
			sum += 5*i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfMultiples(1000));
	}
}
