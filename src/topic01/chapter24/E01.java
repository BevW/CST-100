package topic01.chapter24;

import java.util.ArrayList;

public class E01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		
		
		System.out.println("List1 " + list1);
		System.out.println("List2 " + list2);
		if (list1.equals(list1.addAll(list2)))
			System.out.println("False");
		else
			System.out.println("True");
		
		System.out.println("List1 " + list1);
		System.out.println("List1 " +list2);
		if (list1.equals(list1.removeAll(list2)))
			System.out.println("False");
		else
			System.out.println("True");
	
		System.out.println("List1 " + list1);
		System.out.println("List1 " + list2);
		if (list1.equals(list1.retainAll(list2)))
			System.out.println("False");
		else
			System.out.println("True");
	}

}
