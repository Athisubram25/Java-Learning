/* To-Do List Application
Requirement: Implement a basic to-do list using List<String>.
Add tasks.
Mark a task as done (remove it by index).
Print the list of remaining tasks.
Allow the user to update the description of a task at a specific position*/


package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_List 
{
	private static List <String> a = new ArrayList<>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Boolean b = true;
		while(b)
		{
			System.out.println(" To-Do List Menu");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done (Remove by Index)");
            System.out.println("3. Update Task Description");
            System.out.println("4. Print Remaining Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int option = sc.nextInt();
            sc.nextLine();
            switch(option)
            {
            case 1 :
            	System.out.println("Enter new description : ");
            	String task = sc.nextLine();
            	a.add(task);            
            	System.out.println("Task Added");
            	break;
            	
            case 2 : 
            	System.out.println("Enter task index to mark done (0-based) : ");
            	int ir = sc.nextInt();
            	sc.nextLine();
            	if(ir>=0 && ir<a.size())
            	{
            		String removed = a.remove(ir);
            		System.out.println("Removed Task " + removed );
            	}
            	else {
            		System.out.println("Invalid Index !...");
            	}
            	break;
            	
            case 3 : 
            	System.out.println("Enter task index to update (0-based): ");
            	int iu = sc.nextInt();
            	sc.nextLine();
            	if(iu>=0 && iu<a.size())
            	{
            		System.out.println("Enter new description : ");
            		String newDesc = sc.nextLine();
            		a.set(iu, newDesc);
            		System.out.println("Task Updated.");
            	}
            	else {
            		System.out.println("Invalid Index !.....");
            	}
            	break;
            	
            case 4 :
            	System.out.println("Remaining tasks: ");
            	for (int i = 0; i < a.size(); i++) 
            	{
                    System.out.println(i + ": " + a.get(i));
                }
            	break;
            	
            case 5 :
            	b = false;
            	System.out.println("Exiting To-Do List App.");
            	break;
            	
            default :
            	System.out.println("Invalid Option...Try again !...");		
            	}
		}
		sc.close();
	}
}
