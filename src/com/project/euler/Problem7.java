package com.project.euler;

import java.util.ArrayList;

public class Problem7 {

	private static ArrayList<Long> primesTillNow = new ArrayList<>();
	
	private static boolean skip(long n) {
		for(long l : primesTillNow) {
			if(n%l == 0) {
				return true;
			}
		}
		return false;
	}
	
	private static long getNextNumberToCheck(long curr) {
		while(skip(curr++));
		return curr-1;
	}
	
	private static boolean isPrime(long n) {
		for(int i = 2; i<= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static long findnthPrime(long n) {
		long curr = 2;
		long next = 0;
		primesTillNow.add(curr);
		n--;
		while(n > 0) {
			next = getNextNumberToCheck(curr);
			curr = next;
			if(isPrime(next)) {
				n--;
				primesTillNow.add(next);
			}
		}
		return curr;
	}
	
	public static void main(String[] args) {
		System.out.println(findnthPrime(10001));
	}
}
