package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Convert_List_to_Map {

	public static void main(String[] args) 
	{
		//String s = "John 85, Alice 90, Bob 78";
		List<String> l= new ArrayList<>(); 
		String[] s = {"john", "alice", "bob"};
        int[] S = {85, 90, 78};	
		Map<String,Integer> m = new HashMap<String,Integer>();	
		
		for(int i=0;i<s.length;i++)
		{
			m.put(s[i],S[i]);
			
			System.out.print(s[i]+" → "+S[i]+" ");
		}
	}

}
