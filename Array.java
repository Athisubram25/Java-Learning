package java_practice;

import java.util.Iterator;

public class Array 
{
	public static void main(String[] args) 
	{
		int [] num = {5,10,15,20,25};
		int sum = 0;
		
		for(int i=0;i<num.length;i++)
		{
			sum = sum+num[i];
		}
		double avg = sum/num.length;
		
		System.out.println("SUM IS "+sum);
		System.out.println("AVERAGE IS "+avg);
		
	
	}
}
