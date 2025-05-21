package Calculator_thread;

public class Calculator extends Thread
{
	public int add(int a , int b) 
	{
		return a+b;		
	}
	public double division(double a , double b)
	{
		return a/b ;
	}
	public int multiplication(int a , int b)
	{
		return a*b;
	}
	public int subtraction(int a , int b)
	{
		return a-b;
	}
	@Override
	public void run()
	{
		System.out.println(" Calculator started");
	}
}
