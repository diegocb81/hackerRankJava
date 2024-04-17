package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day20 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll
				("\\s+$", "").split(" "))
							.map(Integer::parseInt)
							.collect(Collectors.toList());
		
		// Write your code here
		bubleSort(a);
		
		bufferedReader.close();
	}
	
	public static void bubleSort(List<Integer> a) {
		int swap = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(j) < a.get(i)) {
					swap++;
					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}
		System.out.println("Array is sorted in " + swap + " swaps.");
		System.out.println("First Element: " + a.get(0));
		System.out.println("Last Element: " + a.get(a.size() - 1));;
	}
}
