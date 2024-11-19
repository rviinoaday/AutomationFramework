class MOL
{
	public void Test(int a, String b)
	{
		System.out.println("calling int and String");
	}
	
	public void Test(String a, int b)
	{
		System.out.println("calling String");
	}
	
	public void Test(int a , long b)

	{
		System.out.println("calling int and long");
	}
	public void Test(int a )

	{
		System.out.println("calling int and long");
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MOL m = new MOL();
		m.Test(10, "Test");
		m.Test("TEst1", 20);
		m.Test(10, 20);
		m.Test(10 );

	}

}
