package Calculator_thread;

public class D extends Thread
{
	@Override
	public void run() {
		Calculator cal = new Calculator();
		int d = cal.subtraction(4, 2);
		System.out.println("Substraction = "+d);
		}
}
