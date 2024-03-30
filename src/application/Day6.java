package application;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		
		for (int i = 1; i <= testCases; i++) {
			String input = scanner.next();
			System.out.println(printChars(input));
		}
		
		scanner.close();

	}
	
	public static String printChars(String input) {
		
		String even = "", odd = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (i %2 == 0) {
				even += input.charAt(i);
			} else {
				odd += input.charAt(i);
			}
		}
		
		return even + " " + odd;
		
	}

}
