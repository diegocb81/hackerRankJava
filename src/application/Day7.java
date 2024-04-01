package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day7 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(bufferedReader.readLine().trim());
	    
	    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	    		.map(Integer::parseInt)
	            .collect(Collectors.toList());
	    printReverse(arr);
	    bufferedReader.close();
	    
	    }

	    public static void printReverse(List<Integer> arr) {
	        for (int i = arr.size() - 1; i >= 0; i--) {
	        	System.out.print(arr.get(i) + " ");
	    }
	        
	}
	    
}

