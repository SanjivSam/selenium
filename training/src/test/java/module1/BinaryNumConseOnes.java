package module1;

import java.util.*;

public class BinaryNumConseOnes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = binar(n);
		System.out.println(result);
		in.close();
	}

	static int binar(int inte) {
		// String arr = Integer.toBinaryString(inte);
		String arr = Integer.toString(inte, 2);
		String[] asd = arr.split("0");
		int result = 0;
		for (int i = 0; i < asd.length; i++) {
			if (result < asd[i].length()) {
				result = asd[i].length();
			}
		}
		/*
		 * char[] arr1 = arr.toCharArray(); int count = 1; for(int
		 * i=0;i<arr1.length-1;i++) { if (arr1[i] == '1' && arr1[i + 1] == '1') count++;
		 * }
		 */
		return result;
	}
}

/*
 * Given a base- integer, , convert it to binary (base-). Then find and print
 * the base- integer denoting the maximum number of consecutive 's in 's binary
 * representation.
 */