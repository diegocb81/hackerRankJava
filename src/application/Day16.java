package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String S = bufferedReader.readLine();
		int i;
		try {
			i = Integer.parseInt(S);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
		
		bufferedReader.close();
	}
}
