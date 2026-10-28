package programming;

public class ExampleOfCheekedExeption {
	public static void main(String args[])
	{
		
		for(int i=65; i<69;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
