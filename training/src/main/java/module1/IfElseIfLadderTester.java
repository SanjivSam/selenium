package module1;

public class IfElseIfLadderTester {

	public static void main(String[] args) {

		int age = 43;

		if (age >= 60) {
			System.out.println("For senior citizen the interest rate is 11%");
		} else if (age >= 45) {
			System.out.println("For the age " + age + " the interest rate is 10%");
		} else {
			System.out.println("For the age " + age + " the interest rate is 9.5%");

		}

	}
}
