package com.project.euler;

public class Problem4 {

	public static int findReverseOfANumber(int number, int numDigits) {
		int result = 0;
		
		for(int i = 1; i <= numDigits; i++) {
			int a = (int) (number/Math.pow(10, numDigits-i));
			int power = (int) Math.pow(10, i-1);
			result +=  a * power;
			number = (int) (number%Math.pow(10, numDigits-i));
		}
		
		return result;
	}
	
	public static boolean convertToForm(int n, int numdigits) {
		int numToCheck = (int)(Math.pow(10, numdigits)-1);
		while(numToCheck-- >= 100) {
			if(n%numToCheck == 0 && (int)((n/numToCheck)/Math.pow(10, numdigits)) == 0)
				return true;
		}
		return false;
	}
	
	public static int getMaxPalindroneProduct(int power) {
		
		int seed = 0;
		for(int i = 0; i<power; i++) {
			seed = seed * 10 + 9;
		}
		
		int startingNumber = (int)(seed * Math.pow(10, power)) + findReverseOfANumber(seed, power);
		boolean isValid = convertToForm(startingNumber, power);
		
		while(!isValid) {
			seed--;
			startingNumber = (int)(seed * Math.pow(10, power)) + findReverseOfANumber(seed, power);
			if(startingNumber < 0)
				return -1;
			isValid = convertToForm(startingNumber, power);
		}
		return startingNumber;
	}
	
	public static void main(String[] args) {
		System.out.println(getMaxPalindroneProduct(3));
	}	
}