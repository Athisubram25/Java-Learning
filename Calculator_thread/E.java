package Calculator_thread;

public class E extends Thread
{
	public static void main(String[] args) throws InterruptedException 
	{
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.start();
		a.join();
		a.sleep(2000);
		
		b.start();
		b.join();
		b.sleep(2000);
		
		c.start();
		c.join();
		c.sleep(2000);
		
		d.start();
		d.join();
		d.sleep(2000);
		
		System.out.println("Thread Finished");

	}
}
