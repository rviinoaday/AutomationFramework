package Assignment1;

class charboolean
{
	public void TestChar(char a,boolean b )
	{
		
		System.out.println("Will calling char and Boolean");
	}
	
	public void TestChar(boolean b, char a )
	{
		
		System.out.println("Will calling boolean and char");
	}
	
	public void TestChar(boolean b, char a ,String Rahul)
	{
		
		System.out.println("Will calling boolean and char and String ");
	}
	
	
}


public class AssingmentMethodoverloadingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		charboolean cb = new charboolean();
		cb.TestChar(false, 'v');
		cb.TestChar('m', true);
		cb.TestChar(false,'c' , "Jhon");

	}

}
