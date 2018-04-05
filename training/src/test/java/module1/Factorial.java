package module1;

import java.util.*;

public class Factorial {
	static int temp = 1;

	static int factorial(int n) {
		if (n == 1)
			temp = temp * n;
		else if (n > 1)
			temp = n * factorial(n - 1);
		else
			temp = 0;
		return temp;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = factorial(n);
		System.out.println(result);
		in.close();
	}
}