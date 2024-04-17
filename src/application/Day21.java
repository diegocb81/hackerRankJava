package application;

import java.util.Scanner;

class Printer<T> {
	
	public void printArray(T[] A) {
		for (T a : A) {
			System.out.println(a.toString());
		}
	}
}

public class Day21 {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to 
		STDOUT. Your class should be named Day21. */
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		n = scanner.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = scanner.next();
		}
		
		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
		
		scanner.close();
	}
}
