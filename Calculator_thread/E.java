package Calculator_thread;

public class E extends Thread
{
	public void run() 
	{
		System.out.println("Thread started "+ Thread.currentThread().getName());
		System.out.println();
		try {
		
		A add = new A(); 
		int a = add.add();
		System.out.println("Addition = "+ a);
		Thread.sleep(2000);
		
		B div = new B();
		double b = div.division();
		System.out.println("Division = "+ b);
		Thread.sleep(2000);
		
		C multiply = new C();
		int c= multiply.multiply();
		System.out.println("Multiplication = "+ c);
		Thread.sleep(2000);
		
		D sub = new D();
		int d = sub.sub();
		System.out.println("Subtraction = "+ d);
		Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		E thread = new E();
		thread.start();
		thread.join();
		System.out.println();
		System.out.println("Thread FInished");
		

	}
}
