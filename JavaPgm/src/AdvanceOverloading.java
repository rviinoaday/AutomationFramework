class AOL
{
	public void Test(int a , long b)
	{
		System.out.println("calling int and long");
	}
	
	public void Test(long a , int b)
	{
		System.out.println("calling long and int");
	}
	
	public void Test(int a , double b)
	{
		System.out.println("calling int  and double");
	}
}
public class AdvanceOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AOL a = new AOL();
		a.Test(10, 20L);
		
		a.Test(10, 0.5f);

	}

}
