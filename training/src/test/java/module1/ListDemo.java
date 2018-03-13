package module1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Code to create a list of names. Use ArrayList.
		List<String> list = new ArrayList<String>();
		list.add("Sasha");
		list.add("John");
		list.add("Stacie");
		list.add("Mike");
		list.add("Peter");

		// Code to print this list
		// Notice the order in which elements get printed.
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println("Elements :" + iterator.next());
		}
	}
}
