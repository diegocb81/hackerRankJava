package application;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Day2 extends Day2Result {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Day2Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
        
    }

}
