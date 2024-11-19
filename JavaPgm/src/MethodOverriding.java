
class Image
{
	public void Shape()
	{
		System.out.println("Circle");
	}
}

class Image1 extends Image
{
	
	
	public void Shape()
	{
		System.out.println("Tringle");
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Image1 i = new Image1();
		i.Shape();

	}

}
