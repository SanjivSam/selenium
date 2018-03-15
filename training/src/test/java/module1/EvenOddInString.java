package module1;

public class EvenOddInString {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		// Scanner in = new Scanner(System.in);
		// int i = in.nextInt();
		int i = 2;
//		String result = null;
		String[] s = { "Hacker", "Rank" };
		for (int j = 0; j < s.length; j++) {
			EvenOdd(s[j]);
		}
	}

	public static String EvenOdd(String string) {
		String evn = "";
		String od = "";
		String result;
		char[] etemp = string.toCharArray();
		char[] otemp = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			if (i % 2 == 0) {
				evn = evn + etemp[i];
			} else {
				od = od + otemp[i];
			}
		}
		result = evn + " " + od;
		System.out.println(result);
		return result;
	}
}