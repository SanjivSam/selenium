package module1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// Code to create a set of names.
		// Names will be sorted by their natural order.		
		Set<String> set=new TreeSet<String>();
		set.add("Sasha");
		set.add("John");
		set.add("Stacie");
		set.add("Mike");
		set.add("Mike");
		set.add("Peter");
		
		// Printing elements loaded in SET in console
		for(Iterator<String> iterator=set.iterator();iterator.hasNext();)
		{
			System.out.println("Elements are :"+iterator.next());
		}
		
	}
}

