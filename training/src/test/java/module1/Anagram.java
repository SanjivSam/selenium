package module1;

public class Anagram {
	public static int numberNeeded(String first, String second) {
		int counter = first.length() + second.length();
		int tempcounter = 0;
		char[] big, small;
		if (first.length() > second.length()) {
			big = first.toCharArray();
			small = second.toCharArray();
		} else {
			small = first.toCharArray();
			big = second.toCharArray();
		}
		for (int i = 0; i < big.length - 1; i++) {
			for (int j = 0; j < small.length - 1; j++)
				if (big[i] != small[j])
					tempcounter++;
			if (tempcounter > 0) {
				tempcounter = 0;
				counter--;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		String a = "abcde";
		String b = "dec";
		System.out.println(numberNeeded(a, b));
	}
}