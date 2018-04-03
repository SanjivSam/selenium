package module1;

import java.util.*;
import java.io.*;

class PropagatedExceptionHandling {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}

class Calculator {
	int power(int base, int pow) {
		if (base < 0 || pow < 0)
			throw new IllegalArgumentException("n and p should be non-negative");
		int res = 1;
		res = (int) Math.pow(base, pow);
		return res;
	}
}

// Sample Input
//
// 4
// 3 5
// 2 4
// -1 -2
// -1 3