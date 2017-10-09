
public class AnotherClass extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
			Thread.sleep(1000);//sleep (ms)
			System.out.println("Hello from the other side.. ");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
