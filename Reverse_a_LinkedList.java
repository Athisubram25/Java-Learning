package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse_a_LinkedList {

	public static void main(String[] args) 
	{
		List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		Collections.reverse(l);
		System.out.println(l);
	}

}
