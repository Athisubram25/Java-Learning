package List;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_1 
{
	public static void main(String[] args) throws EmptyStackException
	{
		Stack <String> s = new Stack<>();
		try {
		s.push("a");
		s.push("b");
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 System.out.println(s.isEmpty());
		 System.out.println(s.peek());
		}
		catch(EmptyStackException e) {
			System.out.println("Please push something your stack is empty");
		}
		
	}
}
