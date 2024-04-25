package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Day28 {
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0, N).forEach(NItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
				
				String firstName = firstMultipleInput[0];
				
				String emailID = firstMultipleInput[1];
				HashMap<String, String> map = new HashMap<>();
				map.put(firstName, emailID);
				checkRegEx(map);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		bufferedReader.close();
		Collections.sort(list);
		for (String name : list) {
			System.out.println(name);
		}
	}
	
	public static void checkRegEx(HashMap<String, String> map) {
		map.forEach((key, value) -> {
			if (value.endsWith("@gmail.com")) {
				list.add(key);
			}	
			});
	}
}
