package Calculator_thread;

public class A extends Thread
{
	@Override
	public void run()
	{
	
	Calculator cal = new Calculator();
	cal.start();
	try {
		cal.join();
		Thread.sleep(2000);
		int a = cal.add(4, 2);
		System.out.println("Addition = "+a);
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
}
