package application;

import java.util.Scanner;

class Calculator {
    public int power(int n, int p) throws Exception {
        if (n >= 0 || p >= 0) {
            return (int)Math.pow(n, p);
        } else {
            throw new Exception("n and p should be non-negative");
        }

    }
}

public class Day17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }

}
