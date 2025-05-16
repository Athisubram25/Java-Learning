package collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Merge_Two_Lists_Without_Duplicates {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(2);
		list2.add(3);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		
		Set<Integer> s = new HashSet<>(list1);
		s.addAll(list2);
		System.out.println(s);
	}
	

}
