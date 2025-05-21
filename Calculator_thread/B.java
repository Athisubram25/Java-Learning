package Calculator_thread;

public class B extends Thread
{
	@Override
	public void run() {
		Calculator cal = new Calculator();
		double b = cal.division(4, 2);
		System.out.println("Division = "+b);
		}
}
