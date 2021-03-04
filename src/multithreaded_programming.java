

class Newthread extends Thread
{
	Newthread()
	{
		super("my thread");
		start();
	}
	
	public void run()
	{
		System.out.println(this);
	}
}
public class multithreaded_programming {

	public static void main(String[] args) {
		
		Newthread t=new Newthread();
	}

}
