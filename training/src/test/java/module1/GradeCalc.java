package module1;

import java.util.*;

public class GradeCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;
	int totScr = 0;
	char grade;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	char calculate() {
		for (int i = 0; i < testScores.length; i++) {
			totScr = totScr + testScores[i];
		}
		totScr = totScr / (testScores.length);
		if (totScr >= 1 && totScr < 40)
			grade = 'T';
		else if (totScr >= 40 && totScr < 55)
			grade = 'D';
		else if (totScr >= 55 && totScr < 70)
			grade = 'P';
		else if (totScr >= 70 && totScr < 80)
			grade = 'A';
		else if (totScr >= 80 && totScr < 90)
			grade = 'E';
		else
			grade = 'O';
		return grade;
	}
}


/*
 * Sample Input
 * 
 * Heraldo Memelli 8135627 2 100 80
 */