package module1;

import java.util.*;

public class PrimeNumberTimeComplexity {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		in.close();

	}

	public static boolean isPrime(int n) {
		if (n == 2) { // 2 always prime
			return true;
		}
		if (n == 1 || n % 2 == 0) { // 1 and even always not prime
			return false;
		}
		// start checking with 3 since 1 and 2 are covered above
		for (int i = 3; i * i <= n;) {
			if (n % i == 0) {
				return false;
			}
			i += 2; // no need to check even so increment to next odd number.
		}
		return true;
	}
}

/*
 * Sample Input
 * 
 * 3 12 5 7
 */