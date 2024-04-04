package application;

import java.util.Scanner;

public class Day9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
		sc.close();
	}
	
	private static long factorial (int n) {
		if (n < 0) {
			return (Long) null;
		}
		
		long result = 1;
		while (n > 0) {
			result *= n--;
		}
		
		return result;
	}

}
