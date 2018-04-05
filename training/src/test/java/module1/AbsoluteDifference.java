package module1;

import java.util.*;

public class AbsoluteDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Difference difference = new Difference(a);
		difference.computeDifference();
		System.out.print(difference.maximumDifference);
	}
}

class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		Arrays.sort(elements);
		maximumDifference=elements[elements.length-1]-elements[0];
	}
}

/*Sample Input

3
1 2 5*/