package Calculator_thread;

public class C extends Thread
{
	@Override
	public void run() {
		Calculator cal = new Calculator();
		int c = cal.multiplication(4, 2);
		System.out.println("Multiplication = "+ c);
		}
}
