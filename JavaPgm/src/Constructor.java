class Cons
{
	
	 Cons(String a)
	{
		System.out.println("Constructor"+"     "+a);
	}
	
	Cons(int a)
	{
		System.out.println("Calling int");
	}
	
	Cons(double b)
	{
		System.out.println("calling Double");
	}
//	public void Image()
//	{
//		System.out.println("Triangle");
//	}
}


public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons c = new Cons(10);
		new Cons("Test");
		new Cons(10.3);
		//c.Image();
	//	c.Cons("ABC");

	}

}
