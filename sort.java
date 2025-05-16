package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {

	public static void main(String[] args) 
	{
		List<String> l1 =new ArrayList<String>();
		l1.add("banana");
		l1.add("apple");
		l1.add("mango");
		l1.add("grape");
		Collections.sort(l1);
		System.out.println(l1
				);
		
	}

}
