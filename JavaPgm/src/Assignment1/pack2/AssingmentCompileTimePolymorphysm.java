package Assignment1.pack2;


class Display
{
	
	void view(float a) 
	{
		
		System.out.println("Display Float method ");
	}
	
	

	void view(int a) 
	{
		
		System.out.println("Int method "+a);
	}

	void view(String b) 
	{
		
		System.out.println("String method "+b);
	}

	void view(int a , String b) 
	{
		
		System.out.println("Int and String method "+a  +b);
	}
}





public class AssingmentCompileTimePolymorphysm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display ds= new Display ();
		ds.view(2.88f);
		ds.view(12);
		ds.view(12, "Nathan");

	}

}
