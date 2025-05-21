package Calculator_thread;

public class E extends Thread
{
	public void run() 
	{
		System.out.println("Thread started "+ Thread.currentThread().getName());
		System.out.println();
		try {
		
		A add = new A(); 
		add.run();
		add.join();
		Thread.sleep(2000);
		
		B div = new B();
		div.run();
		div.join();
		Thread.sleep(2000);
		
		C multiply = new C();
		multiply.run();
		multiply.join();
		Thread.sleep(2000);
		
		D sub = new D();
		sub.run();
		sub.join();
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
