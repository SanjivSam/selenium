package module1;

import java.util.Scanner;

public class Chocolate {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int[] ondays = null;
		int n = 3;
		int[] ondays = { 1, 2, 3 };
		for (int i = 0; i < n; i++) {
			// ondays[i] = Integer.parseInt(in.nextLine().trim());
			calcChoc(ondays[i]);
		}
		in.close();
	}

	private static void calcChoc(int i) {
		int TotalChoc = 0;
		if (i % 2 == 0) {
			TotalChoc = (i / 2) * (i / 2);
		} else {
			TotalChoc = ((i + 1) / 2) * ((i + 1) / 2);
		}
		System.out.println(TotalChoc);
	}
}